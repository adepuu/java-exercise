package com.adepuu.exercises.session7;

import java.util.List;
import java.util.ArrayList;
public class User {
    private String userName;
    private List<Ticket> boughtTickets;

    public User(String userName) {
        this.userName = userName;
        this.boughtTickets = new ArrayList<>();
    }

    // getter
    public String getUserName() {
        return userName;
    }

    public List<Ticket> getBoughtTickets() {
        return boughtTickets;
    }

    // setter
    public void addBoughtTicket(Ticket ticket) {
        boughtTickets.add(ticket);
    }
}
