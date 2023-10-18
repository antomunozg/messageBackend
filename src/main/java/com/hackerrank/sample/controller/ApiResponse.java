package com.hackerrank.sample.controller;

public class ApiResponse {

    private String finalMessage;

    public ApiResponse(String finalMessage) {
        this.finalMessage = finalMessage;
    }

    public String getFinalMessage() {
        return finalMessage;
    }
    
}
