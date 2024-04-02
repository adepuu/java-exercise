package com.adepuu.dsa.datastructure.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        // Inserting values into the binary tree
        bt.insert(6);
        bt.insert(4);
        bt.insert(8);
        bt.insert(3);
        bt.insert(5);
        bt.insert(7);
        bt.insert(9);

        // Printing the binary tree in-order
        System.out.println("In-order traversal of the binary tree:");
        bt.inorder();
        var isExist = bt.search(11);
        System.out.println(isExist);
    }
}

