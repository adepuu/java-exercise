package com.adepuu.exercises.session5;

import java.util.ArrayList;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        ScanArray inputNumber = new ScanArray();

        nums = inputNumber.inputArray();

        System.out.println("It is your number : " + nums.toString());
        
        for(int i = 0; i < nums.size(); i++){
            for(int j = i+1; j < nums.size(); j++){
                if(nums.get(i)==nums.get(j)){
                    nums.remove(j);
                    j--;
                }
            }
        }
        System.out.println("It is your number without duplicate : "+nums.toString());
    }
}
