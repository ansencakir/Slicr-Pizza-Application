package com.techelevator.model;

public class Customer {

    private int customerId, userId;
    private String firstName, lastName, phoneNumber, emailAddress;
    private boolean emailOffers;

    public Customer() {
    }

    public Customer(int customerId, int userId, String firstName, String lastName, String phoneNumber, String emailAddress, boolean emailOffers) {
        this.customerId = customerId;
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.emailOffers = emailOffers;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public boolean isEmailOffers() {
        return emailOffers;
    }

    public void setEmailOffers(boolean emailOffers) {
        this.emailOffers = emailOffers;
    }
}
