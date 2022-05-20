package com.techelevator.controller;

import com.techelevator.dao.JdbcPizzaDao;
import com.techelevator.dao.JdbcPizzaToppingDao;
import com.techelevator.dao.PizzaToppingDao;
import com.techelevator.model.PizzaTopping;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class PizzaToppingController {
    private PizzaToppingDao pizzaToppingDao;
    public PizzaToppingController(JdbcPizzaToppingDao pizzaToppingDao) {
        this.pizzaToppingDao = pizzaToppingDao;
    }

    @RequestMapping(path="/pizzatopping", method = RequestMethod.POST)
    public void createPizzaTopping(@RequestBody PizzaTopping pizzaTopping){
        pizzaToppingDao.createPizzaTopping(pizzaTopping);
    }

    @RequestMapping(path="/pizzatopping/{pizza_id}", method = RequestMethod.DELETE)
    public void deletePizzaTopping(@PathVariable int pizza_id){
        pizzaToppingDao.deletePizzaTopping(pizza_id);
    }

}
