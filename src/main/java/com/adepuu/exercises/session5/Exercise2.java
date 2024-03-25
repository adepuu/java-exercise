package com.adepuu.exercises.session5;

import java.util.ArrayList;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        int d = 2;
        for(int i = 0; i < d; i++){
            int tempNum = arr.get(i);
            arr.add(tempNum);
        }
        for(int i = 0; i < d; i++){
            arr.remove(0);
        }
        System.out.println(arr.toString());
    }
}
