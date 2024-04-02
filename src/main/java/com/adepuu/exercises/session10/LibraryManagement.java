package com.adepuu.exercises.session10;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class LibraryManagement {
  /**
   * Acceptance Criteria:
   * - Each material should have an availability count, and the program should check if the material is still available for borrowing.
   * - The program should demonstrate polymorphism by allowing operations (borrow, return) to be performed on any type of library material through a single method.
   * - The program should include methods to borrow and return materials.
   * - The program should keep track of the available and borrowed materials.
   * - The program should print out the status of materials (available, borrowed) and the actions performed (borrow, return).
   * <p>
   * Notes:
   * - The program doesn't require a menu system; focus should be on Object-Oriented Programming (OOP) and inheritance implementation.
   * - Make sure to implement Inheritance and Polymorphism properly
   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu(scanner);
    menu.openApp();
    scanner.close();
  }
}
