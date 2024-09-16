package com.adepuu.exercises.session10;

public class Material {
  private String title;
  private String author;
  private int availability;

  // constructor
  public Material(String title, String author, int availability) {
    this.title = title;
    this.author = author;
    this.availability = availability;
  }

  // getter
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getAvailability() {
    return availability;
  }

  // setter

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAvailability(int availability) {
    this.availability = availability;
  }

  // methods
  public void printStatus() {
    if (this.availability > 0) {
      System.out.println("Status: Available");
    } else {
      System.out.println("Status: Not Available");
    }
  }

  public void borrowMaterial() {
    if (this.availability > 0) {
      this.availability--;
      System.out.println("Enjoy and please return on time!");
    } else {
      System.out.println("It's currently unavailable, sorry :(");
    }
  }

  public void returnMaterial() {
    this.availability++;
    System.out.println("Thank you for your return!");
  }
}
