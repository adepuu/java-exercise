package com.adepuu.exercises.session7;

public class Event {
    private String eventID;
    private String eventName;
    private int eventQuota;
    private static int eventNum = 0;

    public Event(String eventName, int eventQuota) {
        eventNum ++;
        this.eventName = eventName;
        this.eventQuota = eventQuota;
        this.eventID = "event_id-" + eventNum;
    }

    public String getEventName() {
        return this.eventName;
    }

    public int getEventQuota() {
        return this.eventQuota;
    }

    public void someoneBuy() {
        this.eventQuota -= 1;
    }
}
