package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

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

    static ArrayList<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int newValue = map.get(nums[i]) + 1;
                result.add(nums[i]);
                map.put(nums[i], newValue);
            } else {
                map.put(nums[i], 1);
            }
        }

        Collections.sort(result);

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1, 1};
        System.out.println(findDuplicates(nums));
    }
}
