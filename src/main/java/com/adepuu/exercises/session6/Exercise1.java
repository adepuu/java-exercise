package com.adepuu.exercises.session6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
    /**
     * Write a Java Program to Enter numbers to calculate average and enter 'q' to finish.
     *
     * Input: 1, 2, 3, 4, 5, q
     * Output: 3
     *
     * Input: 1, 2, 3, a, b, 4, 5, q
     * Output: 3
     *
     * Explanation: print “Invalid input. Please enter a valid number or 'q' to finish.” if user not inserting the expected number or character.
     */
    public static void main(String[] args) {
        calcAvg();
    }

    public static void calcAvg() {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        List<Integer> nums = new ArrayList<>();

        try {
            while (true) {
                System.out.print("Enter your number or press 'q' to finish: ");
                String userInput = input.next();
                if (userInput.equals("q")) {
                    break;
                }
                int num = Integer.parseInt(userInput);
                nums.add(num);
            }

            for (int num: nums) {
                sum += num;
            }
            System.out.println("This is your inputted number: " + nums);
            System.out.println("and the average is: " + (sum / nums.size()));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number or 'q' to finish.");
        }
    }
}
