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
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        readFileContents(fileName);
        scanner.close();
    }

    static void readFileContents(String fileName) throws IOException {
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
