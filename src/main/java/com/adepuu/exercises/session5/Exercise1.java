package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
//    Write a Java Program to Find the Largest Element in Array
//
//    Input: [ 7, 2, 5, 1, 4]
//    Output: 7
    public static int findLargest () {
        int[] arr= {7, 2, 5, 1, 4, 8, 1, 10};
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < arr.length; ++i){
            for (int j = i+1; j < arr.length; ++j ) {
                if (arr[i] > arr[j]) {
                    result.add(arr[i]);
                    break;
                } else {
                    result.add(arr[j]);
                }

            }
        }
        return result.getLast();
    }

    public static void main(String[] args) {
        System.out.println("result = " + findLargest());;
    }
}
