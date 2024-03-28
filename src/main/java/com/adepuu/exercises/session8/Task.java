package com.adepuu.exercises.session8;

import java.util.UUID;

public class Task {

    private final String ID;

    private final String description;

    public Task(String description) {
        UUID uuid = UUID.randomUUID();
        this.ID = uuid.toString();
        this.description = description;
    }

    public String getID() {
        return ID;
    }

    public String getDescription() {
        return description;
    }
}
