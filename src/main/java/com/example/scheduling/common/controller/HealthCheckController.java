package com.example.scheduling.common.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/check")
    public String healthCheck() {
        return HttpStatus.OK
                .name().describeConstable()
                .orElseThrow(RuntimeException::new);
    }
}
