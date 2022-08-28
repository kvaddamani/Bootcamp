package com.example.bootcamp.controllers.advice;

import com.example.bootcamp.controllers.exceptions.EmployeeNotFoundException;
import com.example.bootcamp.controllers.exceptions.ServiceNotReadyException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice

public class ServiceNotReadyAdvice {

    @ResponseBody
    @ExceptionHandler(ServiceNotReadyException.class)
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    String serviceNotReady(ServiceNotReadyException ex) {
        return ex.getMessage();
    }
}
