package com.techelevator.controller;

import com.techelevator.dao.CustomerDao;
import com.techelevator.dao.JdbcCustomerDao;
import com.techelevator.model.Customer;
import com.techelevator.model.UserNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CustomerController {
    private CustomerDao customerDao;

    public CustomerController(JdbcCustomerDao customerDao){
        this.customerDao = customerDao;
    }

    @RequestMapping(path = "/customer/{id}", method = RequestMethod.GET)
    public Customer getCustomerById(@PathVariable int id) throws UserNotFoundException {
        return customerDao.getCustomerById(id);
    }

    @RequestMapping(path = "/customer", method = RequestMethod.GET)
    public List<Customer> getAllCustomers() throws UserNotFoundException {
        return customerDao.getAllCustomers();
    }

    @RequestMapping(path= "/customer", method = RequestMethod.POST)
    public Customer createCustomer(@RequestBody Customer customer){
        return customerDao.createCustomer(customer);
    }

    @RequestMapping(path = "/customer", method = RequestMethod.PUT)
    public void updateCustomer(@RequestBody Customer customer){
        customerDao.updateCustomer(customer, customer.getCustomerId());
    }

    @RequestMapping(path = "/customer/{id}/delete", method = RequestMethod.PUT)
    public void deleteCustomer(@PathVariable int id){
        customerDao.deleteCustomer(id);
    }
}
