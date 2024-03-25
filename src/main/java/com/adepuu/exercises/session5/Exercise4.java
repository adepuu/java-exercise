package com.adepuu.exercises.session5;

import java.util.Scanner;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = input.nextInt();
        int[] nums = new int[n];
        int j = 0;

        System.out.println("Input array number: ");
        for (int i = 0; i < n; i++)
            nums[i] = input.nextInt();
            for (int k = 0; k < nums.length - 1; k++)
                if (nums[k] != nums[k+1]){
                    nums[j++] = nums[k];
                }
            nums[j++] = nums[n-1];
            for (int k = 0; k < j; k++)
                System.out.print(nums[k]+" ");

        input.close();
    }
}
