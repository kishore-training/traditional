package com.udemy.traditional.utils;

public class AppointmentExistsException extends Exception {

    public AppointmentExistsException(String message){
        super(message);
    }
}
