package com.adepuu.exercises.session6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise2 {
    /**
     * Complete the file reader program below
     * and handle all edge cases using try-catch-finally based on the logic given
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFound = false;
        int attempt = 0;
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        String path = "/Users/kurniawanmuhammadrizki/IdeaProjects/java-exercise-main/src/main/java/com/adepuu/exercises/session6/";
        String filePath = path + fileName;
        readFileContents(filePath);
        scanner.close();
    }

    static void readFileContents(String fileName) {

        BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }catch (FileNotFoundException e){
                System.out.println("File not found at : " + fileName);

            }catch (IOException e){
                System.out.println("Failed read file at : " + fileName);
            } finally {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        System.err.println("Error closing reader for file: " + fileName);
                    }
                }
            }
    }
}
