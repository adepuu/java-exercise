package com.adepuu.exercises.session10;

public class Book extends Material {
  private int numberOfPages;

  public Book(String title, String author, int availability, int numberOfPages) {
    super(title, author, availability);
    this.numberOfPages = numberOfPages;
  }

  // getter
  public int getNumberOfPages() {
    return numberOfPages;
  }

  public void setNumberOfPages(int numberOfPages) {
    this.numberOfPages = numberOfPages;
  }

  @Override
  public void printStatus(Material material) {
    if (super.getAvailability() > 0) {
      System.out.println("Book Status: Available");
    } else {
      System.out.println("Book Status: Not Available");
    }
  }


}
