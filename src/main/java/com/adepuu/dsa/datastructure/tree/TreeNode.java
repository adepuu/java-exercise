package com.adepuu.dsa.datastructure.tree;

import java.util.LinkedList;
import java.util.List;

public class TreeNode<T> {
    private final T value;
    private final List<TreeNode<T>> childNodes;

    public TreeNode(T value) {
        this.value = value;
        this.childNodes = new LinkedList<>();
    }

    public void addChild(TreeNode<T> childNode) {
        this.childNodes.add(childNode);
    }

    public T getValue() {
        return value;
    }

    public List<TreeNode<T>> getChildNodes() {
        return childNodes;
    }
}
