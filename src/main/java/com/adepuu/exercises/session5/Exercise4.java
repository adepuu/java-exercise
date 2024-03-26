package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.HashMap;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */
    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 3, 3, 4, 5};
        System.out.println(removeDuplicates(input));
    }

    public static ArrayList<Integer> removeDuplicates(int[] inputArray){
        HashMap<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < inputArray.length; i++){
            if (map.get(inputArray[i]) == null) {
                result.add(inputArray[i]);
                map.put(inputArray[i], true);
            }
        }

        return result;
    }
}
