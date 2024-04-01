package com.adepuu.exercises.session10;

public class DVD extends LibraryMaterial {
    private final String director;

    DVD(String title, String director, int availability) {
        super(title, availability);
        this.director = director;
    }

    @Override
    public void displayStatus(String title) {
        super.displayStatus(title);
        System.out.println("Directed by: " + director);
    }
}
