package com.adepuu.exercises.session7;

import java.util.*;

public class Event {
  private final List<Ticket> tickets = new ArrayList<>();
  private final List<Ticket> bookedTickets = new ArrayList<>();
  private final Scanner scanner = new Scanner(System.in);
  User user = new User();

  public void getTickets() {
    try {
      System.out.println("------List of Tickets-------");
      if (tickets.isEmpty()) {
        System.out.println("----- Tickets are empty -----");
        return;
      }
      for (Ticket map : tickets) {
        System.out.println("Ticket id: " + map.getTicketId());
        System.out.println("Event name: " + map.getEventName());
        System.out.println("Ticket name: " + map.getTicketName());
        System.out.println("Price: " + map.getPrice());
        System.out.println("--------------------------------");
      }
    } catch (Exception e) {
      System.out.println("Ups Something Error");
    }
  }

  public void create() {
    System.out.println("""
                        
            ----- Create Ticket -----\s
            """);

    System.out.print("Event name: ");
    String eventName = scanner.nextLine();


    System.out.print("Ticket name: ");
    String ticketName = scanner.nextLine();


    System.out.print("Price: ");
    String price = scanner.next();

    try {
      Ticket ticket = new Ticket(UUID.randomUUID().toString(), eventName, ticketName, price,"");
      tickets.add(ticket);
    } catch (Exception e) {
      System.out.println("Ups Something Error");
    }
  }

  public void editTicket() {
    System.out.println("""
                        
            ----- Edit Ticket -----\s
            """);
    getTickets();

    System.out.print("Insert Ticket id: ");
    String ticketId = scanner.next();

    System.out.print("Event name(Optional): ");
    String eventName = scanner.next();

    System.out.print("Ticket name(Optional): ");
    String ticketName = scanner.next();

    System.out.print("price(Optional): ");
    String price = scanner.next();

    if (Objects.equals(ticketId, "")) {
      System.out.println("Ticket id cannot empty");
      return;
    }

    try {
      for (Ticket map : tickets) {
        if (map.getTicketId().equals(ticketId)) {
          map.setEventName(Objects.equals(eventName, "") ? map.getEventName() : eventName);
          map.setTicketName(Objects.equals(ticketName, "") ? map.getTicketName() : ticketName);
          map.setPrice(Objects.equals(price, "") ? map.getPrice() : price);
        }
      }
      System.out.println("Edit ticket success");
    } catch (Exception e) {
      System.out.println("Ups something error");
    }
  }

  public void deleteTicket() {
    System.out.println("""
                        
            ----- Delete Ticket -----\s
            """);
    getTickets();

    System.out.print("Insert TicketId:");
    String TicketId = scanner.next();

    if (Objects.equals(TicketId, "")) {
      System.out.print("TicketId cannot empty");
      return;
    }
    try {
      for (int i = 0; i < tickets.size(); i++) {
        if (tickets.get(i).getTicketId().equals(TicketId)) {
          tickets.remove(i);
        }
      }
    } catch (Exception e) {
      System.out.println("Ups something error");
    }
  }

  public void bookingTicket() {
    System.out.println("""
                        
            ----- Booking Ticket -----\s
            """);

    if (tickets.isEmpty()) {
      System.out.println("----- Tickets are empty -----");
      return;
    }

    getTickets();

    System.out.print("Insert TicketId:");
    String ticketId = scanner.next();

    if (Objects.equals(ticketId, "")) {
      System.out.print("TicketId cannot empty");
    }
    try {
      for (Ticket map : tickets) {
        if (map.getTicketId().equals(ticketId)) {
          Ticket ticket = new Ticket(map.getTicketId(), map.getEventName(), map.getTicketName(), map.getPrice(), user.getUserId());
          bookedTickets.add(ticket);
        }
      }
      System.out.println("Booking ticket success: " + bookedTickets);
    } catch (Exception e) {
      System.out.println("Ups something error:" + e);
    }
  }

  public void decrementTicketAvailability(String ticketId) {
    try {
      for (int i = 0; i < tickets.size(); i++) {
        if (tickets.get(i).getTicketId().equals(ticketId)) {
          tickets.remove(i);
        }
      }
    } catch (Exception e) {
      System.out.println("Ups something error");
    }
  }

  public void getTicketByUserId() {
    try {
      System.out.println("------ Under Maintenance -------");
      return;

//      System.out.println("------ List of Tickets -------");
//      if (bookedTickets.isEmpty()) {
//        System.out.println("----- Tickets aren't booked yet -----");
//        return;
//      }
//      System.out.println("user: " + user.getUserId());
//      for (Ticket map : tickets) {
//        System.out.println("User id: " + map.getUserId());
//        System.out.println("Event name: " + map.getEventName());
//        System.out.println("Ticket name: " + map.getTicketName());
//        System.out.println("Price: " + map.getPrice());
//        System.out.println("--------------------------------");
//      }
//      for (Ticket map : bookedTickets) {
//        System.out.println(">>>>> " + map.getUserId() + " user: " + user.getUserId());
//        if (Objects.equals(map.getUserId(), user.getUserId())) {
//          System.out.println("User id: " + map.getUserId());
//          System.out.println("Event name: " + map.getEventName());
//          System.out.println("Ticket name: " + map.getTicketName());
//          System.out.println("Price: " + map.getPrice());
//          System.out.println("--------------------------------");
//        } else {
//          System.out.println("----- Your tickets are empty -----");
//        }
//      }
    } catch (Exception e) {
      System.out.println("Ups Something Error");
    }
  }
}
