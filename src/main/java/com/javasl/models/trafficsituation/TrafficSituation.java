package com.javasl.models.trafficsituation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrafficSituation {
    private int statusCode;
    private String message;
    private long executionTime;
    private TrafficStatus responseData;

    public TrafficSituation() {}

    public TrafficSituation(int statusCode, String message, long executionTime, TrafficStatus responseData) {
        this.statusCode = statusCode;
        this.message = message;
        this.executionTime = executionTime;
        this.responseData = responseData;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(long executionTime) {
        this.executionTime = executionTime;
    }

    public TrafficStatus getResponseData() {
        return responseData;
    }

    public void setResponseData(TrafficStatus responseData) {
        this.responseData = responseData;
    }
}

