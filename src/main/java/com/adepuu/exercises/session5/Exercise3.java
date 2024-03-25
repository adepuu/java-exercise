package com.adepuu.exercises.session5;

public class Exercise3 {
    public static void main(String[] args) {
        int[] number1 = {1, 2, 3, 1};
        int[] number2 = {1, 2, 3, 4};
        int[] number3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println("Example 1 = 1, 2, 3, 1 are : " + checkDuplicate(number1));
        System.out.println("Example 2 = 1, 2, 3, 4 are : " + checkDuplicate(number2));
        System.out.println("Example 3 = 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 are : " + checkDuplicate(number3));
    }

    public static boolean checkDuplicate(int[] number){
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] == number[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
