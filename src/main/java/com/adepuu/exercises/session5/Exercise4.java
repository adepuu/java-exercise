package com.adepuu.exercises.session5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */
    public static void main(String[] args) {
        int[] input={1, 2, 2, 3, 3, 3, 4, 5};
        var result = removeDuplicates(input);
        System.out.println(result);
    }

    public static ArrayList<Integer> removeDuplicates(int[] input){
        ArrayList<Integer> result = new ArrayList<>();
        if (input.length > 0) {
            result.add(input[0]);
        }
        for (int i = 1; i < input.length; i++) {
            if (input[i] != input[i - 1]) {
                result.add(input[i]);
            }
        }
        return result;
    }
}
