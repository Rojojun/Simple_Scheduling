package com.example.scheduling.user.controller;

import com.example.scheduling.common.ApiCommonResponse;
import com.example.scheduling.user.dto.SignUpRequestDto;
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
    public ApiCommonResponse signup(@RequestBody SignUpRequestDto signUpDto) {
        return ApiCommonResponse.success(userService.signUp(signUpDto).getName() + "회원가입 완료");
    }

    @PostMapping("/user/login")
    public ApiCommonResponse login() {
        return ApiCommonResponse.noContent();
    }

    @GetMapping("/user/info")
    public ApiCommonResponse getUserInfo() {
        return ApiCommonResponse.noContent();
    }
}
