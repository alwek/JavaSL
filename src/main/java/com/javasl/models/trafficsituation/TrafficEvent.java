package com.javasl.models.trafficsituation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrafficEvent {
    private int eventId;
    private String message;
    private boolean expanded;
    private boolean planned;
    private int sortIndex;
    private String statusIcon;
    private LineNumbers lineNumbers;
    private String trafficLine;
    private String eventInfoUrl;

    public TrafficEvent() {
    }

    public TrafficEvent(int eventId, String message, boolean expanded, boolean planned, int sortIndex,
            String statusIcon, LineNumbers lineNumbers, String trafficLine, String eventInfoUrl) {
        this.eventId = eventId;
        this.message = message;
        this.expanded = expanded;
        this.planned = planned;
        this.sortIndex = sortIndex;
        this.statusIcon = statusIcon;
        this.lineNumbers = lineNumbers;
        this.trafficLine = trafficLine;
        this.eventInfoUrl = eventInfoUrl;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public boolean isPlanned() {
        return planned;
    }

    public void setPlanned(boolean planned) {
        this.planned = planned;
    }

    public int getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(int sortIndex) {
        this.sortIndex = sortIndex;
    }

    public String getStatusIcon() {
        return statusIcon;
    }

    public void setStatusIcon(String statusIcon) {
        this.statusIcon = statusIcon;
    }

    public LineNumbers getLineNumbers() {
        return lineNumbers;
    }

    public void setLineNumbers(LineNumbers lineNumbers) {
        this.lineNumbers = lineNumbers;
    }

    public String getTrafficLine() {
        return trafficLine;
    }

    public void setTrafficLine(String trafficLine) {
        this.trafficLine = trafficLine;
    }

    public String getEventInfoUrl() {
        return eventInfoUrl;
    }

    public void setEventInfoUrl(String eventInfoUrl) {
        this.eventInfoUrl = eventInfoUrl;
    }
}