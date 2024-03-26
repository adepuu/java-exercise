package com.adepuu.exercises.session5;

import java.util.Stack;

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
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }

        return result;
    }
}
