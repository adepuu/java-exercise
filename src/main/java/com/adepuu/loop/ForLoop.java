package com.adepuu.loop;

public class ForLoop {
    public static void main(String[] args) {
        // a simple for loop in Java, which is used to execute a block of code a specific number of times.
        // The loop iterates from 1 to loopCount, which is set to 10,
        // and prints the iteration number at each step
        int loopCount = 10;
        for (int iterator = 1; iterator <= loopCount; iterator++) {
            System.out.println("Iteration No " + iterator);
        }

        // both the traditional indexed for loop and the enhanced for-each loop. The code processes a String containing a name,
        // splits it into an array of names, and then prints each name using both loop types.
        String nameRaw = "Muhammad Sumbul";
        String[] nameSplitted = nameRaw.split(" ");

        // enhanced for-each loop
        for (String eachName : nameSplitted) {
            System.out.println(eachName);
        }

        // Traditional loop
        for (int iterator = 0; iterator < nameSplitted.length; iterator++) {
            System.out.println(nameSplitted[iterator]);
        }

        // Demonstrates the use of the break statement within a for loop in Java
        // to terminate the loop prematurely when a specific condition is met.
        // This example searches for a character within an array and prints a message
        // indicating the character's presence and its index.
        char[] names = {'A', 'B', 'C', 'D'};
        char searchTarget = 'B';

        for (int i = 0; i < names.length; i++) {
            if (names[i] == searchTarget) {
                System.out.println(searchTarget + " Found at index " + i);
                break;
                // then quit the loop
            }
            System.out.println(names[i] + " is not " + searchTarget);
        }

        // This example demonstrates how to use continue within a for loop to skip over elements
        // that do not meet a certain criteria, such as filtering out even numbers from a list of integers.
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            // Skip even numbers
            if (numbers[i] % 2 == 0) {
                continue;
            }
            System.out.println(numbers[i]);
        }
    }
}
