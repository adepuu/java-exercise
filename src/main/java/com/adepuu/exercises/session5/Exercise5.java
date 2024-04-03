package com.adepuu.exercises.session5;


public class Exercise5 {
    /**
     * Java numbersay Program to sort numbersay in increasing & decreasing order
     * <p>
     * Example 1:
     * Input: [ 8, 7, 5, 2], direction = “asc”
     * Output: [ 2, 5, 7, 8 ]
     * <p>
     * Example 2:
     * Input: [ 8, 7, 5, 2], direction = “desc”
     * Output: [ 8,7, 5, 2 ]
     */
    public static int[] sortingArray(int[] arr, String direction) {
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (direction.equals("asc") && arr[j] < arr[i] || direction.equals("desc") && arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {8, 7, 5, 2};
        int[] arr2 = {8, 5, 2, 7};

        int[] ascSorted = sortingArray(arr1, "asc");
        int[] descSorted = sortingArray(arr2, "desc");

        System.out.print("Ascending order: ");
        for (int num : ascSorted) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.print("Descending order: ");
        for (int num : descSorted) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
