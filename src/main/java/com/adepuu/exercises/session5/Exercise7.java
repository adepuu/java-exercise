package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {
        String word1 = "anagram";
        String word2 = "nagaram";

        System.out.println("Input : " + word1 + " AND " + word2);
        boolean result = isAnagram(word1, word2);
        System.out.println("Output : " + result);
    }

    public static boolean isAnagram(String w1, String w2){
        if (w1.length() != w2.length()){
            return false;
        }
        char[] w1Char = w1.toCharArray();
        char[] w2Char = w2.toCharArray();
        Arrays.sort(w1Char);
        Arrays.sort(w2Char);

        return Arrays.equals(w1Char, w2Char);
    }
}