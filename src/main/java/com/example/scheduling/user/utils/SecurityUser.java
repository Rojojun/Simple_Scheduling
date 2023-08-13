package com.example.scheduling.user.utils;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Getter
@Setter
public class SecurityUser extends User {
    private com.example.scheduling.user.entity.User user;

    public SecurityUser(com.example.scheduling.user.entity.User user) {
        super(user.getName(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getUserType().toString()));

        this.user = user;
    }
}
