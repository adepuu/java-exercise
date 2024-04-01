package com.adepuu.exercises.session10;

public class SelfImprovement extends Book{

    String ratings;


    SelfImprovement(String inNameBook, String authorName, int inBorrow, int slotAvail, String ratings){
        super(inNameBook, authorName, inBorrow, slotAvail);
        this.ratings = ratings;
    }
}
