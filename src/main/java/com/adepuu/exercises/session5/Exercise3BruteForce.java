package com.adepuu.exercises.session5;

public class Exercise3BruteForce {
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
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j]) {
                    return true; // Found a duplicate
                }
            }
        }
        return false; // No duplicates found
    }
}
