package com.adepuu.exercises.session6;

import com.adepuu.Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");
        String currentDir = userDir + "\\src\\main\\java\\com\\adepuu\\exercises\\session6\\";
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter folder name: ");
//        String folderName = scanner.nextLine();
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        readFileContents(currentDir + fileName);
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
        } catch (IOException e) {
            System.out.println("Error occurred when reading the file: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error occurred when reading the file: " + e.getMessage());
                }
            }
        }
    }
}
