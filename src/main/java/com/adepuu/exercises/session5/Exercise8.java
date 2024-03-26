package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

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
        int[] input = {4,3,2,7,8,2,3,1};
        int[] input2 = {1,1,2};
        System.out.println(findDuplicates(input));
        System.out.println(findDuplicates(input2));
    }

    public static ArrayList<Integer> findDuplicates(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int num : nums){
            if(seen.contains(num)){
                result.add(num);
            }
            else{
                seen.add(num);
            }
        }
        return result;
    }
}
