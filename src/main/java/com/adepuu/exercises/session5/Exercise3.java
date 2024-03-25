package com.adepuu.exercises.session5;

import java.util.ArrayList;

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

    static boolean isContainDuplicate(int[] nums) {
        ArrayList<Integer> uniqueNums = new ArrayList<>();

        for(int num: nums) {
            if(uniqueNums.contains(num)) {
                return true;
            } else {
                uniqueNums.add(num);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] nums2 = {1, 1, 2, 3};
        int[] nums3 = {1, 2, 3, 1};

        System.out.println(isContainDuplicate(nums));
        System.out.println(isContainDuplicate(nums2));
        System.out.println(isContainDuplicate(nums3));
    }
}
