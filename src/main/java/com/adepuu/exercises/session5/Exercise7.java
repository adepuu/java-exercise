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
    public static void main(String[] args) {
        System.out.println(isAnagram("cork", "rock"));
        System.out.println(isAnagram("car", "rat"));
    }

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();

        // sort the char array
        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}
