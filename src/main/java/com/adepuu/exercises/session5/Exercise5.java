package com.adepuu.exercises.session5;

import java.util.ArrayList;

public class Exercise5 {

    public static void main(String[] args) {
        int[] input = {8, 7, 5, 2};
        var resultASC=sortASC(input);
        var resultDSC=sortDSC(input);
        System.out.println(resultASC);
        System.out.println(resultDSC);
    }

    public static ArrayList<Integer> sortASC(int[] input){
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : input) {
            result.add(num);
        }

        for (int i = 0; i < result.size() - 1; i++) {
            for (int j = 0; j < result.size() - i - 1; j++) {
                if (result.get(j) > result.get(j + 1)) {
                    int temp = result.get(j);
                    result.set(j, result.get(j + 1));
                    result.set(j + 1, temp);
                }
            }
        }
        return result;
    }
    public static ArrayList<Integer> sortDSC(int[] input){
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : input) {
            result.add(num);
        }

        for (int i = 0; i < result.size() - 1; i++) {
            for (int j = 0; j < result.size() - i - 1; j++) {
                if (result.get(j) < result.get(j + 1)) {
                    int temp = result.get(j);
                    result.set(j, result.get(j + 1));
                    result.set(j + 1, temp);
                }
            }
        }
        return result;
    }
}