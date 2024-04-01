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

    public enum SORT_DIRECTION {ASC, DESC}
}
