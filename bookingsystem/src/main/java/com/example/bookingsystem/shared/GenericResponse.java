package com.example.bookingsystem.shared;



public class GenericResponse {
    private String message;

    public GenericResponse() {
    }

    public GenericResponse(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
