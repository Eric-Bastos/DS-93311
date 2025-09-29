package com.example.Aula3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Testecontroller {
    @GetMapping
    public String ola() {
        return "Bem Vindo";
    }
}
