package com.adepuu.oop.polymorphism.overriding;

interface Device {
    void takeNotes(String note);
}

class Phone implements Device {
    @Override
    public void takeNotes(String note) {
        System.out.println("Taking notes on phone: " + note);
    }
}

class Paper implements Device {
    @Override
    public void takeNotes(String note) {
        System.out.println("Taking notes on paper: " + note);
    }
}

class Laptop implements Device {
    @Override
    public void takeNotes(String note) {
        System.out.println("Taking notes on laptop: " + note);
    }
}

public class NoteTaker {
    public void takeNotes(Device device, String note) {
        device.takeNotes(note);
    }

    public static void main(String[] args) {
        NoteTaker noteTaker = new NoteTaker();

        // Taking notes using different devices
        noteTaker.takeNotes(new Phone(), "Meeting notes");
        noteTaker.takeNotes(new Paper(), "Grocery list");
        noteTaker.takeNotes(new Laptop(), "Project plan");
    }
}

