package com.adepuu.exercises.session5;


public class Exercise5 {
    public int[] sortNumbers(int[] numbers, SORT_DIRECTION direction) {
        boolean swapped;
        for (int i = 0; i < numbers.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < numbers.length - i - 1; j++) {
                switch (direction) {
                    case ASC -> {
                        if (numbers[j] > numbers[j + 1]) {
                            int temp = numbers[j];
                            numbers[j] = numbers[j + 1];
                            numbers[j + 1] = temp;
                            swapped = true;
                        }
                    }
                    case DESC -> {
                        if (numbers[j] < numbers[j + 1]) {
                            int temp = numbers[j];
                            numbers[j] = numbers[j + 1];
                            numbers[j + 1] = temp;
                            swapped = true;
                        }
                    }
                }
            }
            if (!swapped) break; // If no two elements were swapped by inner loop, then the array is sorted.
        }
        return numbers;
    }

    /**
     * Java numbersay Program to sort numbersay in increasing & decreasing order
     * <p>
     * Example 1:
     * Input: [ 8, 7, 5, 2], direction = "asc"
     * Output: [ 2, 5, 7, 8 ]
     * <p>
     * Example 2:
     * Input: [ 8, 7, 5, 2], direction = "desc"
     * Output: [ 8,7, 5, 2 ]
     */
    public enum SORT_DIRECTION {ASC, DESC}
}
