package com.adepuu.exercises.session10.Book.Category;
import com.adepuu.exercises.session10.Book.Book;

public class Encyclopedia extends Book{

    public Encyclopedia(int availability, String name){
        super(availability, name);

        System.out.println("Added Encyclopedia " + super.getName()+ " for " + super.getAvailability() + " pcs");
    }

}
