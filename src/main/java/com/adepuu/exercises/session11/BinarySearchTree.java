package com.adepuu.exercises.session11;

import java.util.Scanner;

public class BinarySearchTree {
    NodeTree root;
    BinarySearchTree(){
        root = null;
    }

    public void insert(int value){
        root = insertRec(root,value);
    }

    private NodeTree insertRec(NodeTree root, int value) {
        if (root == null) {
            root = new NodeTree(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }



    public void search(int value) {
        searchRec(root, value);
    }

    // Recursive method to search for a value
    private void searchRec(NodeTree root, int value)
    {
        try {
            if (value < root.value) {
                searchRec(root.left,value);
            }
            if(value > root.value){
                searchRec(root.right, value);
            }
        }catch (NullPointerException e){
            System.out.println("Number was not found");
            return;
        }
        if (value == root.value) {
            System.out.println("Number " + value + " has been found!");
        }
    }
    /**
     * Write a Java binary search tree program that can scale dynamically
     * <p>
     * As a user, I want to insert N-numbers into a binary search tree and then search for a specific number. After searching, the program should prompt me to search for another number without terminating.
     * <p>
     * Acceptance Criteria:
     * - The program should start by prompting the user to enter the number of elements (N) they wish to insert into the binary search tree.
     * - The program should then prompt the user to enter N numbers one by one.
     * <p>
     * Acceptance Criteria:
     * - The program should correctly insert each number into the binary search tree in a way that maintains the binary search tree properties (all nodes in the left subtree are less than the root, and all nodes in the right subtree are greater than the root).
     * - The program should handle duplicate numbers appropriately, either by ignoring them or by updating the existing node.
     * - After inserting all N-numbers, the program should prompt the user to enter a number to search for within the binary search tree.
     * - The program should perform a binary search to find the entered number, following the binary search tree properties.
     * - The program should display whether the number is found or not.
     * - The program should provide a clear and straightforward way for the user to exit the continuous search loop and terminate the program, such as entering a specific keyword or command.
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        while (true) {
            System.out.print("Input Number (press n to stop) = ");
            String input = scanner.nextLine();
            if (input.equals("n")) {
                break;
            }
            binarySearchTree.insert(Integer.parseInt(input));
        }
        while (true){
            System.out.print("Input Target (press n to stop) = ");
            String input = scanner.nextLine();
            if(input.equals("n")){
                scanner.close();
                break;
            }
            binarySearchTree.search(Integer.parseInt(input));
        }


    }
}
