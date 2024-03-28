package com.adepuu.exercises.session7;

import java.util.Random;

public class Ticket {
  private final String id;

  private final String eventName;

  private final double price;


  public Ticket(String eventName, double price) {
    this.id = generateId();
    this.eventName = eventName;
    this.price = price;
  }

  protected String generateId () {
    String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "0123456789"
            + "abcdefghijklmnopqrstuvxyz";
    StringBuilder sb = new StringBuilder(10);
    for (int i = 0; i < 10; i++) {
      int index
              = (int)(AlphaNumericString.length()
              * Math.random());
      sb.append(AlphaNumericString
              .charAt(index));
    }
    return sb.toString();
  }

  public String getId () {
    return id;
  }

  public String getEventName () {
    return eventName;
  }

  public String getPrice () {
    return Integer.toString((int)price);
  }
}
