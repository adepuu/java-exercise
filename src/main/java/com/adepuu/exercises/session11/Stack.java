package com.adepuu.exercises.session11;

import java.util.LinkedList;

public class Stack {
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

    private LinkedList<String> stackList;

    public Stack(){
        stackList = new LinkedList<>();
    }

    // Push from LinkedList
    public void push(String item) {
        stackList.add(item);
    }

    // Pop from LinkedList
    public String pop() {
        String tempString = stackList.getLast();
        stackList.remove(stackList.size() - 1);
        return (tempString + " removed from stack");
    }

    // Peek from LinkedList
    public String peek() {
        return ("The top of the stack is " + stackList.getLast());
    }

    public static void main(String[] args) {
        Stack cardStack = new Stack();
        cardStack.push("Ace");
        cardStack.push("Two");
        cardStack.push("Three");
        cardStack.push("Four");
        cardStack.push("Five");
        cardStack.push("Six");
        cardStack.push("Seven");
        cardStack.push("Eight");
        cardStack.push("Nine");
        cardStack.push("Ten");
        cardStack.push("Jack");
        cardStack.push("Queen");
        cardStack.push("King");

        System.out.println(cardStack.peek());
        System.out.println("");
        System.out.println(cardStack.pop());
        System.out.println(cardStack.pop());
        System.out.println("");
        System.out.println(cardStack.peek());
    }
}
