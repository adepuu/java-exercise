package com.adepuu.exercises.session5;

import java.util.Scanner;

public class Exercise5 {
    /**
     * Java Array Program to sort array in increasing & decreasing order
     *
     * Example 1:
     * Input: [ 8, 7, 5, 2], direction = “asc”
     * Output: [ 2, 5, 7, 8 ]
     *
     * Example 2:
     * Input: [ 8, 7, 5, 2], direction = “desc”
     * Output: [ 8,7, 5, 2 ]
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 4;
        int[] array = new int[n];

        System.out.println("Input Array number to Ascending: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
            System.out.print(array[i]+" ");
        }

        System.out.println();

        System.out.println("Input Array number to Descending: ");
        for (int i = 0; i < n; i++)
            array[i] = input.nextInt();
            for (int j = n - 1; j >= 0; j--)
                System.out.print(array[j]+" ");
    }
}
