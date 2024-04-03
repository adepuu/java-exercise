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
    private int maxSize;
    private int front;
    private int rear;
    private LinkedList<Integer> queueList;

    public Queue(int size) {
        queueList = new LinkedList<Integer>();
    }

    public void enqueue(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full. Cannot enqueue " + value);
        } else {
            value = ++rear;
            queueList.add(value);
        }
    }

    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        } else {
            return queueList.remove(front);
        }
    }

    public int peek() {
        if (front > rear) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            return queueList.peek();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue queue = new Queue(100);

        int n = input.nextInt();

        for (int i = 0; i < n; i++){
            queue.enqueue(input.nextInt());
        }

        System.out.println("Element Deque: "+queue.dequeue());
        System.out.println("Element Deque: "+queue.dequeue());
        System.out.println(queue.peek());
    }
}
