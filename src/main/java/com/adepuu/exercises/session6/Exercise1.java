package com.adepuu.exercises.session6;

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
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true){
            String strInput = input.next();
            if (strInput.equals("q")){
                break;
            }
            try{
                int num = Integer.parseInt(strInput);
                sum+=num;
                count++;
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a valid number or 'q' to finish.");
            }
        }

        if (count > 0){
            double avgNumber = (double) sum / count;
            System.out.println((int)Math.round(avgNumber));
        } else {
            System.out.println("invalid");
        }
    }
}
