package com.salt.calendar.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MainController {
    @GetMapping("/api")
    public String main() {
        return "test";
    }
}
