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

    public void status () {
        System.out.println("--- " + title + " Status ---");
        System.out.println("Borrowed: " + borrowedCount);
        System.out.println("Available: " + availabilityCount);
    }

    public void borrowMaterial() {
        if (availabilityCount > 0) {
            availabilityCount -= 1;
            borrowedCount += 1;
            System.out.println(title + " has been borrowed.");
            status();
        } else {
            System.out.println(title + " is not available to borrow.");
            status();
        }
    }

    public void returnMaterial() {
        if (borrowedCount > 0) {
            availabilityCount += 1;
            borrowedCount -= 1;
            System.out.println(title + " has been returned");
            status();
        } else {
            System.out.println("Returning failed. No copies of " + title + " is borrowed.");
            status();
        }
    }

}
