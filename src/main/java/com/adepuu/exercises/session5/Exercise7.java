package com.adepuu.exercises.session5;

import java.util.Arrays;
import java.util.Objects;

public class Exercise7 {
    /**
     * Java String Program to Check Anagram
     *
     * Example 1:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     *
     * Example 2:
     * Input: s = "rat", t = "car"
     * Output: false
     */

    public static boolean isAnagram () {
        String first = "anagram";
        String second = "nagaram";

        int lengthFirst = first.length();
        int lengthSecond = second.length();

        if(lengthFirst != lengthSecond) {
            return false;
        }

        String[] firstArr = first.split("");
        String[] secondArr = second.split("");

        Arrays.sort(firstArr);
        Arrays.sort(secondArr);

        System.out.println("firstArr = " + Arrays.toString(firstArr));
        System.out.println("secondArr = " + Arrays.toString(secondArr));

        for (int i = 0; i < lengthFirst; ++i) {
            if(!Objects.equals(firstArr[i], secondArr[i])){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("result = " + isAnagram());
    }
}
