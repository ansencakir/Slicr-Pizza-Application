package com.techelevator.dao;

import com.techelevator.model.Topping;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcToppingDao implements ToppingDao{
    private JdbcTemplate jdbcTemplate;

    public JdbcToppingDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Topping getToppingByName(String toppingName){
        Topping topping = new Topping();
        String sql = "SELECT topping_name, additional_price " +
                " FROM topping WHERE topping_name= ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, toppingName);
        if(results.next()) {
            topping = mapRowToTopping(results);
        }
        return topping;
    }

    @Override
    public List<Topping> getAllToppings(){
        List<Topping> toppingList = new ArrayList<>();
        String sql = "SELECT topping_name, additional_price, is_vegetable " +
                " FROM topping ";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()){
            Topping topping = mapRowToTopping(results);
            toppingList.add(topping);
        }
        return toppingList;
    }

    @Override
    public List<Topping> getToppingsByPizzaId(int pizzaId) {
        List<Topping> toppingList = new ArrayList<>();
        String sql = "SELECT topping_name " +
                " FROM pizza JOIN pizza_topping ON " +
                " pizza.pizza_id = pizza_topping.pizza_id " +
                " WHERE pizza.pizza_id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, pizzaId);
        while(results.next()){
            Topping topping = mapRowToToppingName(results);
            toppingList.add(topping);
        }
        return toppingList;
    }

    @Override
    public List<Topping> getToppingsByType(boolean isVegetable) {
        List<Topping> toppingList = new ArrayList<>();

        String sql = "SELECT topping_name, additional_price, is_vegetable " +
                "FROM topping " +
                "WHERE is_vegetable = ? ";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, isVegetable);
        while (results.next()) {
            Topping topping = mapRowToTopping(results);
            toppingList.add(topping);
        }
        return toppingList;
    }



    //create topping
    @Override
    public Topping create(Topping topping) {
        String sql = "INSERT INTO topping (topping_name, additional_price) " +
                "values(?, ?) RETURNING topping_id;";
        String newName = jdbcTemplate.queryForObject(sql, String.class, topping.getToppingName(), topping.getAdditionalPrice());
        return getToppingByName(newName);
    }


    public Topping mapRowToTopping(SqlRowSet rowSet){
        try {
            return new Topping(rowSet.getString("topping_name"),
                    rowSet.getBigDecimal("additional_price"),
                    rowSet.getBoolean("is_vegetable"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Topping mapRowToToppingName(SqlRowSet rowSet){
        try {
            return new Topping(rowSet.getString("topping_name"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
