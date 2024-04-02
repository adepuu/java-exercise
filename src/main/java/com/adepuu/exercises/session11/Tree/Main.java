package com.adepuu.exercises.session11.Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        startProgram(scanner);
        scanner.close();
    }

    static void startProgram(Scanner scanner){
        BinarySearchTree searchTree = new BinarySearchTree();
        int n = enterSize(scanner);
        System.out.println("");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the data of node or 'q' to quit " + (i + 1) + ": ");
            String data = scanner.nextLine();
            if (data.equals("q")) {
                scanner.close();
                System.exit(0);
            }
            try {
                if (searchTree.search(Integer.parseInt(data))) {
                    System.out.println("");
                    System.out.println(data + " is already exist in the tree");
                    System.out.println("");
                    i--;
                    continue;
                } else {
                    searchTree.insert(Integer.parseInt(data));
                }  
            } catch (Exception e) {
                System.out.println("");
                System.out.println("Please enter a valid number or 'q' to quit");
                System.out.println("");
                i--;
                continue;
            }
        }

        System.out.println("");
        System.out.print("This is your data inside of tree : ");
        searchTree.inorder();

        System.out.println("");
        System.out.println("");
        searchNumber(scanner, searchTree);
    }

    static int enterSize(Scanner scanner){
        System.out.print("Enter the number of nodes in the tree or 'q' to quit: ");
        String n = scanner.nextLine();

        if (n.equals("q")) {
            scanner.close();
            System.exit(0);
        }

        try {
            return Integer.parseInt(n);
        } catch (Exception e) {
            System.out.println("");
            System.out.println("Please enter a valid number or 'q' to quit");
            System.out.println("");
            return enterSize(scanner);
        }
    }

    static void searchNumber(Scanner scanner, BinarySearchTree searchTree){
        System.out.print("Enter the number you want to search or 'q' to quit : ");
        String searchNumber = scanner.nextLine();

        if(searchNumber.equals("q")){
            scanner.close();
            System.exit(0);
        }

        try {
            if (searchTree.search(Integer.parseInt(searchNumber))) {
                System.out.println(searchNumber + " is present in the tree");
            } else {
                System.out.println(searchNumber + " is not present in the tree");
            }    
        } catch (Exception e) {
            System.out.println("");
            System.out.println("Please enter a valid number or 'q' to quit");
            System.out.println("");
            searchNumber(scanner, searchTree);
        }

        System.out.println("");
        System.out.print("Do you want to start new again? (Press y to continue or other key to quit) : ");
        String again = scanner.nextLine();
        if(again.equals("y")){
            startProgram(scanner);
        }
        else{
            scanner.close();
            System.exit(0);
        }
    }

}
