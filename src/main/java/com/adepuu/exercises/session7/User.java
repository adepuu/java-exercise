package com.adepuu.exercises.session7;
import com.adepuu.exercises.session7.Ticket;

import java.util.ArrayList;
import java.util.List;
class User {
    private String userId;
    private String userName;
    private List<Ticket> ticketsBought;

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.ticketsBought = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void buyTicket(Ticket ticket, int quantity) {
        for (int i = 0; i < quantity; i++) {
            ticketsBought.add(ticket);
        }
    }

    public boolean checkTicket(String ticketId) {
        for (Ticket ticket : ticketsBought) {
            if (ticket.getTicketId().equals(ticketId)) {
                System.out.println("Ticket is valid for event: " + ticket.getEventName());
                return true;
            }
        }
        System.out.println("Invalid ticket.");
        return false;
    }

    public List<Ticket> getTicketsBought() {
        return ticketsBought;
    }
}