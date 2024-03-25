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
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums = ScanArray.inputArray();
        boolean flag = false;

        for(int i = 0; i < nums.size(); i++){
            if(!flag){
                for(int j = i+1; j < nums.size(); j++){
                    if(nums.get(i)==nums.get(j)){
                        flag = true;
                        break;
                    }
                }
            }else{
                break;
            }
        }
        System.out.println("Do you have a duplicate number? : " + flag);
    }
}
