package com.adepuu.exercises.session11;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public T pop() {
        if (head == null) {
            System.out.println("Cannot pop from an empty list.");
            return null;
        }

        T data = head.data;
        head = head.next;
        return data;
    }

    public T peek() {
        if (head == null)
            return null;
        return head.data;
    }

    public void enqueue(T data) {
        Node<T>newNode =new Node<>(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public T dequeue() {
        if (head == null) {
            System.out.println("Cannot dequeue from an empty list.");
            return null;
        }

        T data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }


    public void printList() {
        Node<T> currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

}