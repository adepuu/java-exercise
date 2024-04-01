package com.adepuu.exercises.session10;

public abstract class LibraryManagement {
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

    private int availabilityCount;
    private String name;
    private double price;

    protected LibraryManagement(int availabilityCount, String name, double price) {
        this.availabilityCount = availabilityCount;
        this.name = name;
        this.price = price;
    }

    public static Book createBook(int availabilityCount, String name, double price) {
        return new Book(availabilityCount, name, price);
    }

    public static Magazine createMagazine(int availabilityCount, String name, double price) {
        return new Magazine(availabilityCount, name, price);
    }

    public boolean isAvailable() {
        return availabilityCount > 0;
    }

    public void isBorrow() {
        if (isAvailable()) {
            availabilityCount--;
            System.out.println(this.name + " borrowed.");
        } else {
            System.out.println(this.name + " is not available for borrowing.");
        }
    }

    public void returnMaterial() {
        if(this.availabilityCount < 1) {
            isBorrow();
        } else {
            availabilityCount++;
            System.out.println(this.name + " returned.");
        }
    }

    public void getStatus() {
        System.out.println(this.name + ": Available count - " + availabilityCount + " and price is : " + this.price);
    }
}
