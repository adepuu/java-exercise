package com.adepuu.exercises.session11;

import com.adepuu.dsa.datastructure.BinaryTree.BinaryTree;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchTree {
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

    public class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Method to insert a new node with the given value
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Recursive method to insert a new node
    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    // Method to print the tree in-order (left, root, right)
    public void inorder() {
        inorderRec(root);
    }

    // Recursive method to print the tree in-order
    private void inorderRec(Node root) {
        if (root != null) {
            // Traverse the left subtree
            inorderRec(root.left);

            // Visit the root node
            System.out.print(root.value + " ");

            // Traverse the right subtree
            inorderRec(root.right);
        }
    }

    // Method to search for a value in the BST
    public boolean search(int value) {
        return searchRec(root, value);
    }

    // Recursive method to search for a value
    private boolean searchRec(Node root, int value) {
        if (root == null) {
            return false;
        }
        if (value == root.value) {
            return true;
        }
        return value < root.value ? searchRec(root.left, value) : searchRec(root.right, value);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Binary Search Tree");
        System.out.println("==================");
        System.out.print("Enter the number of elements (N): ");
        int size = input.nextInt();
        System.out.println("Enter " + size + " number of elements:");
        BinaryTree bt = new BinaryTree();
        for (int i = 0; i < size; i++) {
            try{
                int number = Integer.parseInt(input.next());
                bt.insert(number);
            }
            catch(NumberFormatException ex){
                System.out.println("Please enter a valid number or 'q' to finish'");
                i--;
                continue;
            }
        }
        System.out.println("Enter number to search or 'q' to finish :");
        String number;
        while (true){
            try{
                number = input.next().toLowerCase();
                if(number.equals("q")){
                    break;
                }
                else{
                    var isExist = bt.search(Integer.parseInt(number));
                    System.out.print(isExist?"Exist\n":"Not Exist\n");
                }
            }
            catch(NumberFormatException ex){
                System.out.println("Please enter a valid number to search or 'q' to finish'");
                continue;
            }
        }
        input.close();
    }
}
