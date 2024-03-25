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
        bubbleSort(input);
        var result = removeDuplicates(input);
        System.out.println(result);
    }

    public static void bubbleSort(int[] input){
        for (int i = 0; i < input.length-1; i++) {
            for (int j = 0; j < input.length-i-1 ; j++) {
                if(input[j]>input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
    }
    public static ArrayList<Integer> removeDuplicates(int[] input){
        ArrayList<Integer> result = new ArrayList<>();
        int j=input[0];
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
