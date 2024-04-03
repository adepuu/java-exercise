package com.adepuu.exercises.session10;

public class Magazine extends LibraryManagement{

    private String name;
    private double price;
    protected Magazine(int availabilityCount, String name, double price) {
        super(availabilityCount, name, price);
        this.price = price;
    }
}
