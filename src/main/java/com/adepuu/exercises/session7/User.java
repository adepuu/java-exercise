package com.adepuu.exercises.session7;

class User {
    private String name;
    private String email;
    private String ticketId;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name){
        if(!name.isEmpty()){
            this.name = name;
        }
        return;
    }

    public void setEmail(String email){
        if(!email.isEmpty()){
            this.email = email;
        }
        return;
    }

    public void setTicketId(String ticketId) {
        if (!ticketId.isEmpty()){
            this.ticketId = ticketId;
        }
        return;
    }

    public void printUserDetails(){
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Ticket ID : " + ticketId);
    }
}
