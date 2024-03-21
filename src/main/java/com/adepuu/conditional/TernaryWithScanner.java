package com.adepuu.conditional;

import java.util.Scanner;

public class TernaryWithScanner {
    public static void main(String[] args) {
        // This example takes user input for marks and uses the ternary operator
        // to determine if the user has passed or failed the exam based on the marks entered
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        double marks = input.nextDouble();
        String result = (marks > 40) ? "pass" : "fail";
        System.out.println("You " + result + " the exam.");
        input.close();
    }
}
