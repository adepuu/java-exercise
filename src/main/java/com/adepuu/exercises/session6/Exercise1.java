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

    static double getAverage(ArrayList<Integer> numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return (double) sum / numbers.size();
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbersInput = new ArrayList<>();
        System.out.println("Enter numbers to calculate average and enter 'q' to finish");

        do{
            System.out.print("Input numbers: " );
            String inputString = input.nextLine().trim();

            if(inputString.equalsIgnoreCase("q")){
                break;
            }

            try{
                int num = Integer.parseInt(inputString);
                numbersInput.add(num);
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a valid number or 'q' to finish.");
            }

        } while (true);

        if(!numbersInput.isEmpty()){
            double result = getAverage(numbersInput);
             System.out.println("Result : " + result);
        } else {
            System.out.println("No numbers detected");
        }
    }
}
