package com.adepuu.exercises.session10;

    public class Comics extends Book{

    String genre;

    public Comics(String nameBook, String authorBook, int borrowBook, int slotBook, String genre){
        super(nameBook, authorBook, borrowBook, slotBook);
        this.genre = genre;
    }

}
