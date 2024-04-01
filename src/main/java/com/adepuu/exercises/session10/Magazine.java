package com.adepuu.exercises.session10;

import java.util.Date;

public class Magazine extends Material {

  public Magazine(String title, int count) {
    super(title, count, "Magazine");
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
