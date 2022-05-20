package com.techelevator.dao;

import com.techelevator.model.Customer;
import java.util.List;
import java.util.ArrayList;

public interface CustomerDao {
    public Customer getCustomerById(int customerId);

    public List<Customer> getAllCustomers();

    public Customer createCustomer(Customer newCustomer);

    public void updateCustomer(Customer customer, int customer_id);

    public void deleteCustomer(int id);
}
