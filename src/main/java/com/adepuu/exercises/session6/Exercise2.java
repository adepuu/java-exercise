package com.adepuu.exercises.session6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise2 {

  static class EmptyException extends Exception {
    public EmptyException(String str) {
      super(str);
    }
  }

  public static void main(String[] args) throws EmptyException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the file name: ");
    String fileName = scanner.nextLine();
    readFileContents(fileName);
    scanner.close();
  }

  static void readFileContents(String fileName) throws EmptyException {
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader(fileName));
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("File not found: " + e.getMessage());
    } finally {
      try {
        if (reader != null) {
          reader.close();
          throw new EmptyException("File name is empty");
        }
      } catch (EmptyException empty) {
        System.out.println("EmptyException = " + empty.getMessage());
      }

      catch (IOException r) {
        System.out.println("Error closing file: " + r.getMessage());
      }
    }
  }
}
