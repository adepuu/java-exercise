package com.adepuu.exercises.session10;

import java.sql.SQLOutput;

public class LibraryManagement {
    /**
     * Acceptance Criteria:
     * - Each material should have an availability count, and the program should check if the material is still available for borrowing.
     * - The program should demonstrate polymorphism by allowing operations (borrow, return) to be performed on any type of library material through a single method.
     * - The program should include methods to borrow and return materials.
     * - The program should keep track of the available and borrowed materials.
     * - The program should print out the status of materials (available, borrowed) and the actions performed (borrow, return).
     *
     * Notes:
     * - The program doesn't require a menu system; focus should be on Object-Oriented Programming (OOP) and inheritance implementation.
     * - Make sure to implement Inheritance and Polymorphism properly
     */


    public static void main(String[] args) {


//        Membuat list buku

        System.out.println("List Buku: ");
        SelfImprovement emotionalIntelitent = new SelfImprovement("Emotional inteligent", "Daniel Golemans", 0, 10, "⭐ ⭐️ ⭐ ⭐ ⭐");
        Comics kurokuNobasuke = new Comics("Kurkoku basuke-1", "Shinji kagawa", 0, 10, "Sport");
        SelfImprovement anatomicHabbit = new SelfImprovement("Anatomic Habbit", "James clear", 0, 20, "⭐ ⭐️ ⭐ ⭐ ⭐");
        Comics sherlockHolmes = new Comics("Sherlock Holmes", "Arthur Conan Doyle", 0, 5, "Adventure");
        Dvd dvdTutorialOOP = new Dvd("I love Java", "10203", 2, 0);
        System.out.println(emotionalIntelitent.nameBook() + " Stock = " + emotionalIntelitent.checkSlot());
        System.out.println(kurokuNobasuke.nameBook() + " Stock = " + kurokuNobasuke.checkSlot());
        System.out.println(anatomicHabbit.nameBook() + " Stock = " + anatomicHabbit.checkSlot());
        System.out.println(sherlockHolmes.nameBook() + " Stock = " + sherlockHolmes.checkSlot());
        System.out.println(dvdTutorialOOP.getDVD() + " Stock = " + dvdTutorialOOP.slotDvd());


        // Create case peminjaman buku


        System.out.println("");
        System.out.println("Borrow book");
        emotionalIntelitent.borrowBook();

        System.out.println("");
        System.out.println("Return book");
        emotionalIntelitent.returnBook();

        System.out.println("");
        System.out.println("Borrow DVD");
        dvdTutorialOOP.borrowBook();









    }
}
