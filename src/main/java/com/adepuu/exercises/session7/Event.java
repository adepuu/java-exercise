package com.adepuu.exercises.session7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Event {

  private List<HashMap<String, String>> allTickets = new ArrayList<>();

  public void createTicket(String eventName, double price) {
    HashMap<String, String> arr = new HashMap<>();
    Ticket ticket = new Ticket(eventName, price);
    arr.put("id", ticket.getId());
    arr.put("event", ticket.getEventName());
    arr.put("price", ticket.getPrice());
    allTickets.add(arr);
  }



  public HashMap<String, String> getAllTickets() {
    return (HashMap<String, String>) allTickets;
  }


}
