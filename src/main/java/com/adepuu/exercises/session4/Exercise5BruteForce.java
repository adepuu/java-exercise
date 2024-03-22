package com.adepuu.exercises.session4;

public class Exercise5BruteForce {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 19, 11, 15, 7};
        int target = 9;
        int[] result = twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Solution is: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution");
        }
    }
}
