package com.techelevator.controller;

import com.techelevator.dao.JdbcPizzaDao;
import com.techelevator.dao.PizzaDao;
import com.techelevator.model.Customer;
import com.techelevator.model.Pizza;
import com.techelevator.model.Topping;
import com.techelevator.model.UserNotFoundException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
public class PizzaController {
    private PizzaDao pizzaDao;

    public PizzaController(JdbcPizzaDao pizzaDao) {
        this.pizzaDao = pizzaDao;
    }

    @RequestMapping(path = "/pizza/{id}", method = RequestMethod.GET)
    public Pizza getPizzaById(@PathVariable int id) throws UserNotFoundException {
        return pizzaDao.getPizzaById(id);
    }

    @RequestMapping(path = "/pizza", method = RequestMethod.GET)
    public List<Pizza> getAllPizzas() throws UserNotFoundException {
        return pizzaDao.getAllPizzas();
    }

    @RequestMapping(path = "/pizza/available", method = RequestMethod.GET)
    public List<Pizza> getAllAvailablePizzas() throws UserNotFoundException {
        return pizzaDao.getAllAvailablePizzas();
    }


    @RequestMapping(path= "/pizza", method = RequestMethod.POST)
    public Pizza createPizza(@RequestBody Pizza pizza){
        return pizzaDao.createPizza(pizza);
    }

    @RequestMapping(path = "/pizza/{id}", method = RequestMethod.PUT)
    public void updatePizza(@RequestBody Pizza pizza,@PathVariable int id){
        pizzaDao.updatePizza(pizza, id);
    }

    @RequestMapping(path = "/pizza/{id}", method = RequestMethod.DELETE)
    public void deletePizza(@PathVariable int id) {
        pizzaDao.deletePizza(id);
    }

    @RequestMapping(path = "/pizza/sale/{id}", method = RequestMethod.GET)
    public List<Pizza> getPizzaBySaleId(@PathVariable int id) throws UserNotFoundException {
        return pizzaDao.getPizzaBySaleId(id);
    }


    @RequestMapping(path = "/pizza/size/{id}", method = RequestMethod.GET)
    public List<Pizza> getPizzaBySizeId(@PathVariable String id) throws UserNotFoundException {
        return pizzaDao.getPizzaBySizeId(id);
    }

    @RequestMapping(path = "/pizza/available/size/{id}", method = RequestMethod.GET)
    public List<Pizza> getAvailablePizzaBySizeId(@PathVariable String id) throws UserNotFoundException {
        return pizzaDao.getAvailablePizzasBySizeId(id);
    }
}

