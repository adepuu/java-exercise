package com.adepuu.exercises.session10;



// class anakan atau inheritance dari class book

public class SelfImprovement extends Book{

    String ratings;


    SelfImprovement(String inNameBook, String authorName, int inBorrow, int slotAvail, String ratings){
        super(inNameBook, authorName, inBorrow, slotAvail);
        this.ratings = ratings;
    }
}
