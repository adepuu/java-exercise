package com.adepuu.exercises.session10.Book;

import com.adepuu.exercises.session10.LibraryTransaction;

public class Book implements LibraryTransaction{
    private int availability;
    private int borrowed;
    private String name;

    protected Book(int availability, String name) {
        this.availability = availability;
        this.name = name;
        this.borrowed = 0;
    }

    public int getAvailability() {
        return this.availability;
    }

    public void checkAvailability() {
        System.out.println(this.getName() + " has " + this.getAvailability() + " stock, this book " + ((this.isAvailability()) ? "can be borrowed" : "can't be borrowed"));
        if(this.borrowed > 0) {
            System.out.println(this.borrowed + " book with title '"+ this.getName() +"' still borrowed");
        }
    }
    
    public void setAvailability(int availability) {
        this.availability = availability;
    }
    
    public String getName() {
        return this.name;
    }

    public boolean isAvailability(){
        return this.availability > 0;
    }

    @Override
    public void borrowing(String borrower) {
        if(this.isAvailability()){
            this.setAvailability(this.getAvailability() - 1);
            this.borrowed += 1;
            System.out.println(borrower + " borrowing '" + this.getName() + "'");	
            
            System.out.println("'" + this.getName() + "' stock now is " + this.getAvailability() + " and " + ((this.isAvailability()) ? "still can be borrowed" : "can't be borrowed anymore"));
        }else{
            System.out.print(borrower + " want to borrowing " + this.getName());
            System.out.println(" but '" + this.getName() + "' stock now is " + this.getAvailability() + " and " + "can't be borrowed anymore");

        }
    }

    @Override
    public void returning(String borrower) {
        this.setAvailability(this.getAvailability() + 1);
        this.borrowed -= 1;
        System.out.println(borrower + " returning novel " + this.getName() + "' stock now is " + this.getAvailability() + " and " + ((this.isAvailability()) ? "still can be borrowed" : "can't be borrowed anymore"));
    }

}
