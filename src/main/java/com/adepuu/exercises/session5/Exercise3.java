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

    public static boolean checkDuplicate (int[] arr) {
        int i = 0;

        while (i < arr.length) {
            for(int j = i + 1; i < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1};

        System.out.println(checkDuplicate(array));
    }
}
