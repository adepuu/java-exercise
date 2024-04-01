package com.adepuu.exercises.session10;

import java.util.UUID;

abstract class Material implements Borrowable {
    private String id;
    private String title;
    private String author;
    private int stock;

    public Material(String title, String author, int stock) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public void borrowItem() {
        if(stock > 0) {
            System.out.println(title + " has been borrowed");
            stock -= 1;
        } else {
            System.out.println(title + " out of stock");
        }
    }

    public void returnItem() {
        stock += 1;
        System.out.println(title + " has been returned");
    }

}
