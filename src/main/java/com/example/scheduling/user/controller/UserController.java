package com.example.scheduling.user.controller;

import com.example.scheduling.user.dto.SignUpDto;
import com.example.scheduling.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @PostMapping("/user/signup")
    public void signup(@RequestBody SignUpDto signUpDto) {
        userService.signUp(signUpDto);
        System.out.println(signUpDto.name);
        System.out.printf(signUpDto.password);
    }

    @PostMapping("/user/login")
    public void login() {

    }

    @GetMapping("/user/info")
    public void getUserInfo() {

    }
}
