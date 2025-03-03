package com.adepuu.exercises.session11;

import com.adepuu.dsa.datastructure.BinaryTree.BinaryTree;

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
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter the number (or 'q' to quit): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }
            int num = Integer.parseInt(input);
            bt.insert(num);
        } while (true);

        System.out.print("Enter a number to search for: ");
        int searchNum = Integer.parseInt(scanner.nextLine());

        boolean isExist = bt.search(searchNum);
        System.out.println("Number " + searchNum + " is " + (isExist ? "found" : "not found") + " in the binary tree.");

        scanner.close();
    }
}
