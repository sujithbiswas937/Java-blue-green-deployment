package com.example.bluedeployment.controller;

import com.example.bluedeployment.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final MessageService service;

    public HomeController(MessageService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", service.getMessage());
        return "index";
    }
}