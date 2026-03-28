package com.example.bluedeployment.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String getMessage() {
        return "Welcome to Blue Deployment Application!";
    }
}