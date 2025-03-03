package com.adepuu.exercises.session10;

public class Book extends LibraryMaterial{
    private String author;

    public Book(String title, String author, int qty){
        super(title, qty);
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }

}
