package com.adepuu.exercises.session10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
  private Map<String, Material> materials;

  public Library() {
    materials = new HashMap<>();
  }

  public void addMaterial (Material material) {
    materials.put(material.getTitle(), material);
  }

  public void borrowMaterial (String title) {
    if (materials.containsKey(title)){
      materials.get(title).borrow();
      return;
    }
    System.out.println("----- Material doesn't found -----");
  }

  public void returnMaterial () {

  }
}
