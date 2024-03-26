package com.adepuu.exercises.session6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Exercise1 {
  /**
   * Write a Java Program to Enter numbers to calculate average and enter 'q' to finish.
   * <p>
   * Input: 1, 2, 3, 4, 5, q
   * Output: 3
   * <p>
   * Input: 1, 2, 3, a, b, 4, 5, q
   * Output: 3
   * <p>
   * Explanation: print "Invalid input. Please enter a valid number or 'q' to finish." if user not inserting the expected number or character.
   */

  public static int calculateAverage() {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    List<Integer> numbers = new ArrayList<>();


    while (true) {
      System.out.println("Insert numbers to calculate average and \"q\" to show the output:");
      var input = scanner.next();

      if (Objects.equals(input, "q")) {
        break;
      }

      try {
        int num = Integer.parseInt(input);
        sum += num;
        numbers.add(num);

      } catch (Exception e) {
        System.out.println("input invalid. please input integer or q");
      }
    }

    scanner.close();
    return sum / numbers.size();
  }

  public static void main(String[] args) {
    System.out.println("result = " + calculateAverage());
    ;
  }
}
