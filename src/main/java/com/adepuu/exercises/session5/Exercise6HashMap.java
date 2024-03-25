package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exercise6HashMap {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     * <p>
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     * <p>
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
     */
    public int[] removeDuplicates(int[] array, int key) {
        // Count occurrences of each element in the array
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Reconstruct the array without the key
        List<Integer> resultList = new ArrayList<>();
        for (int num : array) {
            if (num != key) {
                resultList.add(num);
            }
        }

        // Convert the list back to an array
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}
