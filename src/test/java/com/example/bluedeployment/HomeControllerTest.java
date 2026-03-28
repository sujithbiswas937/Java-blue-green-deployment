package com.example.bluedeployment;

import com.example.bluedeployment.controller.HomeController;
import com.example.bluedeployment.service.MessageService;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class HomeControllerTest {

    @Test
    void testHome() {
        MessageService service = mock(MessageService.class);
        when(service.getMessage()).thenReturn("Test Message");

        HomeController controller = new HomeController(service);

        Model model = mock(Model.class);

        String view = controller.home(model);

        verify(model, times(1)).addAttribute("message", "Test Message");
        assertEquals("index", view);
    }
}