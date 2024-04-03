package com.adepuu.exercises.session7;

/*
<<<<<<< HEAD
public class Event {
    private String eventID;
    private String eventName;
    private int eventQuota;
    private static int eventNum = 0;

    public Event(String eventName, int eventQuota) {
        eventNum ++;
        this.eventName = eventName;
        this.eventQuota = eventQuota;
        this.eventID = "event_id-" + eventNum;
    }

    public String getEventName() {
        return this.eventName;
    }

    public int getEventQuota() {
        return this.eventQuota;
    }

    public void someoneBuy() {
        this.eventQuota -= 1;
=======
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

public class Event {
    private final String ID;
    private final HashMap<String, Ticket> availableTickets = new HashMap<>();
    private final HashSet<String> bookingList = new HashSet<>();
    private int ticketQuota = 0;
    private int ticketSold = 0;

    public Event(int maxTickets) {
        UUID uuid = UUID.randomUUID();

        this.ticketQuota = maxTickets;
        this.ID = uuid.toString();
    }

    public HashMap<String, Ticket> getTicketList() {
        return availableTickets;
    }


    public boolean bookTicket(String userId) {
        if (ticketSold >= ticketQuota) {
            System.out.println("Tickets sold!");
            return false;
        }

        if (!bookingList.add(userId)) {
            System.out.println("Only allowed to book 1 ticket");
            return false;
        }
        return true;
    }

    public Ticket confirmTicket(String userId) {
        if (bookingList.contains(userId) && ticketSold <= ticketQuota) {
            ticketSold++;
            Ticket ticket = new Ticket(this.ID);
            availableTickets.put(ticket.getID(), ticket);

            return ticket;
        }
        return null;
//>>>>>>> main
    }
}
