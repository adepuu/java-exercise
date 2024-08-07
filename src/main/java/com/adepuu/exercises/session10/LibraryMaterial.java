package com.adepuu.exercises.session10;

import java.util.HashMap;
import java.util.Map;

public class LibraryMaterial {
    protected String title;
    protected int availability;
    protected int currAvailability;
    protected Map<String, Integer> materialList = new HashMap<>();

    LibraryMaterial(String title, int availability) {
        this.title = title;
        this.availability = availability;
        this.currAvailability = 0;
        this.materialList.put(title, availability);
    }

    public void borrow(String title) {
        borrow(title, 1);
    }

    public void borrow(String title, int total) {
        if (!materialList.containsKey(title)) {
            System.out.println("Library does not have " + title + " in the collections");
            return;
        }
        currAvailability = materialList.get(title);

        if (currAvailability == 0) {
            System.out.println(title + " is not available for borrow");
            return;
        }

        currAvailability -= total;
        materialList.replace(title, currAvailability);
        System.out.println("You just borrowed " + title);
    }

    public void returnMaterial(String title) {
        returnMaterial(title, 1);
    }

    public void returnMaterial(String title, int total) {
        if (!materialList.containsKey(title)) {
            System.out.println("Library does not have " + title + " in the collections. Maybe you come to wring library");
            return;
        }

        currAvailability = materialList.get(title);

        if (availability < currAvailability + total) {
            System.out.println("Our collection are full of stocks, maybe you come to wrong library");
            return;
        }

        currAvailability += total;
        materialList.replace(title, currAvailability);
        System.out.println("Returning success");
    }

    public void displayStatus(String title) {
        currAvailability = materialList.get(title);
        System.out.println(title + " - available: " + currAvailability);
    }
}
