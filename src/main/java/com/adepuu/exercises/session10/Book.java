package com.adepuu.exercises.session10;

public class Book extends LibraryMaterial {
    private final String author;

    Book(String title, String author, int availability) {
        super(title, availability);
        this.author = author;
    }

    @Override
    public void displayStatus(String title) {
        super.displayStatus(title);
        System.out.println("Author: " + author);
    }
}
