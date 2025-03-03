package com.adepuu.exercises.session11;

import java.util.Scanner;

public class BinarySearchTree {

    public static void main(String[] args) {
        LinkedList<Integer> bst = new LinkedList<>();
        bst.insert(3);
        bst.insert(6);
        bst.insert(5);
        bst.insert(7);
        bst.insert(9);
        bst.insert(11);
        bst.insert(21);
        bst.insert(55);
        bst.insert(42);
        bst.insert(21);
        bst.insert(21);

        Scanner sc = new Scanner(System.in);
        String exitKey = "q";

        while (true) {
            System.out.print("Enter a number to search (or type '" + exitKey + "' to exit the program): ");
            String userInput = sc.nextLine();

            if (userInput.equals(exitKey)) {
                System.out.println("Closing the program, bye have a great day!");
                break;
            }

            try {
                int number = Integer.parseInt(userInput);
                System.out.println(bst.search(number));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or '" + exitKey + "' to exit the program");
            }
        }
        bst.printInOrder();
    }
}
