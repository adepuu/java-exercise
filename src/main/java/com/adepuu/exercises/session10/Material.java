package com.adepuu.exercises.session10;

abstract class Material {
  private String title;
  private int count;
  private String type;

  public Material(String title, int count, String type) {
    this.setTitle(title);
    this.setCount(count);
    this.setType(type);
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
  abstract boolean borrow();
  abstract boolean returnMaterial();

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
