package com.adepuu.exercises.session5;

import java.lang.reflect.Array;
import java.util.Arrays;

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
        int[] input = {1,2,1,3,5,1};
        System.out.println(Arrays.toString(removeDuplicates(input, 1)));
    }

    public static int[] removeDuplicates(int[] array, int key) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != key) {
                array[index] = array[i];
                index++;
            }
        }
        return Arrays.copyOf(array, index);
    }
}
