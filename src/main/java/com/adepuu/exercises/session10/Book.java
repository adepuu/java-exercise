package com.adepuu.exercises.session10;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Book implements LibrarySystem {

    String nameBook;
    String author;
    int borrow;
    int slot;

    static ArrayList<Book> listBook = new ArrayList<Book>();


//    Constructor book
    protected Book(String inNameBook, String authorName, int inBorrow, int slotAvail){
        nameBook = inNameBook;
        author = authorName;
        borrow = inBorrow;
        slot = slotAvail;

    }
//    Method check lot buku

    public int checkSlot(){
        return this.slot;
    }

    public int borrowBooks(){
        return this.borrow;
    }

//    polimor peminjaman buku (tambah dan kurang sebagai validasi)

    @Override
    public void borrowBook() {
        if(this.slot > 1){
            this.slot--;
            this.borrow++;
            System.out.println("Available" + " " + this.nameBook + " " + this.author);
        } else {
            System.out.println("Not available" + " " + this.nameBook + " " + this.author);
        }

        System.out.println(" Slot available " + " " + this.slot);



    }
//
//    Poli untuk pengembalian buku (tambah dan kurang)

    @Override
    public void returnBook() {
        if(this.borrow > 0){
            this.borrow--;
            this.slot++;
            System.out.println("Book has been return" + " " + this.nameBook + " " + this.author );
        } else {
            System.out.println("Book still being used");
        }

        System.out.println("Slot available" + " " + this.slot);

    }



    public String nameBook(){
        return this.nameBook;
    }

    public static ArrayList<Book> listBook (){
        return listBook;


    }

}
