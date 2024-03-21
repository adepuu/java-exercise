package com.adepuu.loop;

public class While {
    public static void main(String[] args) {
        // generating a sequence of numbers and performing operations on them until a certain condition is met.
        // This example demonstrates how to use a while loop to print the squares of numbers from 1 to 10,
        // but only if the square is less than or equal to 100
        int number = 1;
        while (number <= 10) {
            var square = number * number;
            if (square <= 100) {
                System.out.println("Square of " + number + " is " + square);
            }
            number++;
        }
    }
}
