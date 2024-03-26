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
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        boolean isDone = false;
        
        do {
            System.out.print("Input a number or 'q' to finish : ");
            String tempText = numInput.nextLine();
            if(tempText.equals("q")){
                isDone = true;
            }else{
                try{
                    nums.add(Integer.parseInt(tempText));
                }
                catch(NumberFormatException e){
                    System.out.println("Invalid input. Please enter a valid number or 'q' to finish.");
                }
            }
        } while (!isDone);

        int tempNum = 0;
        int avgNum = 0;
        for(int number : nums){
            avgNum += number;
            tempNum += 1;
        }

        System.out.println("This is your numbers : "+nums.toString());
        System.out.println("This is your average numbers : " + (avgNum/tempNum) );
        numInput.close();
    }
}
