package com.adepuu.exercises.session5;

import java.util.HashSet;
import java.util.Set;

public class Exercise3HashSet {
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
        Set<Integer> seen = new HashSet<>();
        for (int num : input) {
            if (!seen.add(num)) {
                return true; // Found a duplicate
            }
        }
        return false; // No duplicates found
    }
}
