package com.adepuu.exercises.session5;

import java.util.Scanner;
public class Exercise3 {
    /**
     * Write a Java Program to Check if Array Contain Duplicates
     *
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     *
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter number = ");
        String numArr = myInput.nextLine();
        String[] numArrInt = numArr.replaceAll("\\[","")
                .replaceAll("]","").split(",");
        int[] input = new int[numArrInt.length];
        int i = 0;
        for(String num : numArrInt){
            input[i] =Integer.valueOf(num);
            i++;
        }
        System.out.println("Output = " + isDuplicate(input));

    }

    public static boolean isDuplicate(int[] input){
        for(int i = 0; i < input.length-1;i++){
            for(int j = i+1; j < input.length;j++){
                if(input[i] == input[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
