package com.techelevator.controller;

import com.techelevator.dao.JdbcSaleDao;
import com.techelevator.dao.SaleDao;
import com.techelevator.model.Customer;
import com.techelevator.model.Pizza;
import com.techelevator.model.Sale;
import com.techelevator.model.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
public class SaleController {
    private SaleDao saleDao;

    public SaleController(JdbcSaleDao saleDao){
        this.saleDao = saleDao;
    }

    @RequestMapping(path = "/sale/{id}", method = RequestMethod.GET)
    public Sale getSaleById(@PathVariable int id) throws UserNotFoundException {
        return saleDao.getSaleById(id);
    }

    @RequestMapping(path = "/sale", method = RequestMethod.GET)
    public List<Sale> getAllSales() throws UserNotFoundException {
        return saleDao.getAllSales();
    }
//    //create sale
    @RequestMapping(path= "/sale", method = RequestMethod.POST)
    public Sale createSale(@RequestBody Sale sale){
    return saleDao.createSale(sale);
    }

    //delete sale
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @RequestMapping(path = "/sale/{id}", method = RequestMethod.DELETE)
//    public void delete(@PathVariable int id) {
//        saleDao.delete(id);
//    }

    //update sale
//    @RequestMapping(path = "/sale/{id}", method = RequestMethod.PUT)
//    public Sale update(@Valid @RequestBody Sale sale, @PathVariable int id) {
//        return saleDao.update(sale, id);
//    }




       }


