package com.adepuu.exercises.session11;

import java.util.LinkedList;
import java.util.Scanner;

public class Queue {
    /**z
     * Write a Java queue program that can scale dynamically
     * <p>
     * As a developer, I want to implement a Java queue program that can scale dynamically using a linked list, so that I can efficiently manage data storage and retrieval in my applications.
     * <p>
     * Notes:
     * The program doesn't require a menu system; focus should be on data structure implementation.
     * <p>
     * Acceptance Criteria:
     * - Functionality: The program must be able to perform basic queue operations (enqueue, dequeue, peek) on a linked list.
     * - Dynamic Scaling: The queue should automatically scale in size as elements are added or removed, without any manual resizing required by the user.
     * - Performance: The program should maintain constant time complexity for enqueue and dequeue operations, ensuring efficient data management.
     * - Memory Efficiency: The queue should use memory efficiently, allocating and deallocating memory dynamically as needed.
     * - Error Handling: The program should handle edge cases gracefully, such as attempting to dequeue an element from an empty queue, and provide clear error messages.
     */
    private Node head;
    private Node tail;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println(value + " Value has been added");
    }

    public void dequeue() {
        if (head == null) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(head.data + " Value has been removed");
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    public int peek() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return 0;
        } else {
            System.out.println("Peek value : " + head.data);
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(5);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(3);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.peek();
    }
}
