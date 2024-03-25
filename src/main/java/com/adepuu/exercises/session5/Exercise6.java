package com.adepuu.exercises.session5;

import java.util.ArrayList;

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
    public static void main(String[] args) {
        int[] input={1, 2, 1, 3, 5, 1};
        int key = 1;
        var result = removeTargetKey(input,key);
        System.out.println(result);
    }

    public static ArrayList<Integer> removeTargetKey(int[] input, int key){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : input) {
            if (i != key) {
                result.add(i);
            }
        }
        return result;
    }
}
