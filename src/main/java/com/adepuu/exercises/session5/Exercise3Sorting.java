package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise3Sorting {
    /**
     * Write a Java Program to Check if Array Contain Duplicates
     * <p>
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     * <p>
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     * <p>
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */
    public boolean checkDuplicates(int[] input) {
        Arrays.sort(input); // Sort the array
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] == input[i + 1]) {
                return true; // Found a duplicate
            }
        }
        return false; // No duplicates found
    }
}
