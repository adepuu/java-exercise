package com.adepuu.dsa.datastructure;

public class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full. Cannot enqueue " + value);
        } else {
            queueArray[++rear] = value;
        }
    }

    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        } else {
            return queueArray[front++];
        }
    }

    public int peek() {
        if (front > rear) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            return queueArray[front];
        }
    }

    public static void main(String[] args) {

    }
}
