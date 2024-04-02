package com.adepuu.dsa.datastructure;

public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top >= maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(100);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
