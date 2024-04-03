package com.adepuu.exercises.session7;

/*
<<<<<<< HEAD
public class Ticket {
    private String ticketID;
    private Event eventID;
    private User userID;
    private static int ticketNum = 0;

    public Ticket(Event eventID, User userID) {
        ticketNum ++;
        this.ticketID = "ticket_id-" + ticketNum;
        this.eventID = eventID;
        this.userID = userID;
        this.eventID.someoneBuy();
    }

    public User getTicketUser() {
        return this.userID;
    }

    public Event getTicketEvent() {
        return this.eventID;
=======
 */

import java.util.UUID;

public class Ticket {
    private final String ID;
    private String eventID;

    public Ticket() {
        this("");
    }

    public Ticket(String eventID) {
        UUID uuid = UUID.randomUUID();
        this.ID = uuid.toString();
        this.eventID = eventID;
    }

    public String getID() {
        return ID;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
//>>>>>>> main
    }
}
