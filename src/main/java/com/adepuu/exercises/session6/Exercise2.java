package com.adepuu.exercises.session6;

import java.io.*;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        readFileContents(fileName);
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
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file not found : " + e.getMessage());
        } catch (IOException e){
            System.out.println("Sorry, there is an error at input output");
        } finally {

        }
    }
}
