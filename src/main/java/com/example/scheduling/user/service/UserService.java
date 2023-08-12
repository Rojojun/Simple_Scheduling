package com.example.scheduling.user.service;

import com.example.scheduling.common.CustomException;
import com.example.scheduling.common.ErrorCode;
import com.example.scheduling.user.dto.SignUpRequestDto;
import com.example.scheduling.user.entity.User;
import com.example.scheduling.user.repository.UserRepository;
import com.mysql.cj.exceptions.PasswordExpiredException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@RequiredArgsConstructor
@Service
public class UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public User signUp(SignUpRequestDto signUpDto) {
        User user = signUpDto.toUserEntity();

        if (!Objects.equals(signUpDto.password(), signUpDto.passwordCheck())) {
            throw new CustomException(ErrorCode.PASSWORD_UNMATCHED);
        }
        String encodedPw = passwordEncoder.encode(signUpDto.password());
        user.setPassword(encodedPw);

        return userRepository.save(user);
    }

    public void login() {

    }

    public void getPersonalInfo() {

    }
}
