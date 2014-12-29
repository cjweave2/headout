package com.calwea.headout;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by calwea on 12/23/2014.
 */
public class Event {

    private int eventId;
    private String name;
    private String description;
    private String location;
    private double lat;
    private double lon;
    private int minAttending;
    private int maxAttending;
    private Date date;
    private ArrayList interests;

    public Event(int eventId, String name, String description, String location, double lat, double lon, int minAttending, int maxAttending, Date date, ArrayList interests) {
        this.eventId = eventId;
        this.name = name;
        this.description = description;
        this.location = location;
        this.lat = lat;
        this.lon = lon;
        this.minAttending = minAttending;
        this.maxAttending = maxAttending;
        this.date = date;
        this.interests = interests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public int getMinAttending() {
        return minAttending;
    }

    public void setMinAttending(int minAttending) {
        this.minAttending = minAttending;
    }

    public int getMaxAttending() {
        return maxAttending;
    }

    public void setMaxAttending(int maxAttending) {
        this.maxAttending = maxAttending;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }





}

