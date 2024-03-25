package com.adepuu.exercises.session5;

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
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean flag = false;
        for(int i = 0; i < nums.length; i++){
            if(!flag){
                for(int j = i+1; j < nums.length; j++){
                    if(nums[i]==nums[j]){
                        flag = true;
                        System.out.println(flag);
                        break;
                    }
                }
            }else{
                break;
            }
        }
    }
}
