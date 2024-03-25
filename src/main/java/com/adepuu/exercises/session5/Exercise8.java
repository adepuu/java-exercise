package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Collections;

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
        
        ArrayList<Integer> duplicateNums = findDuplicate(nums);
        duplicateNums = Exercise4.removeDuplicate(duplicateNums);
        Collections.sort(duplicateNums);
        System.out.println("This is your duplicate number : " + duplicateNums.toString());
    }

    
    static ArrayList<Integer> findDuplicate(ArrayList<Integer> numbers){
        ArrayList<Integer> duplicateNums = new ArrayList<Integer>();

        for(int i = 0; i < numbers.size(); i++){
            for(int j = i+1; j < numbers.size(); j++){
                if(numbers.get(i)==numbers.get(j)){
                    duplicateNums.add(numbers.get(i));
                    break;
                }
            }
        }
        return duplicateNums;
    }
}
