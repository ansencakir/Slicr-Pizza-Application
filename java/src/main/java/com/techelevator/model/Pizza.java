package com.techelevator.model;

import java.math.BigDecimal;

public class Pizza {

    private int pizzaId;
    private String sizeId, additionalInstructions;
    private BigDecimal price;
    private String pizzaName, imgURL;
    private boolean isAvailable;

    public Pizza() {
    }

    public Pizza(int pizzaId, String pizzaName, String sizeId, String additionalInstructions, BigDecimal price, String imgURL, boolean isAvailable) {
        this.pizzaId = pizzaId;
        this.pizzaName = pizzaName;
        this.sizeId = sizeId;
        this.additionalInstructions = additionalInstructions;
        this.price = price;
        this.imgURL = imgURL;
        this.isAvailable = isAvailable;
    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public int getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(int pizzaId) {
        this.pizzaId = pizzaId;
    }


    public String getSizeId() {
        return sizeId;
    }

    public void setSizeId(String sizeId) {
        this.sizeId = sizeId;
    }


    public String getAdditionalInstructions() {
        return additionalInstructions;
    }

    public void setAdditionalInstructions(String additionalInstructions) {
        this.additionalInstructions = additionalInstructions;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
