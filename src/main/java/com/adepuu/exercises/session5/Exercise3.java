package com.adepuu.exercises.session5;

import java.util.*;

public class Exercise3 {
  /**
   * Write a Java Program to Check if Array Contain Duplicates
   * <p>
   * Example 1:
   * Input: nums = [1,2,3,1]
   * Output: true
   * <p>
   * Example 2:
   * Input: nums = [1,2,3,4]
   * Output: false
   * <p>
   * Example 3:
   * Input: nums = [1,1,1,3,3,4,3,2,4,2]
   * Output: true
   */

  public static boolean findDuplicates() {
    int[] input = {1, 2, 3, 4};
//        for (int i = 0; i < (input.length-1); ++i) {
//            for (int j = i + 1; j < input.length; ++j) {
//                if(input[i] == input[j]){
//                    return true;
//                }
//            }
//        }
//        return false;

    // optimize
    Set<Integer> uniqueElements = new HashSet<>();
    for (int value : input) {
      if (!uniqueElements.add(value)) {
        return true;
      }
    }
    return false; // Ti
  }


  public static void main(String[] args) {
    System.out.println("result = " + findDuplicates());
  }
}
