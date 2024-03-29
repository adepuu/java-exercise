package com.adepuu.exercises.session7;

import java.util.UUID;

public class Ticket {

  private final String ticketId;

  private String eventName;

  private String ticketName;

  private String price;

   String userId;

  public Ticket(String ticketId,String eventName, String ticketName, String price, String userId) {
    this.ticketId = ticketId;
    this.eventName = eventName;
    this.ticketName = ticketName;
    this.price = price;
    this.userId = userId;
  }

  public String getTicketId() {
    return ticketId;
  }

  public String getPrice() {
    return  price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public String getTicketName() {
    return ticketName;
  }

  public void setTicketName(String ticketName) {
    this.ticketName = ticketName;
  }

  public String getUserId() { return userId;}

}
