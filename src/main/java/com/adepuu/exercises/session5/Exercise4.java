package com.adepuu.exercises.session5;

import java.util.HashSet;
import java.util.Set;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */

    public static void removeDuplicateElements () {
        //int[] input = { 1, 2, 2, 3, 3, 3, 4, 5 };
        int[] input = { 1, 3, 3, 2, 2, 5, 1 };
        Set<Integer> uniqueElements = new HashSet<>();
        for (int value : input) {
            uniqueElements.add(value);
        }

        System.out.println(uniqueElements);
    }
    public static void main(String[] args) {
        removeDuplicateElements();
    }
}
