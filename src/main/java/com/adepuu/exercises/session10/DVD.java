package com.adepuu.exercises.session10;

public class DVD extends Material{

  private int duration;

  public DVD(String title, String author, int availability, int duration) {
    super(title, author, availability);
    this.duration = duration;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  @Override
  public void printStatus() {
    if (super.getAvailability() > 0) {
      System.out.println("DVD Status: Available");
    } else {
      System.out.println("DVD Status: Not available");
    }
  }
}
