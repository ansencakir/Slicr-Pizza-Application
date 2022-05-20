package com.techelevator.controller;

import com.techelevator.dao.AddressDao;
import com.techelevator.dao.JdbcAddressDao;
import com.techelevator.model.Address;
import com.techelevator.model.Customer;
import com.techelevator.model.UserNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


public class AddressController {

    private AddressDao addressDao;

    public AddressController(JdbcAddressDao addressDao) {this.addressDao = addressDao; }

    @RequestMapping(path = "/address/{id}", method = RequestMethod.GET)
    public Address getAddressById(@PathVariable int id) throws UserNotFoundException {
        return addressDao.getAddressById(id);
    }

    @RequestMapping(path = "/address", method = RequestMethod.GET)
    public List<Address> getAllAddresses() throws UserNotFoundException {
        return addressDao.getAllAddresses();
    }

    @RequestMapping(path= "/address", method = RequestMethod.POST)
    public Address createAddress(@RequestBody Address address){
        return addressDao.createAddress(address);
    }

    @RequestMapping(path = "/customer", method = RequestMethod.PUT)
    public void updateAddress(@RequestBody Address address){
        addressDao.updateAddress(address, address.getAddressId());
    }

    @RequestMapping(path = "/address/{id}/delete", method = RequestMethod.PUT)
    public void deleteAddress(@PathVariable int id){
        addressDao.deleteAddress(id);
    }
}
