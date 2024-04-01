package com.adepuu.exercises.session10;

public class Ebooks extends Reading{
    private String accessLink;

    public Ebooks(int stock, int pages, String title, String author, String accessLink) {
        super(stock, title, author,pages);
        this.accessLink = accessLink;
    }

    @Override
    public void borrowItem() {
        if (stock > 0) {
            System.out.printf("You can access your item in: %s\n", this.accessLink);
            this.stock = stock - 1;
            this.borrowed = borrowed + 1;
        } else {
            System.out.println("Sorry this item is currently not available!");
        }

    }

    @Override
    public void returnItem() {
        System.out.printf("Thank you! Your access link to %s will be revoked!\n", this.title);
        this.stock = stock + 1;
        this.borrowed = borrowed - 1;
    }
}