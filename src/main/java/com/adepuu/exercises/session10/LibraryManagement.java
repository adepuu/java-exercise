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
        // Creating library material collection
        Book novel = new Book("Around Batam in 80 hours", "Wawan", 10);
        Book magazine = new Book("Harry Pasteur", "Rizal", 5);

        DVD action = new DVD("Tendangan si Leo", "Leo", 3);
        DVD comedy = new DVD("Awas ada Irwin", "Irwin", 5);

        // Borrowing library material collection
        action.borrow("Tendangan si Leo");
        comedy.borrow("Awas ada Irwin", 3);

        novel.borrow("Around Batam in 80 hours");
        magazine.borrow("Harry Pasteur", 3);

        // Check status after borrowing library material
        action.displayStatus("Tendangan si Leo");
        comedy.displayStatus("Awas ada Irwin");

        novel.displayStatus("Around Batam in 80 hours");
        magazine.displayStatus("Harry Pasteur");

        // Returning library material
        action.returnMaterial("Tendangan si Leo");
        comedy.returnMaterial("Awas ada Irwin", 3);

        novel.returnMaterial("Around Batam in 80 hours");
        magazine.returnMaterial("Harry Pasteur", 4);

        // Check status after returning library material
        action.displayStatus("Tendangan si Leo");
        comedy.displayStatus("Awas ada Irwin");

        novel.displayStatus("Around Batam in 80 hours");
        magazine.displayStatus("Harry Pasteur");
    }
}
