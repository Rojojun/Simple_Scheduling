package com.example.scheduling.user.service;

import com.example.scheduling.user.dto.SignUpDto;
import com.example.scheduling.user.entity.User;
import com.example.scheduling.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@RequiredArgsConstructor
@Service
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public void signUp(SignUpDto signUpDto) {
        User user = signUpDto.toUserEntity();

        if (!Objects.equals(signUpDto.password, signUpDto.passwordCheck)) {
            throw new RuntimeException("비밀번호가 일치하지 않습니다");
        }
        String encodedPw = passwordEncoder.encode(signUpDto.password);
        user.setPassword(encodedPw);

        userRepository.save(user);
    }

    public void login() {

    }

    public void getPersonalInfo() {

    }
}
