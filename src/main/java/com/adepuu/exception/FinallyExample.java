package com.adepuu.exception;

import java.io.*;

public class FinallyExample {
    public static void main(String[] args) {
        FileReader reader = null;

        try {
            reader = new FileReader("example.txt");
            // Code to read from the file
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // Closing the file reader
                }
            } catch (IOException e) {
                System.err.println("Error closing file: " + e.getMessage());
            }
        }
    }
}