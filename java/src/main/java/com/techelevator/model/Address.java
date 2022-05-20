package com.techelevator.model;

public class Address {

    private int addressId, addressTypeId, userId;
    private String streetAddress, city, zipCode;

    public Address() {
    }

    public Address(int addressId, int userId, String streetAddress, String city, String zipCode, int addressTypeId) {
        this.addressId = addressId;
        this.addressTypeId = addressTypeId;
        this.userId = userId;
        this.streetAddress = streetAddress;
        this.city = city;
        this.zipCode = zipCode;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getAddressTypeId() {
        return addressTypeId;
    }

    public void setAddressTypeId(int addressTypeId) {
        this.addressTypeId = addressTypeId;
    }

    public int getUser_id() {
        return userId;
    }

    public void setUser_id(int user_id) {
        this.userId = user_id;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}

