package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
//    Write a Java Program to Find the Largest Element in Array
//
//    Input: [ 7, 2, 5, 1, 4]
//    Output: 7
    public static void findLargest () {
        int[] arr= {7, 2, 5, 1, 4};
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < (arr.length - 1); ++i){
            if(arr[i]> arr[i + 1]){
                result.add(arr[i]);
            }
            System.out.println("result = " + result);
            return;
        }
    }

    public static void main(String[] args) {
        findLargest();
    }
}
