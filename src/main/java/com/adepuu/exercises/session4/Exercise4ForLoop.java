package com.adepuu.exercises.session4;

public class Exercise4ForLoop {

    public static void main(String[] args) {
        int end = 100; // Define the limit for the FizzBuzz game

        for (int i = 1; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

