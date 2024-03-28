package com.adepuu.exercises.session7;

import java.util.UUID;
class Ticket {
    private String ticketId;
    private String eventId;
    private String eventName;

    public Ticket(String eventId, String eventName) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.ticketId = generateTicketId();
    }

    private String generateTicketId() {
        // Generate a random UUID for ticket id
        return UUID.randomUUID().toString();
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }
}