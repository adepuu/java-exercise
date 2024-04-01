package com.adepuu.exercises.session10;

public class Books extends LibraryMaterials{
    private String author;

    public Books(String title, String author, int availabilityCount) {
        super(title, availabilityCount);
        this.author = author;
    }

    /**
     * Properties:
     *         - author
     *
     *     Methods:
     *         - constructor(title, availability_count, author)
     *
     * # Book Class Implementation
     * Method Book.constructor(title, availability_count, author):
     *     super().constructor(title, availability_count)
     *     self.author = author
     */


}
