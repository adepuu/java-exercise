package com.adepuu.exercises.session10;

abstract class Material {
  private String title;
  private int count;
  private String type;
  private String dateBorrowed;
  private String dateReturned;

  public Material(String title, int count, String type) {
    this.setTitle(title);
    this.setCount(count);
    this.setType(type);
  }
  public Material(String title, int count, String type, String dateBorrowed, String dateReturned) {
    this.setTitle(title);
    this.setCount(count);
    this.setType(type);
    this.setDateBorrowed(dateBorrowed);
    this.setDateReturned(dateReturned);
  }

  abstract boolean borrow();

  abstract boolean returnMaterial();

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getDateBorrowed() {
    return dateBorrowed;
  }

  public void setDateBorrowed(String dateBorrowed) {
    this.dateBorrowed = dateBorrowed;
  }


  public String getDateReturned() {
    return dateReturned;
  }

  public void setDateReturned(String dateReturned) {
    this.dateReturned = dateReturned;
  }
}
