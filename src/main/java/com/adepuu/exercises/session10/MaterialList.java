package com.adepuu.exercises.session10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaterialList {
    private Auth auth;


    List<Materials> materialList = new ArrayList<>();


    public void displayMaterialList(String activeUser){
        Scanner scanner = new Scanner(System.in);
        System.out.println("List of materials that can be borrowed : ");
        System.out.println("----------------------------------------");
        for(Materials list:materialList){
            System.out.println("Title   : " + list.getTitle());
            System.out.println("Stock   : " + list.getStock());
            System.out.println("Type    : " + list.getType());
            System.out.println("----------------------------------------");
        }
        System.out.print("Please Choose title to borrow : ");
        String input = scanner.nextLine();
        borrow(input,activeUser);
    }

    public void displayReturnList(String activeUser){
        Scanner scanner = new Scanner(System.in);
        System.out.println("List of materials that can be return : ");
        System.out.println("----------------------------------------");
        for(Materials list : materialList){
            if(list.getUser().equals(activeUser)){
                System.out.println("Title : " + list.getTitle());
                System.out.println("Type  : " + list.getType());
                System.out.println("----------------------------------------");
            }
        }
        System.out.print("Please Choose title to return : ");
        String input = scanner.nextLine();
        returnMaterials(input);
    }

    public void borrow(String input,String activeUser){
        int count = 0;
        for(Materials list : materialList){
            if(list.getTitle().equals(input)) {
                materialList.get(count).borrowMaterial(activeUser);
            }
            count++;
        }
    }

    public void returnMaterials(String input){
        int count = 0;
        for(Materials list : materialList){
            if(list.getTitle().equals(input)) {
                materialList.get(count).returnMaterial();
            }
            count++;
        }
    }
}
