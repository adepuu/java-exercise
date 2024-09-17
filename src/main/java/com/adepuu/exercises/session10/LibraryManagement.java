package com.adepuu.exercises.session10;

import java.util.Scanner;

import com.adepuu.exercises.session10.Book.Category.*;

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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Library System");
        System.out.println("Add some new book to the library");
        System.out.println("--------------------------------");
        System.out.println(" ");
         
        Novel novelRomeo = new Novel(5, "Romeo and Juliet", "Science Fiction");
        Tabloid tabloidBobo = new Tabloid(2, "Bobo at Wall Street", 12500);
        Encyclopedia encyclopedia = new Encyclopedia(1, "Why Earth is flat?");
        
        System.out.println(" ");
        System.out.println("Press enter to continue.. ");
        scanner.nextLine();

        System.out.println(" ");
        System.out.println("Checking if the book can be borrowed");
        System.out.println("--------------------------------");
        System.out.println(" ");
        
        novelRomeo.checkAvailability();
        System.out.println(" ");
        tabloidBobo.checkAvailability();
        System.out.println(" ");
        encyclopedia.checkAvailability();
        System.out.println(" ");
        
        System.out.println(" ");
        System.out.println("Press enter to continue.. ");
        scanner.nextLine();

        System.out.println(" ");
        System.out.println("Some library members want to borrow a book");
        System.out.println("--------------------------------");


        System.out.println(" ");
        novelRomeo.borrowing("Budi");
        System.out.println(" ");
        encyclopedia.borrowing("Santi");
        System.out.println(" ");
        encyclopedia.borrowing("Aroso");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Press enter to continue.. ");
        scanner.nextLine();

        System.out.println(" ");
        System.out.println("Some library members want to buy a tabloid but some members want to borrow instead.");
        System.out.println("--------------------------------");
        

        System.out.println(" ");
        tabloidBobo.buy("Tono");
        System.out.println(" ");
        tabloidBobo.borrowing("Alfred");
        System.out.println(" ");
        tabloidBobo.borrowing("Sonia");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Press enter to continue.. ");
        scanner.nextLine();

        System.out.println(" ");
        System.out.println("In the next day, library need to check available and borrowed of all book");
        System.out.println("--------------------------------");

        System.out.println(" ");
        novelRomeo.checkAvailability();
        System.out.println(" ");

        tabloidBobo.checkAvailability();
        System.out.println(" ");

        encyclopedia.checkAvailability();
        System.out.println(" ");


        System.out.println(" ");
        System.out.println("Press enter to continue.. ");
        scanner.nextLine();

        System.out.println("Some library members want to return a book");
        System.out.println("--------------------------------");

        
        System.out.println(" ");
        novelRomeo.returning("Budi");
        System.out.println(" ");
        tabloidBobo.returning("Alfred");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Press enter to continue.. ");
        scanner.nextLine();

        System.out.println(" ");
        System.out.println("In the end of day, library need to check available and borrowed of all book again");
        System.out.println("--------------------------------");
       
        System.out.println(" ");

        novelRomeo.checkAvailability();
        System.out.println(" ");

        tabloidBobo.checkAvailability();
        System.out.println(" ");

        encyclopedia.checkAvailability();
        System.out.println(" ");


        System.out.println(" ");
        System.out.println("Press enter to continue.. ");
        scanner.nextLine();

        scanner.close();
    }

}
