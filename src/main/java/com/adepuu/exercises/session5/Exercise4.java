package com.adepuu.exercises.session5;

import java.util.ArrayList;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */
    static ArrayList<Integer> removeDuplicate(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int num: nums) {
            if(!result.contains(num)) {
                result.add(num);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(removeDuplicate(nums));
        System.out.println(removeDuplicate(nums2));
    }
}
