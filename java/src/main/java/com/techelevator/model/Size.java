package com.techelevator.model;

import java.math.BigDecimal;

public class Size {
    private String sizeId, sizeDescription;
    private int diameter;
    private BigDecimal basePrice;

    public Size() {
    }

    public Size(String sizeId, String sizeDescription, int diameter, BigDecimal basePrice) {
        this.sizeId = sizeId;
        this.sizeDescription = sizeDescription;
        this.diameter = diameter;
        this.basePrice = basePrice;
    }

    public String getSizeId() {
        return sizeId;
    }

    public void setSizeId(String sizeId) {
        this.sizeId = sizeId;
    }

    public String getSizeDescription() {
        return sizeDescription;
    }

    public void setSizeDescription(String sizeDescription) {
        this.sizeDescription = sizeDescription;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }
}
