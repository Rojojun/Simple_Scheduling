package com.example.scheduling.user.service;

import com.example.scheduling.user.dto.SignUpDto;
import com.example.scheduling.user.entity.User;
import com.example.scheduling.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public void signUp(SignUpDto signUpDto) {
        User user = signUpDto.toUserEntity();
        if (Objects.equals(signUpDto.password, signUpDto.passwordCheck)) {

        }

        userRepository.save(user);
    }

    public void login() {

    }

    public void getPersonalInfo() {

    }
}
