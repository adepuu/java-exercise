package com.adepuu.exercises.session10;

import java.util.Date;

public class Book extends Material {
  public Book(String title, int count) {
    super(title, count, "Book");
  }

  @Override
  boolean borrow() {
    if (getCount() > 0) {
      setCount(getCount() - 1);
      return true;
    }
    return false;
  }

  @Override
  boolean returnMaterial() {
    setCount(getCount() + 1);
    return true;
  }
}
