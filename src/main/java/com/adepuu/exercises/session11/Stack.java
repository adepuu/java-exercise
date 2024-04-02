package com.adepuu.exercises.session11;

import java.util.LinkedList;

public class Stack {
    private int value;
    private static int size = 0;
    private Stack next;
    private Stack head;
    private LinkedList<Integer> stackArray;

    public Stack(int value) {
        this.value = value;
        next = null;
    }

    public Stack() {
        stackArray = new LinkedList<>();
    }

    public void push(int value){
        Stack newNode = new Stack(value);
        if(head == null){
            head = newNode;
            stackArray.add(newNode.value);
            System.out.println(+ newNode.value + " Value has been added");
            size++;
        }else{
            newNode.next = head;
            head = newNode;
            stackArray.add(newNode.value);
            System.out.println(+ newNode.value + " Value has been added");
            size++;
        }
    }

    public int pop() {
        if (head == null) {
            System.out.println("Stack is Empty");
            return 0;
        } else {
            int value = head.value;
            head = head.next;
            stackArray.remove(size-1);
            return value;
        }
    }
//
    public void peek() {
        if (stackArray.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            int value = head.value;
            System.out.println("Peek value : " + head.value);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.pop() + " Has been pop");
        System.out.println(stack.pop() + " Has been pop");
        System.out.println(stack.pop() + " Has been pop");
        System.out.println(stack.pop() + " Has been pop");
        System.out.println();
        stack.peek();
    }
}

    /**
     * Write a Java stack program that can scale dynamically
     * <p>
     * As a developer, I want to implement a Java stack program that can scale dynamically using a linked list, so that I can efficiently manage data storage and retrieval in my applications.
     * Notes:
     * The program doesn't require a menu system; focus should be on data structure implementation.
     * <p>
     * Acceptance Criteria:
     * - Functionality: The program must be able to perform basic stack operations (push, pop, peek) on a linked list.
     * - Dynamic Scaling: The stack should automatically scale in size as elements are added or removed, without any manual resizing required by the user.
     * - Performance: The program should maintain constant time complexity for push and pop operations, ensuring efficient data management.
     * - Memory Efficiency: The stack should use memory efficiently, allocating and deallocating memory dynamically as needed.
     * - Error Handling: The program should handle edge cases gracefully, such as attempting to pop an element from an empty stack, and provide clear error messages.
     */


