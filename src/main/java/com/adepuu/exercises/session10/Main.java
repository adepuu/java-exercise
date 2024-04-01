package com.adepuu.exercises.session10;

public class Main {
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
        LibraryManagement librarian = new LibraryManagement();

        // creating materials
        LibraryMaterials book1 = librarian.createMaterial("Book", "Divine Speech", 3, "Nouman Ali Khan");
        LibraryMaterials magazine1 = librarian.createMaterial("Magazine", "Animonster", 5, "Megindo");
        LibraryMaterials journal1 = librarian.createMaterial("Journal", "Soft Computing", 2, "Antonio Di Nola");

        // borrowing and returning materials
        librarian.manageMaterial(book1, "borrow");
        librarian.manageMaterial(magazine1, "borrow");
        librarian.manageMaterial(journal1, "borrow");
        librarian.manageMaterial(journal1, "borrow");
        librarian.manageMaterial(journal1, "return");
        librarian.manageMaterial(journal1, "borrow");
        librarian.manageMaterial(book1, "return");
        librarian.manageMaterial(magazine1, "return");
        librarian.manageMaterial(journal1, "return");
        librarian.manageMaterial(journal1, "returning");
        librarian.manageMaterial(journal1, "return");
        librarian.manageMaterial(journal1, "return");
    }



    /*
    # Usage
librarian = Librarian()

# Create materials
book1 = librarian.create_material("Book", "The Great Gatsby", 5, "F. Scott Fitzgerald")
dvd1 = librarian.create_material("DVD", "Inception", 3, "Christopher Nolan")
journal1 = librarian.create_material("Journal", "Nature", 10, "John Smith")

# Manage materials
librarian.manage_material(book1, "borrow")
librarian.manage_material(dvd1, "borrow")
librarian.manage_material(journal1, "borrow")

librarian.manage_material(book1, "return")
librarian.manage_material(dvd1, "return")
librarian.manage_material(journal1, "return")
     */
}
