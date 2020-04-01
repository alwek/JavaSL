package com.javasl.models.trafficsituation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LineNumbers {
    private boolean inputDataIsOptional;
    private String text;

    public LineNumbers() {
    }

    public LineNumbers(boolean inputDataIsOptional, String text) {
        this.inputDataIsOptional = inputDataIsOptional;
        this.text = text;
    }

    public boolean isInputDataIsOptional() {
        return inputDataIsOptional;
    }

    public void setInputDataIsOptional(boolean inputDataIsOptional) {
        this.inputDataIsOptional = inputDataIsOptional;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }   
}