package com.adepuu.exercises.session7;

import java.util.UUID;
class Event {
    private String eventId;
    private int ticketAvailability;
    private int ticketSold;
    private int ticketQuota;

    public Event(int ticketQuota) {
        this.eventId = UUID.randomUUID().toString();
        this.ticketQuota = ticketQuota;
        this.ticketAvailability = ticketQuota;
        this.ticketSold = 0;
    }

    public String getEventId() {
        return eventId;
    }

    public int getTicketAvailability() {
        return ticketAvailability;
    }

    public int getTicketSold() {
        return ticketSold;
    }

    public int getTicketQuota() {
        return ticketQuota;
    }

    public boolean sellTicket(int quantity) {
        if (ticketAvailability > 0) {
            ticketAvailability--;
            ticketSold++;
            return true;
        }
        return false;
    }
}
