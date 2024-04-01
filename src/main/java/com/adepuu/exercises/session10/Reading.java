package com.adepuu.exercises.session10;

public abstract class Reading implements Materials{

    protected int stock;
    protected int borrowed;
    protected int pages;
    protected String title;
    protected String author;

    public Reading(int stock, String title, String author, int pages) {
        this.stock = stock;
        this.borrowed = 0;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    //Constructor Overloading
    public Reading(int stock, String title, int pages) {
        this.stock = stock;
        this.borrowed = 0;
        this.title = title;
        this.pages = pages;
    }

    @Override
    public void borrowItem() {
        if (stock > 0) {
            System.out.printf("Borrowed %s \n", this.title);
            this.stock = this.stock - 1;
            this.borrowed = this.borrowed + 1;
        } else {
            System.out.printf("%s is currently not available", this.title);
        }
    }

    @Override
    public void returnItem() {
        System.out.printf("Returned %s\n", this.title);
        this.stock = this.stock + 1;
        this.borrowed = this.borrowed - 1;
    }
    @Override
    public void printStatus() {
        System.out.printf("Title: %s\n", this.title);
        System.out.printf("Stock: %d\n", this.stock);
        System.out.printf("Borrowed: %d\n", this.borrowed);
    }
}