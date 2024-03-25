package com.adepuu.exercises.session5;

import java.util.HashSet;

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
        int[] arr = {5,4,2,667,73,12,56,32,4};
        System.out.println(isDuplicate(arr));
    }

    public static boolean isDuplicate(int[] inputArray){
        HashSet<Integer> seen = new HashSet<>();
        boolean duplicate = false;
        for(int num : inputArray){
            if(seen.contains(num)){
                duplicate = true;
                break;
            }
            else{
                seen.add(num);
            }
        }
        return duplicate;
    }
}
