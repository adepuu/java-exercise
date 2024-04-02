package com.adepuu.exercises.session5;
import java.util.*;
public class Exercise8 {
    /**
     * Java String Program to Find all Duplicates on Array
     * <p>
     * Example 1:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     * <p>
     * Example 2:
     * Input: nums = [1,1,2]
     * Output: [1]
     * <p>
     * Example 3:
     * Input: nums = [1]
     * Output: []
     */
    public static List<Integer> findDuplicate(int[] arr) {
        Map<Integer, Boolean> isExist = new HashMap<>();
        List<Integer> newArr = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!isExist.containsKey(arr[i])) {
                isExist.put(arr[i], true);
            } else {
                newArr.add(arr[i]);
            }
        }

        return newArr;
    }
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(findDuplicate(new int[]{1, 1, 2}));
        System.out.println(findDuplicate(new int[]{1}));
    }
}
