package com.adepuu.exercises.session10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Library {
  private Map<String, Material> materials;

  private Scanner scanner;

  public Library() {
    materials = new HashMap<>();
   this.scanner = new Scanner(System.in);
  }

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
        materials.put(book.getTitle(),book);
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
      materials.get(title).borrow();
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
}
