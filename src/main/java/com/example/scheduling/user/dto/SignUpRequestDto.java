package com.example.scheduling.user.dto;

import com.example.scheduling.user.entity.User;

public record SignUpRequestDto(
        String name,
        String password,
        String passwordCheck,
        String nickname
) {
    public User toUserEntity() {
        return User.signUp(name, password, nickname);
    }
}
