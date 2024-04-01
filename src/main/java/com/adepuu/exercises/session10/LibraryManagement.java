package com.adepuu.exercises.session10;

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
        Library library = new Library();

        library.addMaterial(new Book("Algoritma Pemrograman", "Bukan Saya", 2));
        library.addMaterial(new Journal("Sistem pengukur kemiripan menggunakan Jaro winkler", "Saya", "UMRAH",1));
        library.borrowMaterial("Algoritma Pemrograman");
        library.borrowMaterial("Algoritma Pemrograman");
        library.borrowMaterial("Algoritma Pemrograman");
        library.borrowMaterial("Sistem pengukur kemiripan menggunakan Jaro winkler");
        library.returnMaterial("Sistem pengukur kemiripan menggunakan Jaro winkler");




    }
}
