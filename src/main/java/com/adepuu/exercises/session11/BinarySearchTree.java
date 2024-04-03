//package src.main.java.com.adepuu.exercises.session11;
//
//import src.main.java.com.adepuu.exercises.session11.Node;
//
//import java.util.Scanner;
//
//public class BinarySearchTree {
//    Node root;
//
//    public BinarySearchTree() {
//        root = null;
//    }
//
//    // Method to insert a new node with the given value
//    public void insert(int value) {
//        root = insertRec(root, value);
//    }
//
//    // Recursive method to insert a new node
//    private Node insertRec(Node root, int value) {
//        if (root == null) {
//            root = new Node(value);
//            return root;
//        }
//
//        if (value < root.value) {
//            root.left = insertRec(root.left, value);
//        } else if (value > root.value) {
//            root.right = insertRec(root.right, value);
//        }
//
//        return root;
//    }
//
//    // Method to print the tree in-order (left, root, right)
//    public void inorder() {
//        inorderRec(root);
//    }
//
//    // Recursive method to print the tree in-order
//    private void inorderRec(Node root) {
//        if (root != null) {
//            // Traverse the left subtree
//            inorderRec(root.left);
//
//            // Visit the root node
//            System.out.print(root.value + " ");
//
//            // Traverse the right subtree
//            inorderRec(root.right);
//        }
//    }
//
//    // Method to search for a value in the BST
//    public boolean search(int value) {
//        return searchRec(root, value);
//    }
//
//    // Recursive method to search for a value
//    private boolean searchRec(Node root, int value) {
//        if (root == null) {
//            return false;
//        }
//
//        if (value == root.value) {
//            return true;
//        }
//
//        return value < root.value ? searchRec(root.left, value) : searchRec(root.right, value);
//    }
//
//    public static void main(String[] args) {
//        BinarySearchTree bt = new BinarySearchTree();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of elements to insert into the binary search tree: ");
//        int n = scanner.nextInt();
//        System.out.println("Enter " + n + " numbers one by one:");
//
//        for (int i = 0; i < n; i++) {
//            int num = scanner.nextInt();
//            bt.insert(num);
//        }
//
//        while (true) {
//            System.out.print("Enter a number to search for in the binary search tree (or type 'exit' to quit): ");
//            String input = scanner.next();
//
//            if (input.equalsIgnoreCase("exit")) {
//                break;
//            }
//
//            int numToSearch;
//            try {
//                numToSearch = Integer.parseInt(input);
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input. Please enter a valid number or type 'exit' to quit.");
//                continue;
//            }
//
//            boolean isFound = bt.search(numToSearch);
//            System.out.println("Number " + numToSearch + (isFound ? " is found." : " is not found."));
//        }
//
//        scanner.close();
//    }
//}
