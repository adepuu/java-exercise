package com.adepuu.exercises.session10;

public class Dvd implements LibrarySystem {

    String nameDvd;
    String ID;
    int slotDvd;
    int borrowDvd;


    public Dvd(String nameDvd, String ID, int slotDVD, int borrowDVD){
        this.nameDvd = nameDvd;
        this.ID = ID;
        this.slotDvd = slotDVD;
        this.borrowDvd = borrowDVD;
    }

    public void borrowBook (){
        if(borrowDvd > 0){
            this.borrowDvd++;
            this.slotDvd--;
            System.out.println("Borrowing DVD" + " " + this.slotDvd());
        } else {
            System.out.println("Stock is till available" + " " + this.slotDvd());
        }

    }

    @Override
    public void returnBook() {
        if(slotDvd > 0){
            this.slotDvd++;
            this.borrowDvd--;
            System.out.println("DVD stock is available" + " " + this.slotDvd());
        } else {
            System.out.println("DVD is not available" + " " + this.slotDvd());
        }
    }

    public String getDVD(){
        return this.nameDvd;

    }

    public int slotDvd(){
        return this.slotDvd;
    }


}
