package com.example.scheduling.user.controller;

import com.example.scheduling.common.ApiCommonResponse;
import com.example.scheduling.user.dto.LoginRequestDto;
import com.example.scheduling.user.dto.SignUpRequestDto;
import com.example.scheduling.user.service.UserService;
import com.example.scheduling.user.utils.UserDetailsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;
    private final UserDetailsServiceImpl userDetailsService;

    @PostMapping("/user/signup")
    public ApiCommonResponse signup(@RequestBody SignUpRequestDto signUpDto) {
        return ApiCommonResponse.success(userService.signUp(signUpDto).getName() + "회원가입 완료");
    }

    @PostMapping("/user/login")
    public ApiCommonResponse login(@RequestBody LoginRequestDto loginRequestDto) {
        String token = userDetailsService.authenticateAndSetContext(loginRequestDto);
        return ApiCommonResponse.success();
    }

    @GetMapping("/user/info")
    public ApiCommonResponse getUserInfo() {
        return ApiCommonResponse.noContent();
    }
}
