package com.adepuu.exercises.session5;

import java.util.Scanner;

public class Exercise8 {
    /**
     * Java String Program to Find all Duplicates on Array
     *
     * Example 1:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     *
     * Example 2:
     * Input: nums = [1,1,2]
     * Output: [1]
     *
     * Example 3:
     * Input: nums = [1]
     * Output: []
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = input.nextInt();

        System.out.println("Print the duplicate number: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = input.nextInt();
        for (int k = 0; k < nums.length; k++)
            for (int j = k+1; j < nums.length; j++)
                if (j!=k && nums[k] == nums[j]){
                    System.out.print(nums[k]+" ");
                }

        input.close();
    }
}
