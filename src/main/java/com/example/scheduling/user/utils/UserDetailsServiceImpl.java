package com.example.scheduling.user.utils;

import com.example.scheduling.common.CustomException;
import com.example.scheduling.common.ErrorCode;
import com.example.scheduling.user.entity.User;
import com.example.scheduling.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.security.SecurityUtil;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public void makeToken() {

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User findByUsername = userRepository.findByName(username).orElseThrow(() -> new CustomException(ErrorCode.USER_NOT_EXISTS));
        findByUsername.getClass();
        return new SecurityUser(findByUsername);
    }
}
