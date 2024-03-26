package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise7 {
    /**
     * Java String Program to Check Anagram
     * <p>
     * Example 1:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     * <p>
     * Example 2:
     * Input: s = "rat", t = "car"
     * Output: false
     */
    public boolean isAnagram(String s, String t) {
        // Check if both strings have the same length
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Sort both character arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare sorted character arrays
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i]) {
                return false;
            }
        }

        // If all characters match, the strings are anagrams
        return true;
    }
}
