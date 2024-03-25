package com.adepuu.exercises.session5;
import java.util.*;

public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     *
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     *
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
     */
    public static int[] removeElement(int[] nums, int val) {
        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                newList.add(nums[i]);
            }
        }

        int[] result = new int[newList.size()];
        for (int i = 0; i < newList.size(); i++) {
            result[i] = newList.get(i);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1, 3, 5, 1};
        int[] nums2 = {1, 2, 1, 3, 5, 1};

        int[] result1 = removeElement(nums1, 1);
        int[] result2 = removeElement(nums2, 5);

        System.out.print("Result 1: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Result 2: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
