package com.adepuu.exercises.session10;

import java.util.HashMap;

public class Library {
    private HashMap<String, LibraryMaterial> materials;

    public Library() {
        materials = new HashMap<>();
        materials.put("Book", new Book(4));
        materials.put("DVD", new DVD(2));

    }

    public void borrowMaterial(String materialType) {
        LibraryMaterial material = materials.get(materialType);
        if (material != null) {
            material.borrow();
        } else {
            System.out.println("Invalid material type");
        }
    }

    public void returnMaterial(String materialType) {
        LibraryMaterial material = materials.get(materialType);
        if (material != null) {
            material.returnMaterial();
        } else {
            System.out.println("Invalid material type");
        }
    }

    public void displayAvailableMaterials() {
        System.out.println("Available Materials:");
        for (String materialType : materials.keySet()) {
            LibraryMaterial material = materials.get(materialType);
            if (material.isAvailable()) {
                System.out.println(materialType + ": " + material.getAvailabilityCount());
            }
        }
    }
}
