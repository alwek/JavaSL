package com.javasl.models.trafficsituation;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrafficStatus {
    private ArrayList<TrafficType> trafficTypes;

    public TrafficStatus() {}
    
    public TrafficStatus(ArrayList<TrafficType> trafficTypes) {
        this.trafficTypes = trafficTypes;
    }

    public ArrayList<TrafficType> getTrafficTypes() {
        return trafficTypes;
    }

    public void setTrafficTypes(ArrayList<TrafficType> trafficTypes) {
        this.trafficTypes = trafficTypes;
    }
}