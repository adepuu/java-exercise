package com.adepuu.exercises.session10;

public class LibraryManagement {
    public LibraryManagement() {

    }
    public LibraryMaterials createMaterial (String materialType, String title, int availabilityCount, String info) {
        switch (materialType) {
            case "Book":
                return new Books(title, info, availabilityCount);
            case "Magazine":
                return new Magazines(title, info, availabilityCount);
            case "Journal":
                return new Journals(title, info, availabilityCount);
            default:
                throw new IllegalArgumentException("Unknown material type");
        }
    }

    public void manageMaterial(LibraryMaterials material, String action) {
        if (action.equals("borrow")) {
            material.borrowMaterial();
        } else if (action.equals("return")) {
            material.returnMaterial();
        } else {
            System.out.println("Invalid action.");
        }
    }

}
