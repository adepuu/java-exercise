package com.adepuu.exercises.session5;
import java.util.*;
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
    public static boolean checkAnagram(String str1, String str2) {
        Map<Character, Integer> hashChar = new HashMap<>();

        if (str1.length() != str2.length()) {
            return false;
        }

        for (char letter : str1.toCharArray()) {
            hashChar.put(letter, hashChar.getOrDefault(letter, 0) + 1);
        }

        for (char letter : str2.toCharArray()) {
            if (!hashChar.containsKey(letter) || hashChar.get(letter) < 1) {
                return false;
            } else {
                hashChar.put(letter, hashChar.get(letter) - 1);
            }
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(checkAnagram("anagram", "nagaram"));
        System.out.println(checkAnagram("rat", "car"));
    }
}
