package com.adepuu.exercises.session10;

public class Magazines extends LibraryMaterials{
    private String publisher;

    public Magazines (String title, String publisher, int availabilityCount) {
        super(title, availabilityCount);
        this.publisher = publisher;
    }

}
