package com.javasl.models.trafficsituation;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrafficType {
    private String name;
    private String type;
    private String statusIcon;
    private boolean expanded;
    private boolean hasPlannedEvent;
    private ArrayList<TrafficEvent> events;

    public TrafficType() {}

    public TrafficType(String name, String type, String statusIcon, boolean expanded, boolean hasPlannedEvent,
            ArrayList<TrafficEvent> events) {
        this.name = name;
        this.type = type;
        this.statusIcon = statusIcon;
        this.expanded = expanded;
        this.hasPlannedEvent = hasPlannedEvent;
        this.events = events;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatusIcon() {
        return statusIcon;
    }

    public void setStatusIcon(String statusIcon) {
        this.statusIcon = statusIcon;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public boolean isHasPlannedEvent() {
        return hasPlannedEvent;
    }

    public void setHasPlannedEvent(boolean hasPlannedEvent) {
        this.hasPlannedEvent = hasPlannedEvent;
    }

    public ArrayList<TrafficEvent> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<TrafficEvent> events) {
        this.events = events;
    }
}