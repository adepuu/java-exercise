package com.adepuu.exercises.session5;

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
        int[] input = {1,2,3,1};
        System.out.println(containDuplicate(input));
    }

    public static boolean containDuplicate(int[] input){
        for (int i = 0; i < input.length-1; i++) {
            for (int j = i+1; j < input.length; j++) {
                if(input[i]==input[j]){
                    return true;
                }
            }
        }return false;
    }
}
