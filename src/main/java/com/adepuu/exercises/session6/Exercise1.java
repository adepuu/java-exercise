package com.adepuu.exercises.session6;

import java.util.ArrayList;
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

    public static ArrayList<Integer> getInputNumbers() {
        Scanner inputNumber = new Scanner(System.in);
        ArrayList<Integer> arrayNumber = new ArrayList<>();
        boolean isCheck = false;

        do {
            System.out.print("Input a number or 'q' to finish: ");
            String tempText = inputNumber.nextLine();

            if (tempText.equals("q")) {
                isCheck = true;
            } else {
                try {
                    arrayNumber.add(Integer.parseInt(tempText));
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input, Please enter a valid number or 'q' to finish: ");
                }
            }
        } while (!isCheck);

        return arrayNumber;
    }

    public static double calculateAverage(ArrayList<Integer> numbers) {
        double sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return numbers.isEmpty() ? 0 : sum / numbers.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayNumber = getInputNumbers();
        if (!arrayNumber.isEmpty()) {
            double average = calculateAverage(arrayNumber);
            System.out.println("This is your numbers: " + arrayNumber.toString());
            System.out.println("The average number is: " + average);
        } else {
            System.out.println("No numbers entered. Exiting program.");
        }
    }
}
