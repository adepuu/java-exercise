package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    static ArrayList<Integer> removeAllOccurrences(Integer[] arr, int key) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int item: arr) {
            if(item != key) {
                result.add(item);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 1, 3, 5, 1};
        System.out.println(removeAllOccurrences(nums,1));
    }
}
