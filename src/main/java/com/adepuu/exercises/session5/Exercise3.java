package com.adepuu.exercises.session5;

import java.util.ArrayList;

public class Exercise3 {
    /**
     * Write a Java Program to Check if Array Contain Duplicates
     *
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     *
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */
    public static void main(String[] args) {
        ArrayList<Integer> nums = ScanArray.inputArray();
        boolean flag = findDuplicate(nums);
        
        System.out.println("Do you have a duplicate number? : " + flag);
    }
    

    static boolean findDuplicate(ArrayList<Integer> numbers){
        boolean flag = false;

        for(int i = 0; i < numbers.size(); i++){
            if(!flag){
                for(int j = i+1; j < numbers.size(); j++){
                    if(numbers.get(i)==numbers.get(j)){
                        flag = true;
                        break;
                    }
                }
            }else{
                break;
            }
        }

        return flag;
    }
}
