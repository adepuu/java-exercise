package com.adepuu.loop;

import java.util.Scanner;

public class WhileWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("Enter your input (type 'exit' to quit):");
        userInput = scanner.nextLine();

        while (!userInput.equalsIgnoreCase("exit")) {
            System.out.println("You entered: " + userInput);
            System.out.println("Enter your input (type 'exit' to quit):");
            userInput = scanner.nextLine();
        }

        System.out.println("Exiting the program.");
        scanner.close();
    }
}
