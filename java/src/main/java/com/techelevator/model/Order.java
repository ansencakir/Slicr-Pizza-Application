package com.techelevator.model;

import java.util.List;

public class Order {

    private int saleId;
    private List<Pizza> newOrders;

    public Order() {
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public List<Pizza> getIncomingOrders() {
        return newOrders;
    }

    public void setIncomingOrders(List<Pizza> incomingOrders) {
        this.newOrders = incomingOrders;
    }
}



