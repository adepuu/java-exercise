package com.adepuu.dsa.datastructure.BinaryTree;

public class BinaryTree {
    Node root;

    public BinaryTree() {
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
}
