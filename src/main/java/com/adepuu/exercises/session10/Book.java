package com.adepuu.exercises.session10;

public class Book extends Material implements Borrowable {
    private int pages;
    public Book(String title, String author, int stock, int pages) {
        super(title, author, stock);
        this.pages = pages;
    }

    @Override
    public void borrowItem() {
        if(getStock() > 0) {
            System.out.println("Book " + getTitle() + " has been borrowed");
            setStock(getStock() - 1);
        } else {
            System.out.println("Book " + getTitle() + " out of stock");
        }
    }
}
