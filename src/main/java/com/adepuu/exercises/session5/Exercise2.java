package com.adepuu.exercises.session5;

import java.awt.*;
import java.util.Scanner;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input n: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Input array: ");
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("\nInput number of value you want to rotate: ");
        int d = input.nextInt();
        int inisiate = 1;

        while( inisiate <= d){
            int right = arr[0];
            for (int i = 0; i < arr.length - 1; i++){
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = right;
            inisiate++;
        }

        System.out.println();

        System.out.println("Result of rotate: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
