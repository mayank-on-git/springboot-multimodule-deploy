package com.example.api.controller;

import com.example.core.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final GreetingService greetingService = new GreetingService();

    @GetMapping("/api/hello")
    public String hello() {
        return greetingService.getGreeting();
    }

    @GetMapping("/api/status")
    public String status() {
        return greetingService.getStatus();
    }
}
