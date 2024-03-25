package com.adepuu.exercises.session5;

import java.util.ArrayList;

public class Exercise8 {
    /**
     * Java String Program to Find all Duplicates on Array
     *
     * Example 1:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     *
     * Example 2:
     * Input: nums = [1,1,2]
     * Output: [1]
     *
     * Example 3:
     * Input: nums = [1]
     * Output: []
     */
    public static void main(String[] args) {
        ArrayList<Integer> nums = ScanArray.inputArray();
        ArrayList<Integer> duplicateNums = new ArrayList<Integer>();

        for(int i = 0; i < nums.size(); i++){
            for(int j = i+1; j < nums.size(); j++){
                if(nums.get(i)==nums.get(j)){
                    duplicateNums.add(nums.get(i));
                    break;
                }
            }
        }

        duplicateNums = Exercise4.removeDuplicate(duplicateNums);
        System.out.println("This is your duplicate number : " + duplicateNums.toString());
    }
}
