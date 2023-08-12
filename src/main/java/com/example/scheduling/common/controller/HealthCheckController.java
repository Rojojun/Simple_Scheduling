package com.example.scheduling.common.controller;

import com.example.scheduling.common.ApiCommonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/check")
    public ApiCommonResponse healthCheck() {
        return ApiCommonResponse.success(HttpStatus.OK.series());
    }
}
