package com.adepuu.exercises.session11;

import java.util.LinkedList;
import java.util.List;

public class Stack<T> {
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
    private List<T> resultList;

    public Stack() {
        this.resultList = new LinkedList<>();
    }

    public void push(T value) {
        resultList.addLast(value);
    }

    public T pop() {
        if (resultList.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }

        return resultList.removeLast();
    }

    public void shift(T value) {
        resultList.addFirst(value);
    }

    public T unshift() {
        if (resultList.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }

        return resultList.removeFirst();
    }

    public T peek() {
        if (resultList.isEmpty()) {
            System.out.println("Stack is empty");
        }
        return resultList.getLast();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek()); // -> 3

//        stack.shift(4);
//        stack.shift(5);
//        System.out.println(stack.peek()); // -> 3

        System.out.println(stack.pop()); // -> 3
        System.out.println(stack.peek()); // -> 2

//        System.out.println(stack.unshift()); // -> 5
//        System.out.println(stack.peek()); // -> 2
    }
}
