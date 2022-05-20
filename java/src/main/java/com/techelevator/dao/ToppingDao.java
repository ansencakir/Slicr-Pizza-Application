package com.techelevator.dao;

import com.techelevator.model.Size;
import com.techelevator.model.Topping;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public interface ToppingDao {


    List<Topping> getAllToppings();

    Topping create(Topping topping);

    List<Topping> getToppingsByPizzaId(int pizzaId);

    List<Topping> getToppingsByType(boolean isVegetable);


     Topping getToppingByName(String toppingName);


}
