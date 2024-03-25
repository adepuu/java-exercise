package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise5 {
    /**
     * Java Array Program to sort array in increasing & decreasing order
     *
     * Example 1:
     * Input: [ 8, 7, 5, 2], direction = "asc"
     * Output: [ 2, 5, 7, 8 ]
     *
     * Example 2:
     * Input: [ 8, 7, 5, 2], direction = "desc"
     * Output: [ 8,7, 5, 2 ]
     */

   public static void sortAsc()
    {
        int[] arr = {8, 7, 5, 2};
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                  min_idx = j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

      System.out.println("result = " + Arrays.toString(arr));
    }

  public static void sortDesc()
  {
    int[] arr = {8, 6, 7, 5, 2};
    int n = arr.length;

    for (int i = 0; i < n-1; i++)
    {
      int max_idx = i;
      for (int j = i+1; j < n; j++) {
        if (arr[j] > arr[max_idx]) {
          max_idx = j;
        }
      }

      int temp = arr[max_idx];
      arr[max_idx] = arr[i];
      arr[i] = temp;
    }

    System.out.println("result = " + Arrays.toString(arr));
  }

    public static void main(String[] args) {
        sortAsc();
        sortDesc();
    }
}
