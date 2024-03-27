package com.adepuu.exercises.session7;

import java.util.*;

public class BookingSystem {
    private HashMap<String, Ticket> bookedTickets;
    private HashMap<String, Event> events;

    public BookingSystem() {
        bookedTickets = new HashMap<>();
        events = new HashMap<>();
    }

    public void createEvent(String eventName, int stock, double price) {
        Event newEvent = new Event(eventName, stock, price);
        events.put(eventName, newEvent);
    }

    public void bookTicket(String eventName, double amountPaid, String username) {
        if (events.containsKey(eventName)) {
            Event event = events.get(eventName);
            if (event.isAvailable()) {
                if (amountPaid == event.getPrice()) {
                    String ticketId = UUID.randomUUID().toString();
                    Ticket newTicket = new Ticket(ticketId, eventName, username);
                    bookedTickets.put(username, newTicket);
                    event.stockAfterBooked();
                    if (event.getStock() == 0) {
                        event.setAvailable(event.getStock());
                    }
                    System.out.println("Ticket successfully booked");
                } else if (amountPaid > event.getPrice()) {
                    String ticketId = UUID.randomUUID().toString();
                    Ticket newTicket = new Ticket(ticketId, eventName, username);
                    bookedTickets.put(username, newTicket);
                    event.stockAfterBooked();
                    if (event.getStock() == 0) {
                        event.setAvailable(event.getStock());
                    }
                    System.out.println("Ticket successfully booked");
                    System.out.println("Your change is " + (amountPaid - event.getPrice()));
                } else {
                    System.out.println("Insufficient amount paid");
                }
            } else {
                System.out.println("Tickets sold out");
            }
        } else {
            System.out.println("Event not found");
        }
    }

    public void bookedTicketStatus(String username) {
        if (!bookedTickets.containsKey(username)) {
            System.out.println("You have not book any ticket. Ticket not found");
        }
        Ticket userTicket = bookedTickets.get(username);
        userTicket.printTicketDetails();
    }

    public List<String> getEventList() {
        List<String> eventsList = new ArrayList<>();
        for (Map.Entry<String, Event> entry: events.entrySet()) {
            eventsList.add(entry.getKey());
        }
        return eventsList;
    }
}
