package com.example.bluedeployment;

import com.example.bluedeployment.service.MessageService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MessageServiceTest {

    @Test
    void testGetMessage() {
        MessageService service = new MessageService();
        String message = service.getMessage();

        assertEquals("Welcome to Blue Deployment Application!", message);
    }
}