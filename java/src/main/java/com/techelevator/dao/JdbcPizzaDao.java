package com.techelevator.dao;

import com.techelevator.model.Customer;
import com.techelevator.model.Pizza;
import com.techelevator.model.Sale;
import com.techelevator.model.Topping;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcPizzaDao implements PizzaDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcPizzaDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Pizza getPizzaById(int pizzaId) {
        Pizza pizza = new Pizza();
        String sql = "SELECT pizza_id, size_id, additional_instructions, img_url, price, is_available " +
                " FROM pizza WHERE pizza.pizza_id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, pizzaId);
        if (results.next()) {
            pizza = mapRowToPizza(results);
        }
        return pizza;
    }

    @Override
    public List<Pizza> getAllPizzas() {
        List<Pizza> pizzaList = new ArrayList<>();
        String sql = "SELECT pizza_id, pizza_name, size_id, additional_instructions, img_url, price, is_available " +
                " FROM pizza ORDER BY pizza_name, pizza_id";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            Pizza pizza = mapRowToPizza(results);
            pizzaList.add(pizza);
        }
        return pizzaList;
    }


    @Override
    public List<Pizza> getAllAvailablePizzas() {
        List<Pizza> pizzaList = new ArrayList<>();
        String sql = "SELECT pizza_id, pizza_name, size_id, additional_instructions, img_url, price, is_available " +
                " FROM pizza WHERE is_available = true ORDER BY pizza_id";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            Pizza pizza = mapRowToPizza(results);
            pizzaList.add(pizza);
        }
        return pizzaList;
    }



    @Override
    public Pizza createPizza(Pizza newPizza) {
        String sql = "INSERT INTO pizza (pizza_id, pizza_name, size_id, additional_instructions, img_url, price, is_available) " +
                "values(?, ?, ?, ?, ?, ?, ?) RETURNING pizza_id;";
        int newId = jdbcTemplate.queryForObject(sql, Integer.class, newPizza.getPizzaId(), newPizza.getPizzaName(), newPizza.getSizeId(), newPizza.getAdditionalInstructions(),
                newPizza.getImgURL(), newPizza.getPrice(), newPizza.isAvailable());
        return getPizzaById(newId);
    }

    @Override
    public void updatePizza(Pizza pizza, int pizza_id) {
        String sql = "UPDATE pizza " +
                "SET pizza_id = ?, pizza_name = ?, size_id = ?, additional_instructions = ?, img_url = ?, price = ?, is_available = ? " +
                "WHERE pizza_id = ?;";
        jdbcTemplate.update(sql, pizza_id, pizza.getPizzaName(), pizza.getSizeId(), pizza.getAdditionalInstructions(), pizza.getImgURL(), pizza.getPrice(), pizza.isAvailable(), pizza_id);

    }

    @Override
    public void deletePizza(int pizza_id) {
        String sql = "DELETE FROM pizza WHERE pizza_id = ?";
        jdbcTemplate.update(sql, pizza_id);
    }

    @Override
    public List<Pizza> getPizzaBySaleId(int saleId) {
        List<Pizza> pizzaList = new ArrayList<>();
        String sql = "SELECT pizza.pizza_id, pizza_name, size_id, price, is_specialty, img_url, additional_instructions, is_available " +
                " FROM pizza JOIN pizza_sale ON " +
                " pizza.pizza_id = pizza_sale.pizza_id " +
                " WHERE pizza_sale.sale_id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, saleId);
        while(results.next()){
            Pizza pizza = mapRowToPizza(results);
            pizzaList.add(pizza);
        }
        return pizzaList;
    }


    @Override
    public List<Pizza> getPizzaBySizeId(String sizeId) {
        List<Pizza> pizzaList = new ArrayList<>();
        String sql = "SELECT pizza.pizza_id, pizza_name, size_id, price, is_specialty, img_url, additional_instructions, is_available " +
                " FROM pizza " +
                " WHERE pizza.size_id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, sizeId);
        while(results.next()){
            Pizza pizza = mapRowToPizza(results);
            pizzaList.add(pizza);
        }
        return pizzaList;
    }



    @Override
    public List<Pizza> getAvailablePizzasBySizeId(String sizeId) {
            List<Pizza> pizzaList = new ArrayList<>();
            String sql = "SELECT pizza.pizza_id, pizza_name, size_id, price, is_specialty, img_url, additional_instructions, is_available " +
                    " FROM pizza " +
                    " WHERE pizza.size_id = ? AND is_available = true";
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, sizeId);
            while(results.next()){
                Pizza pizza = mapRowToPizza(results);
                pizzaList.add(pizza);
            }
            return pizzaList;
        }




    public Pizza mapRowToPizza(SqlRowSet rowSet) {
        try {
            return new Pizza(rowSet.getInt("pizza_id"),
                    rowSet.getString("pizza_name"),
                    rowSet.getString("size_id"),
                    rowSet.getString("additional_instructions"),
                    rowSet.getBigDecimal("price"),
                    rowSet.getString("img_url"),
                    rowSet.getBoolean("is_available"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
