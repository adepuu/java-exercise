package com.adepuu.exercises.session10;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<LibraryMaterial> materials;

    public Library(){
        this.materials = new ArrayList<>();
    }

    public void addMaterial(LibraryMaterial material){
        materials.add(material);
    }

    public void borrowMaterial(String title){
        for(LibraryMaterial material : materials){
            if(material.getTittle().equalsIgnoreCase(title)){
                if(material.getQty() > 0){
                    System.out.println("You have borrowed: " +title);
                    material.borrow();
                }else {
                    System.out.println("Sorry, "+title+" is not available at the moment.");
                }
                return;
            }
        }
        System.out.println("Sorry, "+title+" is not found in the library");
    }

    public void returnMaterial(String title){
        for(LibraryMaterial material : materials){
            if(material.getTittle().equalsIgnoreCase(title)){
                if(material.getBorrowedqty() > 0){
                    System.out.println("Thank you for returning: " +title);
                    material.returnMaterial();
                }else {
                    System.out.println("Sorry, "+title+" is not borrowed yet");
                }
                return;
            }
        }
        System.out.println("Sorry, "+title+" is not found in the library.");
    }
}
