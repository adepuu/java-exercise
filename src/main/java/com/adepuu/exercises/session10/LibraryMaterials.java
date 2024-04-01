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
            System.out.println(title + " has been borrowed. There are " + availabilityCount + " copies available.");
        } else {
            System.out.println(title + " is not available to borrow.");
        }
    }

    public void returnMaterial() {
        if (borrowedCount > 0) {
            availabilityCount += 1;
            borrowedCount -= 1;
            System.out.println(title + " has been returned. There are " + availabilityCount + " copies available.");
        } else {
            System.out.println("Returning failed. No copies of " + title + " is borrowed.");
        }
    }

    /**
     * Properties:
     *         - title
     *         - availability_count
     *         - borrowed_count
     *
     *     Methods:
     *         - constructor(title, availability_count)
     *         - borrow()
     *         - return_material()
     *
     * # LibraryMaterial Class Implementation
     * Method LibraryMaterial.constructor(title, availability_count):
     *     self.title = title
     *     self.availability_count = availability_count
     *     self.borrowed_count = 0
     *
     * Method LibraryMaterial.borrow():
     *     if self.availability_count > 0:
     *         self.availability_count -= 1
     *         self.borrowed_count += 1
     *         print(self.title + " has been borrowed.")
     *     else:
     *         print(self.title + " is not available for borrowing.")
     *
     * Method LibraryMaterial.return_material():
     *     if self.borrowed_count > 0:
     *         self.availability_count += 1
     *         self.borrowed_count -= 1
     *         print(self.title + " has been returned.")
     *     else:
     *         print(self.title + " has no borrowed copies.")
     */

}
