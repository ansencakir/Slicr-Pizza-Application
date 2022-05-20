package com.techelevator.model;

import java.math.BigDecimal;

public class Topping {

    private String toppingName;
    private BigDecimal additionalPrice;
    private boolean isVegetable;


    public Topping() {
    }

    public Topping(String toppingName) {
        this.toppingName = toppingName;
    }

    public Topping(String toppingName, BigDecimal additionalPrice, boolean isVegetable) {
        this.toppingName = toppingName;
        this.additionalPrice = additionalPrice;
        this.isVegetable = isVegetable;
    }

    public String getToppingName() {
        return toppingName;
    }

    public boolean isVegetable() {
        return isVegetable;
    }

    public void setVegetable(boolean vegetable) {
        isVegetable = vegetable;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    public BigDecimal getAdditionalPrice() {
        return additionalPrice;
    }

    public void setAdditionalPrice(BigDecimal additionalPrice) {
        this.additionalPrice = additionalPrice;
    }


}
