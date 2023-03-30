package com.example.scheduling.user.entity;

public enum UserType {
    USER("일반유저"),
    SUPER_USER("관리자"); // 일반_유저를_제외 -> 실제 비지니스에서는 이렇게 정의하면 안됨

    public String getName() {
        return name;
    }

    private String name;

    UserType(String name) {
        this.name = name;
    }
}
