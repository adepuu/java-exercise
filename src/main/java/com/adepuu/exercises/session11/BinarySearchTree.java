import java.util.Scanner;

static class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }
}

static TreeNode root;

static void insert(int value) {
    root = add(root, value);
}

static TreeNode add(TreeNode node, int value) {
    if (node == null) {
        return new TreeNode(value);
    }

    if (value < node.data) {
        node.left = add(node.left, value);
    } else if (value > node.data) {
        node.right = add(node.right, value);
    }

    return node;
}

static boolean search(int value) {
    return search(root, value);
}

static boolean search(TreeNode node, int value) {
    if (node == null) {
        return false;
    }

    if (value == node.data) {
        return true;
    } else if (value < node.data) {
        return search(node.left, value);
    } else {
        return search(node.right, value);
    }
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the number of elements to binary search tree:");
    int n = input.nextInt();

    System.out.println("Enter the " + n + " elements one by one:");
    for (int i = 0; i < n; i++) {
        int value = input.nextInt();
        insert(value);
    }

    while (true) {
        System.out.println("\nEnter a number to search for within the binary search tree (or type exit to quit):");
        String in = input.next();

        if (input.equals("exit")) {
            System.out.println("Exiting the program...");
            break;
        }

        try {
            int number = Integer.parseInt(in);
            boolean isFound = search(number);
            if (isFound) {
                System.out.println("Number " + number + " is found in the binary search tree");
            } else {
                System.out.println("Number " + number + " is not found in the binary search tree");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number or type exit' to quit");
        }
    }

    input.close();
}