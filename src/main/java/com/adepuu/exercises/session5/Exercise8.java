package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.HashMap;

public class Exercise8 {
    /**
     * Java String Program to Find all Duplicates on Array
     *
     * Example 1:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     *
     * Example 2:
     * Input: nums = [1,1,2]
     * Output: [1]
     *
     * Example 3:
     * Input: nums = [1]
     * Output: []
     */
    public static void main(String[] args) {
            int[] input={4,3,2,7,8,2,3,1};
            var result = findDuplicates(input);
            System.out.println(result);
        }

        public static ArrayList<Integer> findDuplicates(int[] input){
            ArrayList<Integer> result = new ArrayList<>();
            HashMap<Integer,Integer> temporaryMapping = new HashMap<>();
            for (int i = 0; i < input.length-1; i++) {
                if(temporaryMapping.containsKey(input[i])){
                    var occurence = temporaryMapping.get(input[i]);
                    temporaryMapping.put(input[i],++occurence);
                }else{
                    temporaryMapping.put(input[i],1);
                }
            }temporaryMapping.forEach((key, value)->{
                if(value>1){
                    result.add(key);
                }
            });
            return result;
        }
    }