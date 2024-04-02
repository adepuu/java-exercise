package com.adepuu.exercises.session7;
import java.util.UUID;

/*
<<<<<<< HEAD
public class User {
    private String userID;
    private String userName;
    private static int numUser = 0;

    public User(String userName) {
        numUser ++;
        this.userName = userName;
        this.userID = "user_id-" + numUser;
    }

    public String getUserName() {
        return this.userName;
=======
 */

public class User {
    private final String name;
    private final String ID;
    private Ticket ticket;
    public User(String name) {
        UUID uuid = UUID.randomUUID();
        this.ID = uuid.toString();
        this.name = name;
    }

    public void saveTicket(Ticket ticket) {
        this.ticket = ticket;
    }


    public String getID() {
        return ID;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public String getName() {
        return name;
//>>>>>>> main
    }
}
