package com.adepuu.exercises.session5;

import java.util.Arrays;

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
    static boolean checkAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        char[] charArray1 = s.toCharArray();
        char[] charArray2 = s.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(checkAnagram(s, t));
    }
}
