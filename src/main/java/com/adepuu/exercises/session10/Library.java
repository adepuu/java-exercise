package com.adepuu.exercises.session10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Library {
  private Map<String, Material> materials;
  private Map<String, Material> borrowed;

  private Scanner scanner;

  public Library() {
    materials = new HashMap<>();
    borrowed = new HashMap<>();
    this.scanner = new Scanner(System.in);
  }

  User user = new User();

  public void addMaterial() {
    System.out.println("""
                        
            ----- Add Material -----\s
            Select Type :
            1. Book
            2. Magazine
            """);

    System.out.print("Input Type: ");
    String type = scanner.next();

    System.out.print("Input Title: ");
    String title = scanner.next();

    System.out.print("Input Count: ");
    int count = scanner.nextInt();

    switch (type) {
      case "1" -> {
        Book book = new Book(title, count);
        materials.put(book.getTitle(), book);
      }
      case "2" -> {
        Magazine magazine = new Magazine(title, count);
        materials.put(magazine.getTitle(), magazine);
      }
      default -> {
        System.out.println("===== Input invalid ======");
      }
    }
  }

  public boolean borrowMaterial() {
    System.out.println("""
                        
            ----- Borrow Menu -----\s
            """);
    getMaterials();

    System.out.print("Select Title: ");
    String title = scanner.next();

    if (materials.containsKey(title)) {
//      materials.get(title).borrow();
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
      LocalDate dateNow = LocalDate.now();
      String dateBorrow = dtf.format(dateNow);
      String dateReturned = dtf.format(dateNow.plusDays(7));
      if (materials.get(title).getType().equals("Book") && materials.get(title).borrow()) {
        Material x = materials.get(title);
        HashMap<String, Material> map = new HashMap<>();
        Book borrowedBook = new Book(x.getTitle(), 1, x.getType(),dateBorrow,dateReturned);
        map.put(user.getUsername(), borrowedBook);
        borrowed.put(user.getUsername(),borrowedBook);
      }
      if (materials.get(title).getType().equals("Magazine") && materials.get(title).borrow()) {
        Material x = materials.get(title);
        HashMap<String, Material> map = new HashMap<>();
        Magazine borrowedMagazine = new Magazine(x.getTitle(), 1, x.getType(),dateBorrow,dateReturned);
        map.put(user.getUsername(), borrowedMagazine);
        borrowed.put(user.getUsername(), borrowedMagazine);
      }
      return true;
    }
    System.out.println("----- Material doesn't found -----");
    return false;
  }

  public boolean returnMaterial() {
    System.out.println("""
                        
            ----- Return Menu -----\s
            """);
    getMaterials();

    System.out.print("Select Title: ");
    String title = scanner.next();

    if (materials.containsKey(title)) {
      materials.get(title).returnMaterial();
      return true;
    }
    return false;
  }

  public void getMaterials() {

    System.out.println("""
                        
            ===== List of Materials =====
            """);
    for (Material material : materials.values()) {
      System.out.println("Title : " + material.getTitle());
      System.out.println("Stock : " + material.getCount());
      System.out.println("Type : " + material.getType());
      System.out.println("===============================");
    }
  }

  public void getBorrowedList() {
    System.out.println("""
                        
            ===== List of Borrowed Materials =====
            """);
    if(borrowed.containsKey(user.getUsername())) {
      for (Material material : borrowed.values()) {
        System.out.println("Title : " + material.getTitle());
        System.out.println("Stock : " + material.getCount());
        System.out.println("Type : " + material.getType());
        System.out.println("Borrow Date : " + material.getDateBorrowed());
        System.out.println("Should Return Date : " + material.getDateReturned());
        System.out.println("===============================");
      }
    }
  }
}
