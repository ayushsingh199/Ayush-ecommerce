package com.example.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "Ecommerce API is running ✅";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}