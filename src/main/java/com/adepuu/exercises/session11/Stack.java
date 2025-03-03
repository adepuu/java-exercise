package com.adepuu.exercises.session11;

import java.util.LinkedList;

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
    private LinkedList<T> stackList;
    Stack(){
        stackList = new LinkedList<>();
    }

    public boolean isEmpty(){
        return stackList.isEmpty();
    }
    public void push(T value){
        stackList.addLast(value);
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty. Cannot pop.");
        } else {
             stackList.removeLast();
        }
    }
    public T peek(){
        if(isEmpty()){
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        } else {
            return stackList.getLast();
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        System.out.println("1."+ stack.peek());
        stack.push(2);
        System.out.println("2."+ stack.peek());
        stack.push(3);
        System.out.println("3."+ stack.peek());
        stack.push(4);
        System.out.println("4."+ stack.peek());
        stack.push(5);
        System.out.println("5."+ stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("6."+ stack.peek());



//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
    }





}
