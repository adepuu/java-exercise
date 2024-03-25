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
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Input s = ");
        String s = myInput.nextLine();
        System.out.print("Input t = ");
        String t = myInput.nextLine();
        boolean anagram = isAnagram(s,t);
        System.out.println("Output = " + anagram);
    }

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> count = new HashMap<>();
        HashMap<Character,Integer> count2 = new HashMap<>();
        char[] chrArr = s.toCharArray();
        char[] chrArr2 = t.toCharArray();
        for(char c :chrArr){
            if(count.containsKey(c)){
                count.put(c,count.get(c) + 1);
            }else{
                count.put(c,1);
            }
        }
        for(char c :chrArr2){
            if(count2.containsKey(c)){
                count2.put(c,count.get(c) + 1);
            }else{
                count2.put(c,1);
            }
        }
        if(count.keySet().equals(count2.keySet())){
            return true;
        }
        return false;
    }
}
