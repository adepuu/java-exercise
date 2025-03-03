package com.adepuu.exercises.session10;

import java.util.ArrayList;

public class LibraryManagement {
    /**
     * Acceptance Criteria:
     * - Each material should have an availability count, and the program should check if the material is still available for borrowing.
     * - The program should demonstrate polymorphism by allowing operations (borrow, return) to be performed on any type of library material through a single method.
     * - The program should include methods to borrow and return materials.
     * - The program should keep track of the available and borrowed materials.
     * - The program should print out the status of materials (available, borrowed) and the actions performed (borrow, return).
     * <p>
     * Notes:
     * - The program doesn't require a menu system; focus should be on Object-Oriented Programming (OOP) and inheritance implementation.
     * - Make sure to implement Inheritance and Polymorphism properly
     */
    public static void main(String[] args) {
        Books book1 = new Books(10, "Harry Comedy Putar", "JK Guling", 200);
        book1.borrowItem();
        book1.borrowItem();
        book1.returnItem();
//        Ebook
        Ebooks ebook1 = new Ebooks(3, 500, "Tuan Cincin", "J.R.R Tolkien", "Link shortener to Tuan Cincin");
        ebook1.borrowItem();
        ebook1.borrowItem();
        ebook1.borrowItem();
        ebook1.borrowItem();
//          Magazine
        Magazines magazine1 = new Magazines(1, "Playboy", 50, "5 February 2024");
        magazine1.borrowItem();
        magazine1.returnItem();
        magazine1.borrowItem();
        magazine1.borrowItem();

        ArrayList<Materials> items = new ArrayList<>();
        items.add(book1);
        items.add(ebook1);
        items.add(magazine1);

        for (Materials m : items) {
            m.printStatus();
        }
    }
}