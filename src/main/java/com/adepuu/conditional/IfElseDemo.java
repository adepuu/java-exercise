package com.adepuu.conditional;

public class IfElseDemo {
    /**
     * <h1>Java Programming Demo: Conditional</h1>
     *
     * <p>This demo is designed for the 3rd meeting on Java programming, focusing exclusively on IF-ELSE statements.
     * It provides a comprehensive overview of IF-ELSE usage, including basic, nested, and compound IF-ELSE statements.</p>
     *
     * <p>For demonstrations of other programming constructs such as loops (FOR, WHILE, DO-WHILE), please refer to the
     * corresponding files in this project. Each file is structured to be run independently, allowing for a focused exploration
     * of each topic.</p>
     *
     * <p>For additional teaching materials, visit the following link:
     * <a href="https://drive.google.com/file/d/1f3ARDHXe1GIiu_h5tdgyQ7k9Z0m-PmYS/view?usp=sharing">Teaching Materials</a>.</p>
     *
     * <p>For any issues or questions, please contact the author on GitHub.</p>
     *
     * <h2>Class Overview</h2>
     * <ul>
     *     <li><code>IfElseDemo</code>: Demonstrates the use of IF-ELSE statements, including basic, nested, and compound IF-ELSE.</li>
     * </ul>
     *
     * <p>This class contains a <code>main</code> method that can be executed to run the demonstrations.</p>
     */

    public static void main(String[] args) {

        // A basic IF-ELSE statement checks a condition and executes one block of code if the condition is true,
        // and another block of code if the condition is false.
        int number = 5;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative or zero.");
        }

        // Multiple/compound IF-ELSE also known as an IF-ELSE-IF ladder, allows for checking multiple conditions
        // in a sequence. It's useful for categorizing or sorting conditions.
        int score = 85;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }


        // Nested IF-ELSE statements are used when a condition depends on another condition.
        // This is useful for checking multiple conditions in sequence.
        int numberB = 24;

        if (numberB % 2 == 0) {
            System.out.print("Even ");
            if (numberB % 6 == 0) {
                System.out.println("and divisible by 6");
            } else {
                System.out.println("and not divisible by 6");
            }
        } else {
            System.out.print("Odd ");
            if (numberB % 3 == 0) {
                System.out.println("and divisible by 3");
            } else {
                System.out.println("and not divisible by 3");
            }
        }
    }
}
