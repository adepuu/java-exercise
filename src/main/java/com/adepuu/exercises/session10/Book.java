package com.adepuu.exercises.session10;

public class Book {
    private String bookName;
    private String bookAuthor;
    private int bookQuantity;
    private int initialBookQuantity;
    public Book(String bookName, String bookAuthor, int initialBookQuantity) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.initialBookQuantity = initialBookQuantity;
        this.bookQuantity = initialBookQuantity;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public int getInitialBookQuantity() {
        return initialBookQuantity;
    }

    public void borrowBook() {
        if (bookQuantity > 0) {
            bookQuantity -= 1;
        }
    }
    public void returnBook() {
        bookQuantity += 1;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + bookName + ", Book Author: " + bookAuthor + ", Book Availability: " + bookQuantity);
        if (bookQuantity < 1) {
            System.out.println("There's no more book left for borrow.");
        }
        if (bookQuantity == 1) {
            System.out.println("There's one book left to borrow! Hurry before you're missing it out.");
        }
        if (bookQuantity > 1) {
            System.out.println("There are still many books available (" + bookQuantity + " ea left). Please do note that you can only borrow 1 book.");
        }
    }
}