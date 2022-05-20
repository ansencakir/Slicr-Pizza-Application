package com.techelevator.controller;

import com.techelevator.dao.JdbcToppingDao;
import com.techelevator.dao.ToppingDao;
import com.techelevator.model.Topping;
import com.techelevator.model.UserNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ToppingController {
    private ToppingDao toppingDao;

    public ToppingController(JdbcToppingDao ToppingDao){
        this.toppingDao = ToppingDao;
    }

    @RequestMapping(path = "/topping", method = RequestMethod.GET)
    public List<Topping> getAllToppings() throws UserNotFoundException {
        return toppingDao.getAllToppings();
    }

    @RequestMapping(path = "/pizza/topping/{id}", method = RequestMethod.GET)
    public List<Topping> getAllToppingsByPizzaId(@PathVariable int id) throws UserNotFoundException {
        return toppingDao.getToppingsByPizzaId(id);
    }

    @RequestMapping(path = "/topping/{isVegetable}", method = RequestMethod.GET)
    public List<Topping> getToppingsByType(@PathVariable boolean isVegetable) throws UserNotFoundException {
        return toppingDao.getToppingsByType(isVegetable);
    }




}
