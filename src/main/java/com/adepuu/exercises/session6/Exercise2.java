package com.adepuu.exercises.session6;

import java.io.*;
import java.util.Scanner;

public class Exercise2 {
    /**
     * Complete the file reader program below
     * and handle all edge cases using try-catch-finally based on the logic given
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        typeFile(scanner);
        scanner.close();
    }

    static void typeFile(Scanner scanner){
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        readFileContents(fileName, scanner);
    }

    static void readFileContents(String fileName, Scanner scanner) {
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
            System.out.println("Sorry, there is an error at the file : " + e.getMessage());
        } finally {
            System.out.print("Do you want to open another file? (Press y to continue) : ");
            if(scanner.nextLine().equals("y")){
                typeFile(scanner);
            }
        }
    }
}
