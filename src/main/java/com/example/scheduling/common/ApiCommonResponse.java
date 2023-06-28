package com.example.scheduling.common;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ApiCommonResponse<T> {

    private static HealthType healthType;

    private String status;
    private T data;
    private String message;

    public static <T> ApiCommonResponse<T> success(T data) {
        return new ApiCommonResponse<>(healthType.SUCCESS.status, data, null);
    }

    public static ApiCommonResponse<?> noContent() {
        return new ApiCommonResponse<>(healthType.SUCCESS.status, null, null)
    }

    private ApiCommonResponse(String status, T data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }
}
