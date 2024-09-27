package com.adepuu.exercises.session10;

abstract class LibraryMaterial {
    private int availabilityCount;

    public LibraryMaterial(int availabilityCount) {
        this.availabilityCount = availabilityCount;
    }

    public boolean isAvailable() {
        return  availabilityCount > 0;
    }

    public void borrow() {
        if (isAvailable()) {
            availabilityCount-- ;
            System.out.println("Material borrowed successfully");
        } else {
            System.out.println("Material is not available for borrowing");
        }
    }

    public void returnMaterial() {
        availabilityCount++;
        System.out.println("Material returned successfully");
    }

    public abstract String getType();

    public int getAvailabilityCount() {
        return availabilityCount;
    }
}
