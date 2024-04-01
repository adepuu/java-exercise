package com.adepuu.exercises.session10;

public class LibraryMaterials {
    private String title;
    private int availabilityCount;
    private int borrowedCount;

    public LibraryMaterials(String title, int availabilityCount) {
        this.title = title;
        this.availabilityCount = availabilityCount;
        this.borrowedCount = 0;
    }

    public void borrowMaterial() {
        if (availabilityCount > 0) {
            availabilityCount -= 1;
            borrowedCount += 1;
            System.out.println(title + " has been borrowed.");
            System.out.println("--- " + title + " Status ---");
            System.out.println("Borrowed: " + borrowedCount);
            System.out.println("Available: " + availabilityCount);
        } else {
            System.out.println(title + " is not available to borrow.");
            System.out.println("--- " + title + " Status ---");
            System.out.println("Borrowed: " + borrowedCount);
            System.out.println("Available: " + availabilityCount);
        }
    }

    public void returnMaterial() {
        if (borrowedCount > 0) {
            availabilityCount += 1;
            borrowedCount -= 1;
            System.out.println(title + " has been returned");
            System.out.println("--- " + title + " Status ---");
            System.out.println("Borrowed: " + borrowedCount);
            System.out.println("Available: " + availabilityCount);
        } else {
            System.out.println("Returning failed. No copies of " + title + " is borrowed.");
            System.out.println("--- " + title + " Status ---");
            System.out.println("Borrowed: " + borrowedCount);
            System.out.println("Available: " + availabilityCount);
        }
    }

}
