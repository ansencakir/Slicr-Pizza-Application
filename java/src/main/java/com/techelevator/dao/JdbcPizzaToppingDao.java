package com.techelevator.dao;

import com.techelevator.model.*;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcPizzaToppingDao implements PizzaToppingDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcPizzaToppingDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createPizzaTopping(PizzaTopping pizzaTopping){
        String sql = "INSERT INTO pizza_topping (pizza_id, topping_name) " +
                "values(?, ?) RETURNING pizza_id;";
        int newId = jdbcTemplate.queryForObject(sql, Integer.class, pizzaTopping.getPizzaId(), pizzaTopping.getToppingName());
    }

    @Override
    public void deletePizzaTopping(int pizza_id){
        String sql = "DELETE FROM pizza_topping WHERE pizza_id = ?";
        jdbcTemplate.update(sql, pizza_id);
    }

    public PizzaTopping mapRowToPizzaTopping(SqlRowSet rowSet) {
        try {
            return new PizzaTopping(rowSet.getInt("pizza_id"),
                    rowSet.getString("topping_name"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
