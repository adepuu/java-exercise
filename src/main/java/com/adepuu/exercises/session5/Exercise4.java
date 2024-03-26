package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     * <p>
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     */
    public int[] removeDuplicates(int[] data) {
        // Hash map which will store the elements which have appeared previously.
        HashMap<Integer, Boolean> mp = new HashMap<>();
        for (int datum : data) {
            // Print the element if it is not present there in the hash map
            // and Insert the element in the hash map
            mp.putIfAbsent(datum, true);
        }

        // Create a list to store unique elements
        List<Integer> uniqueList = new ArrayList<>(mp.keySet());

        // Convert the list to an array and return
        int[] result = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            result[i] = uniqueList.get(i);
        }
        return result;
    }
}
