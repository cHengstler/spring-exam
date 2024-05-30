package com.sap.assessment.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/greet")
    public String greet() {
        return "Nice to meet you!";
    }
}

