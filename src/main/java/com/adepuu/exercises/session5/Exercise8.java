package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public static List<Integer> findAllDuplicates () {
        int[] arr = {4,3,2,7,8,2,3,1};

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < arr.length - 1; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i]==arr[j]){
                    result.add(arr[i]);
                }
            }
        }
        Collections.sort(result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println("result = " + findAllDuplicates());
    }
}
