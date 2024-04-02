package com.adepuu.exercises.session11;

import java.util.LinkedList;
import java.util.List;

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




    public List<Integer> listStack;









    public Stack (){
        this.listStack = new LinkedList<>();

    }

    public void push(int y){
        this.listStack.add(y);


    }


    public void pop(){

        try{
            this.listStack.removeLast();

        } catch (Exception e){
            System.out.println("Masih kosonng");

        }

    }

    public int peek(){

        try {
            return this.listStack.getLast();
        } catch (Exception e){
            return 0;
        }
    }

    public static void main(String[] args) {

        Stack listBaru = new Stack();
        listBaru.pop();
        System.out.println(listBaru.peek());
        listBaru.push(20); // data pertama distack
        listBaru.push(30); // data kedia di stack
        listBaru.push(40); // data ketiga di stack
        listBaru.push(50); // data keempat di stack
        listBaru.push(60); // data kelima di stack
        System.out.println("Mengeluarkan dari stack");
        System.out.println(listBaru.peek()); // mengambil nilai terakhir di stack
        System.out.println("Mengeluarkan dari stack");
        listBaru.pop(); // mengeluarkan nilai diatas stack
        System.out.println(listBaru.peek());
        System.out.println("Menambah stack");
        listBaru.push(70); // tambahan data baru ke enam
        System.out.println(listBaru.peek());






    }
}
