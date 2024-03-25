package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise8 {
    /**
     * Java String Program to Find all Duplicates on Array
     * <p>
     * Example 1:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     * <p>
     * Example 2:
     * Input: nums = [1,1,2]
     * Output: [1]
     * <p>
     * Example 3:
     * Input: nums = [1]
     * Output: []
     */
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> passed = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : nums) {
            if (!passed.add(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }
}
