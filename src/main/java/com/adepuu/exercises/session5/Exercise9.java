package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise9 {
  /**
   * Java Program to get the number of days you have to wait after the i-th day to get a warmer temperature
   * <p>
   * Example 1:
   * Input: temperatures = [73,74,75,71,69,72,76,73]
   * Output: [1,1,4,2,1,1,0,0]
   * <p>
   * Example 2:
   * Input: temperatures = [30,40,50,60]
   * Output: [1,1,1,0]
   * <p>
   * Example 3:
   * Input: temperatures = [30,60,90]
   * Output: [1,1,0]
   */

  public static void checkTemperature() {
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(73, 74, 75, 71, 69, 72, 76, 73));

    ArrayList<Integer> result = new ArrayList<>();

    for (int i = 0; i < arr.size() - 1; ++i) {
      boolean isSwapped = false;

      for (int j = i + 1; j < arr.size(); ++j) {
        if (arr.get(j) > arr.get(i)) {
          result.add(j - i);
          isSwapped = true;
          break;
        }
      }
      if (!isSwapped) {
        result.add(0);
      }
    }
    result.add(0);


    System.out.println("result = " + result);
  }

  public static void main(String[] args) {
    checkTemperature();
  }
}
