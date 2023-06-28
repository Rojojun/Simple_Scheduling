package com.example.scheduling.common;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ApiCommonResponse<T> {

    private HealthType healthType;

    private String status;
    private T data;
    private String message;

    public static <T> ApiCommonResponse<T> success(T data) {

    }
}
