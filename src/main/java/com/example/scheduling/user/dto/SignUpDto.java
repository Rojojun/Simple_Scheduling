package com.example.scheduling.user.dto;

import com.example.scheduling.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SignUpDto {

    public String name;
    public String password;
    public String passwordCheck;
    public String nickname;

    public User toUserEntity() {
        return User.signUp(name, password, nickname);
    }
}
