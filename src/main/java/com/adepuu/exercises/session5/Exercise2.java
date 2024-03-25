package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    static void arrayRotation (int[] arr, int d){
        for (int i=0; i<d; i++){
            int temp = arr[0];
            for (int j=1; j<arr.length; j++){
                arr[j-1] = arr[j];
            }
            arr[arr.length-1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] input = {1,2,3,7,8,9};
        int dRotate = 3;
        arrayRotation(input,dRotate);
        System.out.println(Arrays.toString(input));
    }
}
