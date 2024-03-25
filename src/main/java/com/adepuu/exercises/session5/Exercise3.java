package com.adepuu.exercises.session5;

public class Exercise3 {
    /**
     * Write a Java Program to Check if Array Contain Duplicates
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */
    public static boolean containsDuplicate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true; // Found a duplicate
                }
            }
        }
        return false; // No duplicates found
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println("Example 1: " + containsDuplicate(nums1));
        System.out.println("Example 2: " + containsDuplicate(nums2));
        System.out.println("Example 3: " + containsDuplicate(nums3));
    }
}
