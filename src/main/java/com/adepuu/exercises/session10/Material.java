package com.adepuu.exercises.session10;

abstract class Material {
  private String title;
  private int count;

  public Material(String title, int count) {
    this.setTitle(title);
    this.setCount(count);
  }
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
  abstract void borrow();
  abstract void returnMaterial();
}
