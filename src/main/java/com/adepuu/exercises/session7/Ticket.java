package com.adepuu.exercises.session7;

public class Ticket {
    private String ticketID;
    private Event eventID;
    private User userID;
    private static int ticketNum = 0;

    public Ticket(Event eventID, User userID){
        ticketNum += 1;
        this.ticketID = "Tic-"+ticketNum;
        this.eventID = eventID;
        this.userID = userID;
        this.eventID.someoneBuy();
    }

    public User getTicketUser() {
        return this.userID;
    }

    public Event getTicketEvent() {
        return this.eventID;
    }
}
