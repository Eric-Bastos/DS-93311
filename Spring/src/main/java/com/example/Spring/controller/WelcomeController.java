package com.example.Spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/welcome")
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "Welcome to the Spring Boot Application!";
    }
}
