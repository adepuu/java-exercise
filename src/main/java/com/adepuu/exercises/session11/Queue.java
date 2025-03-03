package com.adepuu.exercises.session11;

import java.util.LinkedList;

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
    private LinkedList<T> queueList;
    Queue(){
        queueList = new LinkedList<>();
    }

    public boolean isEmpty(){
        return queueList.isEmpty();
    }

    public void enqueue(T value){
        queueList.addLast(value);
    }

    public T dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return null;
        }else {
            return queueList.removeFirst();
        }
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return null;
        } else {
            return queueList.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        System.out.println("1." + queue.peek());
        queue.enqueue(2);
        System.out.println("2." + queue.peek());
        queue.enqueue(3);
        System.out.println("3." + queue.peek());
        queue.enqueue(4);
        System.out.println("4." + queue.peek());
        queue.enqueue(5);
        System.out.println("5." + queue.peek());

        queue.dequeue();
        queue.dequeue();
        System.out.println("6." + queue.peek());


//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.peek());
    }
}
