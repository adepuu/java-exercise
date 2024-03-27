package com.adepuu.exercises.session7;

public class Ticket {
    private String ticketId;
    private double price;
    private boolean availability;

    public Ticket(String ticketId, double price) {
        this.ticketId = ticketId;
        this.price = price;
        this.availability = true;
    }

    // getter
    public String getTicketId() {
        return ticketId;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return availability;
    }

    // setter
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}