package com.adepuu.exercises.session11;

import java.util.LinkedList;
import java.util.List;

public class Queue<T> {
    /**
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

    private List<T> resultList;

    public Queue() {
        this.resultList = new LinkedList<>();
    }

    public void enqueue(T value) {
        resultList.addLast(value);
    }

    public T dequeue() {
        if (resultList.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return resultList.removeFirst();
    }

    public T peek() {
        if (resultList.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        return resultList.getFirst();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.dequeue()); // -> 1
        System.out.println(queue.dequeue()); // -> 2
        System.out.println(queue.peek()); // -> 3
    }
}
