package com.techelevator.dao;

import com.techelevator.model.Customer;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcCustomerDao implements CustomerDao{
    private JdbcTemplate jdbcTemplate;

    public JdbcCustomerDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Customer getCustomerById(int customerId){
        Customer customer = new Customer();
        String sql = "SELECT customer_id, first_name, last_name,  phone_number, email_address, email_offers, user_id " +
                " FROM customer WHERE customer.customer_id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, customerId);
        if(results.next()) {
            customer = mapRowToCustomer(results);
        }
        return customer;
    }

    @Override
    public List<Customer> getAllCustomers(){
        List<Customer> customerList = new ArrayList<>();
        String sql = "SELECT customer_id, first_name, last_name, phone_number, email_address, email_offers, user_id " +
                " FROM customer ";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()){
            Customer customer = mapRowToCustomer(results);
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public Customer createCustomer(Customer newCustomer) {
        String sql = "INSERT INTO customer (customer_id, first_name, last_name,phone_number, email_address, email_offers, user_id) " +
                "values(?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING customer_id;";
        int newId = jdbcTemplate.queryForObject(sql, Integer.class, newCustomer.getCustomerId(), newCustomer.getFirstName(), newCustomer.getLastName(),
                 newCustomer.getPhoneNumber(), newCustomer.getEmailAddress(), newCustomer.isEmailOffers(), newCustomer.getUserId());
        return getCustomerById(newId);
    }

    @Override
    public void updateCustomer(Customer customer, int customer_id) {
        String sql = "UPDATE customer SET " +
                    "customer_id = ?, first_name = ?, last_name = ?, street_address = ?, city = ?, phone_number = ?, email_address = ?, email_offers = ?, user_id = ? " +
                    "WHERE (customer_id) = ?;";
        jdbcTemplate.update(sql, customer.getCustomerId(), customer.getFirstName(), customer.getLastName(),
                customer.getPhoneNumber(), customer.getEmailAddress(), customer.isEmailOffers(), customer.getUserId(), customer_id);

    }

    @Override
    public void deleteCustomer(int id){
        String sql = "DELETE FROM customer WHERE customer.customer_id = ?";
        jdbcTemplate.update(sql, id);
    }

    public Customer mapRowToCustomer(SqlRowSet rowSet){
        try {
            return new Customer(rowSet.getInt("customer_id"),
                    rowSet.getInt("user_id"),
                    rowSet.getString("first_name"),
                    rowSet.getString("last_name"),
                    rowSet.getString("phone_number"),
                    rowSet.getString("email_address"),
                    rowSet.getBoolean("email_offers"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
