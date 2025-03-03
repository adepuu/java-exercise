package com.adepuu.exercises.session11;

class Nodes {
    int data;
    Nodes next;

    public Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}


public class Queue {
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
    private Nodes front;
    private Nodes rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueueList(int data) {
        Nodes newNode = new Nodes(data);
        if (isNotEmpty()) {
            rear.next = newNode;
            rear = newNode;
        } else {
            front = newNode;
            rear = newNode;
        }
    }

    public int dequeueList() {
        if (isNotEmpty()) {
            int data = front.data;
            if (front == rear) {
                rear = null;
            }
            front = front.next;
            return data;
        }
        else{
            System.out.println("Queue is empty");
            return -1;
        }
    }

    public int peekQueue() {
        if (isNotEmpty()) {
            return front.data;
        }
        else{
            System.out.println("Queue is empty");
            return -1;
        }
    }

    public boolean isNotEmpty() {
        return front != null;
    }

    public void print() {
        Nodes current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.dequeueList();
        queue.enqueueList(1);
        queue.enqueueList(2);
        queue.enqueueList(3);
        queue.enqueueList(4);

        System.out.println(queue.dequeueList());
        System.out.println(queue.dequeueList());
        System.out.println(queue.dequeueList());
        System.out.println(queue.peekQueue());
        System.out.println(queue.dequeueList());
        System.out.println(queue.peekQueue());
    }
}
