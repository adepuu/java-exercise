package com.adepuu.exercises.session11;
import java.util.*;

public class BinarySearchTree <Target> {
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

    /*
    private final Target value;
    private final List<BinarySearchTree<Target>> childNodes;

    public BinarySearchTree(Target value) {
        this.value = value;
        this.childNodes = new LinkedList<>();
    }
    public List<BinarySearchTree<Target>> getChildNode() {
        return childNodes;
    }

    public Target getValue() {
        return value;
    }

    public  void addChild(BinarySearchTree<Target> childNodes) {

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    }

     */


    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private TreeNode insertRec(TreeNode root, int key) {

        if (root == null) {
            root = new TreeNode(key);
            return root;
        }

        if (key == root.data) {
            System.out.println("Warning: Number " + key + " already exists in the binary search tree. Please enter another number.");
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Enter another number: ");
                int newKey = scanner.nextInt();
                if (newKey != key) {
                    root = insertRec(root, newKey);
                    break;
                }
            }

            return root;
        }

        /*
        if (key == root.data) {
            System.out.println("Warning: Number " + key + " already exists in the binary search tree. Please enter another number.");
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Enter another number: ");
                if (scanner.hasNextInt()) {
                    int newKey = scanner.nextInt();
                    if (newKey != key) {
                        root = insertRec(root, newKey);
                        break;
                    } else {
                        System.out.println("Duplicate number. Please enter a different number.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next();
                }
            }
            return root;
        }
         */

        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(TreeNode root, int key) {

        if (root == null || root.data == key) {
            return root != null;
        }

        if (root.data < key) {
            return searchRec(root.right, key);
        }

        return searchRec(root.left, key);
    }



    public void getData(int n) {
        ArrayList<Integer> data = new ArrayList<>();
        TreeNode tempData = root;

        for(int i = 0; i < n; i++) {
            data.add(tempData.data);
            tempData =  tempData.right;

        }

        System.out.println(data.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        System.out.print("Enter the number of elements (N): ");
        int n = scanner.nextInt();
        int number;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            bst.insert(scanner.nextInt());
        }



        while (true) {
            System.out.print("Enter a number to looking for (or 'q' to exit): ");
            String input = scanner.next();

            if (input.equals("q")) {
                System.out.print("Your Data : ");
                bst.getData(n);
                System.out.println("Exiting program and thank you !");
                break;
            }

            try {
                number = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number or 'q' to terminate.");
//                continue;
                break;
            }

            if (bst.search(number)) {
                System.out.println("Number " + number + " is found in the binary search tree.");
            } else {
                System.out.println("Number " + number + " is not found in the binary search tree.");
            }
        }

        scanner.close();
    }
}





