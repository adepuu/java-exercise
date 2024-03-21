package com.adepuu.loop;

public class DoWhile {
    public static void main(String[] args) {
        // This example demonstrates a simple countdown from a given number to 1.
        int count = 10; // Starting number
        do {
            System.out.println(count);
            count--; // Decrement the count
        } while (count > 0); // Continue until count is not greater than 0

        // This example demonstrates generating random numbers within a specified range
        // until a certain condition is met.
        int randomNumber;
        int countB = 0;
        int maxCount = 5; // Maximum number of random numbers to generate

        do {
            randomNumber = (int) (Math.random() * 100) + 1; // Generate a random number between 1 and 100
            System.out.println("Random number: " + randomNumber);
            countB++; // Increment the count
        } while (countB < maxCount); // Continue until the count reaches the maximum count
    }
}
