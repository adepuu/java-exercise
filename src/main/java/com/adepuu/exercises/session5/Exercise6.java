package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);

        System.out.println("Input n: ");
        int n = input.nextInt();
        int removeValue;
        List<Integer> array = new ArrayList<>();

        System.out.println("Input array list: ");
        for (int i = 0; i < n; i++){
            array.add(input.nextInt());
        }

        System.out.println("Number to remove: ");
        removeValue = input.nextInt();
        if (array.contains(removeValue)){
            array.removeAll(Collections.singleton(removeValue));
        }

        System.out.println("result: "+array);
    }
}
