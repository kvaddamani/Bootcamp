package com.example.bootcamp.controllers;

import com.example.bootcamp.controllers.exceptions.ServiceNotReadyException;
import com.example.bootcamp.repository.EmployeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppStateController {

    private final EmployeeRepository repository;

    public AppStateController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/ready")
    @ResponseStatus(HttpStatus.OK)
    public String jarvisUp() {
        return "Always up";
    }

    @GetMapping("/started")
    public String jarvisStarted() throws ServiceNotReadyException {
        if(repository.count() != 0) {
            return "Aye Aye captain!";
        } else {
            throw new ServiceNotReadyException("Repo not loaded yet");
        }
    }
}
