package com.adepuu.exercises.session10;

import java.sql.SQLOutput;

public class Bible extends Book {
    private String religionName;

    public Bible(String bookName, String bookAuthor, int bookQuantity, String religionName) {
        super(bookName, bookAuthor, bookQuantity);
        this.religionName = religionName;
    }
    public String getReligionName() {
        return religionName;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Religion: " + religionName);
    }

    @Override
    public void borrowBook() {
        if (getBookQuantity() <= 0) {
            System.out.println("No more Bible available to be borrowed");
        } else {
            super.borrowBook();
            System.out.println("You have borrowed the " + getBookName() + " book.");
        }
    }
    @Override
    public void returnBook() {
        if (getBookQuantity() >= getInitialBookQuantity()) {
            System.out.println("You might be returning your book to the wrong library. We already have all the books in stock.");
        } else {
           super.returnBook();
            System.out.println("Thank you for returning the borrowed book.");
        }
    }
}