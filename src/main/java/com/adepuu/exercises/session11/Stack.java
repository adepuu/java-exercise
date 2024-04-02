package com.adepuu.exercises.session11;
import java.util.ArrayList;

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

    private ArrayList<Integer> stackList;

    public Stack() {
        stackList = new ArrayList<>();
    }

    public void push(int value) {
        stackList.add(value);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return stackList.size();
        } else {
            return stackList.remove(stackList.size() - 1);
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return stackList.size();
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(58);
        stack.push(80);
        stack.push(33);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
