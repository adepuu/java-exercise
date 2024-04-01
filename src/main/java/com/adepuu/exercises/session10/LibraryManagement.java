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
        Book book1 = new Book("GRIT","Angela Duckworth",2,296);
        Book book2 = new Book("Atomic Habits","James Clear",25,3);
        DVD dvd1 = new DVD("Atomic Habits","James Clear",25,3);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(dvd1);

        library.getAllItem();

        library.borrowItem(book1);
        library.borrowItem(book1);
        library.borrowItem(book1);
        library.borrowItem(dvd1);

        library.returnItem(book1);

        library.getAllItem();
    }
}
