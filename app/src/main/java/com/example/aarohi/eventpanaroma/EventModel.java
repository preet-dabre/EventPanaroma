package com.example.aarohi.eventpanaroma;

import java.util.Date;

public class EventModel{
    public String eventName;
    public String college;
    public String location;
    public Date eventDate;
    public String eventDateString;
    public int eventEntries;
    public String eventDescription;
    public String eventBriefDescription;
    public String imagePrimaryUrl;
    public String imageSecondaryUrl;


    public EventModel(String eventName, String college, String location, Date eventDate, String eventDateString, int eventEntries, String eventDescription, String eventBriefDescription, String imagePrimaryUrl, String imageSecondaryUrl) {
        this.eventName = eventName;
        this.college = college;
        this.location = location;
        this.eventDate = eventDate;
        this.eventDateString = eventDateString;
        this.eventEntries = eventEntries;
        this.eventDescription = eventDescription;
        this.eventBriefDescription = eventBriefDescription;
        this.imagePrimaryUrl = imagePrimaryUrl;
        this.imageSecondaryUrl = imageSecondaryUrl;
    }

    public EventModel() {
    }

    public void setValues(String eventName, String college, String location, Date eventDate, String eventDateString, int eventEntries, String eventDescription, String eventBriefDescription) {
        this.eventName = eventName;
        this.college = college;
        this.location = location;
        this.eventDate = eventDate;
        this.eventDateString = eventDateString;
        this.eventEntries = eventEntries;
        this.eventDescription = eventDescription;
        this.eventBriefDescription = eventBriefDescription;
    }

    public String getImagePrimaryUrl() {
        return imagePrimaryUrl;
    }

    public void setImagePrimaryUrl(String imagePrimaryUrl) {
        this.imagePrimaryUrl = imagePrimaryUrl;
    }

    public String getImageSecondaryUrl() {
        return imageSecondaryUrl;
    }

    public void setImageSecondaryUrl(String imageSecondaryUrl) {
        this.imageSecondaryUrl = imageSecondaryUrl;
    }
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventDateString() {
        return eventDateString;
    }

    public void setEventDateString(String eventDateString) {
        this.eventDateString = eventDateString;
    }

    public int getEventEntries() {
        return eventEntries;
    }

    public void setEventEntries(int eventEntries) {
        this.eventEntries = eventEntries;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventBriefDescription() {
        return eventBriefDescription;
    }

    public void setEventBriefDescription(String eventBriefDescription) {
        this.eventBriefDescription = eventBriefDescription;
    }
}
