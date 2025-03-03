package com.adepuu.exercises.session11;

class Node<T> {
    T data;
    Node<T> next;
    Node<T> left;
    Node<T> right;

    public Node(T data) {
        this.data = data;
        this.next = null;
        this.left = null;
        this.right = null;
    }
}