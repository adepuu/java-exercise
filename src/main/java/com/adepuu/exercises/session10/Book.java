package com.adepuu.exercises.session10;

public class Book extends LibraryMaterial{
    public Book(int availabilityCount) {
        super(availabilityCount);
    }

    @Override
    public String getType() {
        return "Book";
    }
}
