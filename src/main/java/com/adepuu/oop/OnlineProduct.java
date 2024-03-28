package com.adepuu.oop;

public class OnlineProduct {
    private String name;
    private double price;
    private float discount;
    private int category = 1;

    OnlineProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setDiscount(float newDiscount) {
        if (newDiscount <= 0) {
            return;
        }

        if (category == 1 && newDiscount > 15) {
            return;
        }
        this.discount = newDiscount;
    }

    public double getPrice() {
        var finalPrice = this.price - (this.price*(this.discount/100));
        return finalPrice;
    }
}
