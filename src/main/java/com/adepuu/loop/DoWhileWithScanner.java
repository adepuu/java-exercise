package com.adepuu.loop;

import java.util.ArrayList;
import java.util.Scanner;

public class DoWhileWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        int input;
        String response;

        do {
            System.out.println("Enter a number (or type 'stop' to finish): ");
            input = scanner.nextInt();
            inputs.add(input);
            System.out.println("Do you want to enter more numbers? (y/n) ");
            response = scanner.next();
        } while (response.equalsIgnoreCase("y"));

        // Process the inputs (e.g., print them)
        System.out.println("You entered: ");
        for (Integer num : inputs) {
            System.out.println(num);
        }
    }
}
