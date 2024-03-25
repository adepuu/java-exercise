package com.adepuu.exercises.session5;

import java.util.ArrayList;

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
            int[] input={4,3,2,7,8,2,3,1};
            var result = findDuplicates(input);
            System.out.println(result);
        }

        public static ArrayList<Integer> findDuplicates(int[] input){
            ArrayList<Integer> result = new ArrayList<>();
            int j=1;
            for (int i=0;i<input.length;i++) {
                if (input[i] == input[i+1] ) {
                    result.add(i);
                }
            }
            return result;
        }
    }