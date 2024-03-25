package com.adepuu.exercises.session5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        String inputS="anagram", inputT="nagaram";
        System.out.println(anagramChecker(inputS,inputT));
    }

    public static boolean anagramChecker(String inputS, String inputT){
        inputS=inputS.replaceAll("\\s","").toLowerCase();
        inputT=inputT.replaceAll("\\s","").toLowerCase();

        if(inputS.length()!=inputT.length()){
            return false;
        }
        char[] str1=inputS.toCharArray();
        char[] str2=inputT.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);
    }
}
