package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     *
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     *
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
     */
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        ScanArray inputNumber = new ScanArray();
        Scanner myScanner = new Scanner(System.in);
        nums = inputNumber.inputArray();

        System.out.print("What number do you want to remove? : ");
        int removedNum = myScanner.nextInt();
        myScanner.close();

        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i)==removedNum){
                nums.remove(i);
                i--;
            }
        }
        System.out.println("This is your number without "+ removedNum +" : "+nums.toString());
    }
}
