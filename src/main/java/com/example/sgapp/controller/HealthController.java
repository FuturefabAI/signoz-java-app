package com.example.sgapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SuppressWarnings("SameRetureValue")
public class HealthController {
    @GetMapping("/health")
    public String hello() {
        return "healthy";
    }
}
