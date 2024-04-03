package com.adepuu.exercises.session11;

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

        private Nodes top;

        public Stack() {
            this.top = null;
        }

        public void push(int data) {
            Nodes newNode = new Nodes(data);
            if (top == null) {
                top = newNode;
            } else {
                newNode.next = top;
                top = newNode;
            }
        }

    public int pop() {
        if(isNotEmpty()){
            int data = top.data;
            top = top.next;
            return data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public int peek() {
        if(isNotEmpty()){
            return top.data;
        }
        System.out.println("Stack is empty");
        return -1;
    }

    public boolean isNotEmpty() {
        return top != null;
    }

        public void print() {
            Nodes current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(6);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push(5);
        stack.push(6);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}
