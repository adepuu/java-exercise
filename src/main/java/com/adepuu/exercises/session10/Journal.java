package com.adepuu.exercises.session10;

public class Journal extends LibraryMaterial{
    private String author;
    private String university;

    public Journal(String title, String author, String university, int qty){
        super(title, qty);
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
}