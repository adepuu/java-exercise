package com.adepuu.exercises.session6;

import javax.crypto.ExemptionMechanismException;
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

    static class EmptyInputException extends Exception{
        public EmptyInputException(String errorMessage){
            super(errorMessage);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        scanner.close();
        try{
            if(fileName.isEmpty()){
                throw new EmptyInputException("No filename provided");
            }
            readFileContents(fileName);
        } catch(EmptyInputException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }

    static void readFileContents(String fileName) {
        BufferedReader reader = null;
        String line;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch(FileNotFoundException e){
            System.err.println("File not found: " +e.getMessage());
        } catch(IOException e){
            System.err.println("Error closing file " +e.getMessage());
        }finally {
            try{
                if(reader!=null){
                    reader.close();
                }
            }catch(IOException e){
                System.err.println("Error closing file "+e.getMessage());
            }
        }
    }
}
