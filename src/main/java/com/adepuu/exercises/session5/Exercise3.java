package com.adepuu.exercises.session5;

import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = input.nextInt();
        boolean duplicates = false;

        System.out.println("Check the duplicate number: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = input.nextInt();
        for (int k = 0; k < nums.length; k++)
            for (int j = k+1; j < nums.length; j++)
                if (j!=k && nums[k] == nums[j]){
                    duplicates=true;
                }
        System.out.println(duplicates);

        input.close();
    }
}
