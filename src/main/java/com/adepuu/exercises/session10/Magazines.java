package com.adepuu.exercises.session10;

public class Magazines extends LibraryMaterials{
    private String publisher;

    public Magazines (String title, String publisher, int availabilityCount) {
        super(title, availabilityCount);
        this.publisher = publisher;
    }
    /**
     * Properties:
     *         - publisher
     *
     *     Methods:
     *         - constructor(title, availability_count, publisher)
     *
     * #Magazines Class Implementation
     * Method DVD.constructor(title, availability_count, publisher):
     *     super().constructor(title, availability_count)
     *     self.publisher = publisher
     */

}
