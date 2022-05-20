package com.techelevator.dao;

import com.techelevator.model.Customer;
import com.techelevator.model.Pizza;
import com.techelevator.model.Topping;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public interface PizzaDao {
     Pizza getPizzaById(int pizzaId);

     List<Pizza> getAllPizzas();
     List<Pizza> getAllAvailablePizzas();

     Pizza createPizza(Pizza pizza);

     void updatePizza(Pizza pizza, int pizza_id);

     void deletePizza(int pizzaId);

     List<Pizza> getPizzaBySaleId(int saleId);

     List<Pizza> getAvailablePizzasBySizeId(String sizeId);
     List<Pizza> getPizzaBySizeId(String sizeId);
}
