package com.adepuu.exercises.session7;

import java.util.UUID;


public class Ticket {
    private String ticketId;
    private String eventName;
    private String username;

    public Ticket(String ticketId, String eventName, String username) {
        this.ticketId = ticketId;
        this.eventName = eventName;
        this.username = username;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getEventName() {
        return eventName;
    }

    public void printTicketDetails() {
        System.out.println("==================");
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Ticket Holder: " + username);
        System.out.println("Event Name: " + eventName);
        System.out.println("==================");
    }
}
