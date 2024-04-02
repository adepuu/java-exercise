package com.adepuu.exercises.session10;

import java.util.HashMap;

public class LibraryManagement {
    private HashMap<String, LibraryMaterial> libraryMaterials;

    public LibraryManagement() {
        libraryMaterials = new HashMap<>();
    }

    public void addMaterial(LibraryMaterial material) {
        libraryMaterials.put(material.getTitle(), material);
    }

    public void borrowMaterial(String title) {
        LibraryMaterial material = libraryMaterials.get(title);
        if (material != null) {
            material.borrow();
        } else {
            System.out.println("Material not found: " + title);
        }
    }

    public void returnMaterial(String title) {
        LibraryMaterial material = libraryMaterials.get(title);
        if (material != null) {
            material.returnMaterial();
        } else {
            System.out.println("Material not found: " + title);
        }
    }

    public void displayLibraryStatus() {
        System.out.println("Library Materials Status:");
        for (LibraryMaterial material : libraryMaterials.values()) {
            material.displayStatus();
        }
    }

    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();

        library.addMaterial(new Book("A Song of Ice and Fire", 5));
        library.addMaterial(new DVD("A Game of Thrones", 3));
        library.addMaterial(new Book("Fire and Blood", 3));
        library.addMaterial(new Book("The Winds of Winter", 2));
        library.addMaterial(new DVD("A Dance with Dragons", 1));

        library.displayLibraryStatus();
        System.out.println();

        library.borrowMaterial("A Song of Ice and Fire");
        library.borrowMaterial("Fire and Blood");
        library.returnMaterial("A Game of Thrones");
        library.borrowMaterial("A Dance with Dragons");
        System.out.println();

        library.displayLibraryStatus();
    }
}

abstract class LibraryMaterial {
    private String title;
    private int availabilityCount;

    public LibraryMaterial(String title, int availabilityCount) {
        this.title = title;
        this.availabilityCount = availabilityCount;
    }

    public String getTitle() {
        return title;
    }

    public int getAvailabilityCount() {
        return availabilityCount;
    }

    public void borrow() {
        if (availabilityCount > 0) {
            availabilityCount--;
            System.out.println("Borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is not available for borrowing.");
        }
    }

    public void returnMaterial() {
        availabilityCount++;
        System.out.println("Returned: " + title);
    }

    public void displayStatus() {
        System.out.println(title + ": Available Count - " + availabilityCount);
    }
}


