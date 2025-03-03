package com.adepuu.exercises.session11;

public class Queue {
    public static void main(String[] args) {
            LinkedList<String> listQueue = new LinkedList<>();

            listQueue.enqueue("1");
            listQueue.enqueue("2");
            listQueue.enqueue("3");
            listQueue.enqueue("4");
            listQueue.enqueue("5");

            listQueue.printList();
            System.out.println("Peek: " + listQueue.peek());
            System.out.println("Dequeue: " + listQueue.dequeue());
            System.out.println("Peek: " + listQueue.peek());
            listQueue.printList();
    }
}
