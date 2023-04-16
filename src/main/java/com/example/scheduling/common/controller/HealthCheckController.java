package com.example.scheduling.common.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @PostMapping("/check")
    public String healthCheck() {
        return "Health OK".describeConstable().orElseThrow(RuntimeException::new);
    }
}
