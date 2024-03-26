package com.adepuu.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
//        fileReader();
        arrayOutOfBound();
    }

    static void arrayOutOfBound() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Throws ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tried to access index out of bound");
        }
    }
    static void fileReader() {
        try {
            Scanner scanner = new Scanner(new File("nonexistentFile.txt"));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            e.printStackTrace();
        }
    }
}
