package com.techelevator.dao;

import com.techelevator.model.Address;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.ArrayList;
import java.util.List;

public class JdbcAddressDao implements AddressDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public Address getAddressById(int addressId){
        Address address = new Address();
        String sql = "SELECT address_id, street, city, zip_code, address_type, user_id, address_type_id " +
                " FROM address WHERE address_id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, addressId);
        if(results.next()) {
            address = mapRowToAddress(results);
        }
        return address;
    }

    @Override
    public List<Address> getAllAddresses(){
        List<Address> addressList = new ArrayList<>();
        String sql =  "SELECT address_id, street, city, zip_code, address_type, user_id, address_type_id " +
                " FROM address";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()){
            Address address = mapRowToAddress(results);
            addressList.add(address);
        }
        return addressList;
    }

    @Override
    public Address createAddress(Address newAddress) {
        String sql = "INSERT INTO address (address_id, street, city, zip_code, user_id, address_type_id" +
                "values(?, ?, ?, ?, ?, ?) RETURNING address_id;";
        int newId = jdbcTemplate.queryForObject(sql, Integer.class, newAddress.getAddressId(), newAddress.getStreetAddress(), newAddress.getCity(), newAddress.getZipCode(), newAddress.getUser_id(), newAddress.getAddressTypeId());
        return getAddressById(newId);
    }

    @Override
    public void updateAddress(Address address, int addressId) {
        String sql = "UPDATE address " +
                "address_id = ?, street = ?, city = ?, zip_code, user_id, address_type_id " +
                "WHERE (address_id) = ?;";
        jdbcTemplate.update(sql, address.getAddressId(), address.getStreetAddress(), address.getCity(), address.getZipCode(), address.getUser_id(), address.getAddressTypeId());
    }

    @Override
    public void deleteAddress(int address_id){
        String sql = "DELETE FROM address WHERE address_id = ?";
        jdbcTemplate.update(sql, address_id);
    }


    public Address mapRowToAddress(SqlRowSet rowSet){
        try {
            return new Address(rowSet.getInt("address_id"),
                    rowSet.getInt("street"),
                    rowSet.getString("city"),
                    rowSet.getString("zip_code"),
                    rowSet.getString("address_type"),
                    rowSet.getInt("user_id"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }


}
