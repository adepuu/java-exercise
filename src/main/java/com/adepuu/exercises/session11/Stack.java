package com.adepuu.exercises.session11;

public class Stack {

    public static void main(String[] args) {
        LinkedList<Integer> listStack = new LinkedList<>();

        listStack.push(1);

        listStack.printList();
        System.out.println("Peek: " + listStack.peek());
        System.out.println("Pop: " + listStack.pop());
        System.out.println("Peek: " + listStack.peek());
        System.out.println("Pop: " + listStack.pop());
        listStack.printList();
    }
}