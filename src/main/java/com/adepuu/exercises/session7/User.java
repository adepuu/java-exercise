package com.adepuu.exercises.session7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class User {
  private String username;

  private HashMap<String, String> allBookedTicket = new HashMap<>();


  public HashMap<String, String> bookedTicket(){
    Event event = new Event();
    allBookedTicket = event.getAllTickets();
    return allBookedTicket;
  }
}
