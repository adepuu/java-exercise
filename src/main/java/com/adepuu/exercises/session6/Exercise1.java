package com.adepuu.exercises.session6;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        average();
    }

    public static void average() {

        Scanner scanner = new Scanner(System.in);
        String status = "";
        int sum = 0;
        int count = 0;

        System.out.println("Please enter numbers to calculate average and press q to exit.");
        while(true){
            String input = scanner.next();

            if (input.equals("q")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                sum += number;
                count++;

            } catch (NumberFormatException e) {
                System.out.println("Input should be an integer!");
            }
        }

        scanner.close();

        float average = (float) sum / count;
        System.out.println("Average: " + average);
    }
}
