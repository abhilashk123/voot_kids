package com.impelsys.readersdk;

/**
 * Created by comp5 on 18-05-2018.
 */

public class Event {

    String eventId,eventTitle,eventDesc,eventType;
    float eventValue;

    public Event() {
    }

    public Event(String eventId, String eventTitle, String eventDesc, String eventType, float eventValue) {
        this.eventId = eventId;
        this.eventTitle = eventTitle;
        this.eventDesc = eventDesc;
        this.eventType = eventType;
        this.eventValue = eventValue;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public float getEventValue() {
        return eventValue;
    }

    public void setEventValue(float eventValue) {
        this.eventValue = eventValue;
    }
}
