package com.techelevator.dao;

import com.techelevator.model.PizzaTopping;

public interface PizzaToppingDao {
    void createPizzaTopping(PizzaTopping pizzaTopping);

    void deletePizzaTopping(int pizza_id);
}
