package com.adepuu.dsa.datastructure.tree;

public class Main {
    public static void main(String[] args) {
        TreeNode<String> root = new TreeNode<>("Root");
        TreeNode<String> child1 = new TreeNode<>("Child 1");
        TreeNode<String> child2 = new TreeNode<>("Child 2");
        TreeNode<String> child3 = new TreeNode<>("Child 3");

        root.addChild(child1);
        root.addChild(child2);
        child1.addChild(child3);


        String xyz = "xyz";
        var newXyz = xyz;
        // Example of traversing the tree
        printTree(root, 0);
    }

    private static void printTree(TreeNode<String> node, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print(" ");
        }
        System.out.println(node.getValue());
        for (TreeNode<String> child : node.getChildNodes()) {
            printTree(child, level + 1);
        }
    }
}
