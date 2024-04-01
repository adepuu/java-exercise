package com.adepuu.exercises.session10.Book.Category;
import com.adepuu.exercises.session10.Book.Book;

public class Novel extends Book{
    private String genre;

    public Novel(int availability, String name, String genre){
        super(availability, name);
        this.genre = genre;

        System.out.println("Added Novel " + super.getName()+ " with genre " + this.getGenre() + " for " + super.getAvailability() + " pcs");
    }

    public String getGenre() {
        return this.genre;
    }

}
