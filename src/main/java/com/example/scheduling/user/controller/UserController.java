package com.example.scheduling.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/user/signup")
    public void signup() {

    }

    @PostMapping("/user/login")
    public void login() {

    }

    @GetMapping("/user/info")
    public void getUserInfo() {

    }
}
