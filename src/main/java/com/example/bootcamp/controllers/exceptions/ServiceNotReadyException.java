package com.example.bootcamp.controllers.exceptions;

public class ServiceNotReadyException extends Exception {

    public ServiceNotReadyException(String message) {
        super(message);
    }
}
