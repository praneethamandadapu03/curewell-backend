package com.curewell.curewell.demo.api.payload;



import java.time.LocalDateTime;

public class ErrorDetail {

    private LocalDateTime timestamp;
    private String message;
    private String details;

    public ErrorDetail() {
        this.timestamp = LocalDateTime.now();
    }

    public ErrorDetail(String message, String details) {
        this.timestamp = LocalDateTime.now();
        this.message = message;
        this.details = details;
    }

    // Getters and Setters
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
