package com.techelevator.model;

import java.math.BigDecimal;

public class Sale {

    private int saleId, customerId;
    private BigDecimal total;
    private boolean isDelivery;

    public Sale() {
    }

    public Sale(int saleId, int customerId, BigDecimal total, boolean isDelivery) {
        this.saleId = saleId;
        this.customerId = customerId;
        this.total = total;
        this.isDelivery = isDelivery;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public boolean isDelivery() {
        return isDelivery;
    }

    public void setDelivery(boolean delivery) {
        isDelivery = delivery;
    }
}
