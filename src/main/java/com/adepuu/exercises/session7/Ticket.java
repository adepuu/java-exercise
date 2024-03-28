package com.adepuu.exercises.session7;

import java.util.ArrayList;
import java.util.List;

public class Ticket{
    private String ticketID;
    private String eventName;
    private int price;

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Ticket(String ticketID, String eventName, int price){
        this.ticketID = ticketID;
        this.eventName = eventName;
        this.price = price;
    }
}
