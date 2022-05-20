package com.techelevator.dao;

import com.techelevator.model.Address;
import com.techelevator.model.Customer;

import java.util.List;

public interface AddressDao {
    public Address getAddressById(int addressId);

    public List<Address> getAllAddresses();

    public Address createAddress(Address newAddress);

    public void updateAddress(Address address, int addressId);

    public void deleteAddress(int addressId);

}


