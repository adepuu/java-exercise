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

    private Node<T> insertRec(Node<T> root, T data) {
        if (root == null) {
            return new Node<>(data);
        }

        Integer value = (Integer) data;
        Integer rootValue = (Integer) root.data;

        if (root.data.equals(data)) {
            return root;
        }

        if (value < rootValue) {
            root.left = insertRec(root.left, data);
        } else if (value > rootValue) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void insert(T data) {
        head = insertRec(head, data);
    }

    private boolean searchRec(Node<T> root, T data) {
        if (root == null) {
            return false;
        }

        if (root.data.equals(data)) {
            return true;
        }

        boolean found = false;
        if (root.left != null) {
            found = searchRec(root.left, data);
        }
        if (!found && root.right != null) {
            found = searchRec(root.right, data);
        }
        return found;
    }

    public String search(T data) {
        return searchRec(head, data) ? data + " is available." : data + " is not available.";
    }


    public void printList() {
        Node<T> currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    private void printInOrderRec(Node<T> root) {
        if (root != null) {
            printInOrderRec(root.left);
            System.out.println(root.data + " ");
            printInOrderRec(root.right);
        }
    }

    public void printInOrder() {
        printInOrderRec(head);
    }

}