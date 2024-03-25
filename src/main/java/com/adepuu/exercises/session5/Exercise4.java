package com.adepuu.exercises.session5;
import java.util.*;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */

    public static int[] removeDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int num : arr) {
            if(!set.contains(num)) {
                set.add(num);
                list.add(num);
            }
        }

        int[] newArray = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i);
        }

        return newArray;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 5};
        int[] result = removeDuplicate(array);

        for(int num: result) {
            System.out.print(num + " ");
        }
    }
}
