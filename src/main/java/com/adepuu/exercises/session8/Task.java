package com.adepuu.exercises.session8;

public class Task {
  private String description;
  private boolean isCompleted;

  // constructor
  public Task(String description) {
    this.description = description;
    this.isCompleted = false;
  }

  // getter
  public String getDescription() {
    return description;
  }

  public boolean isCompleted() {
    return isCompleted;
  }

  // setter
  public void markAsCompleted() {
    this.isCompleted = true;
  }

  public void markAsPending() {
    this.isCompleted = false;
  }
}
