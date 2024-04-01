package com.adepuu.exercises.session10;

import java.util.Scanner;

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
        Library library = new Library();

        System.out.println("-----------------------------------");
        System.out.println("Welcome to the library");
        System.out.println("-----------------------------------");

        boolean exit = false;
        while (!exit) {
            System.out.println("------------Chose an option------------");
            System.out.println("1. Borrow");
            System.out.println("2. Return");
            System.out.println("3. Exit");
            System.out.print("Enter Option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    library.displayAvailableMaterials();
                    System.out.println("Enter the type of material you want to borrow:");
                    String borrowType = scanner.next();
                    library.borrowMaterial(borrowType);
                    break;
                case 2:
                    System.out.println("Enter the type of material to return:");
                    String returnType = scanner.next();
                    library.returnMaterial(returnType);
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting....");
                default:
                    System.out.println("Invalid choice, please enter number 1 - 3");
            }
        }



    }
}
