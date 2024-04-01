package com.adepuu.exercises.session10;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Material> materials;

    public Library() {
        this.materials = new ArrayList<>();
    }

    public void addItem(Material material) {
        materials.add(material);
    }

    public void borrowItem(Material material) {
        material.borrowItem();
    }

    public void returnItem(Material material) {
        material.returnItem();
    }

    public void getAllItem() {
        System.out.println();
        System.out.println("--All Materials--");
        int i = 1;
        for(Material material : materials) {
            System.out.println(i++ + ". " + material.getTitle() + ", stock : " + material.getStock());
        }
        System.out.println();
    }

    public int getTotalBorrowedItem() {
        int count = 0;
        for(Material material: materials) {
            if(material.getStock() == 0){
                count++;
            }
        }
        return count;
    }
}
