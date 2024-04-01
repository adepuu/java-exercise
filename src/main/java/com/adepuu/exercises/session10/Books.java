package com.adepuu.exercises.session10;

public class Books extends LibraryMaterials{
    private String author;

    public Books(String title, String author, int availabilityCount) {
        super(title, availabilityCount);
        this.author = author;
    }
}
