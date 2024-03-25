package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner numInput = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        boolean isDone = false, flag = false;
        
        do {
            System.out.print("Input a number : ");
            nums.add(numInput.nextInt());
            System.out.print("Input again? (press y to continue) ");
            numInput.nextLine();
            if(!numInput.nextLine().equals("y"))
            isDone = true;
        } while (!isDone);
        numInput.close();

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
        System.out.println("do you have a duplicate number? : " + flag);
    }
}
