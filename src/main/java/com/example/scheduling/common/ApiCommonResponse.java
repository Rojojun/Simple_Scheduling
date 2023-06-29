package com.example.scheduling.common;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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
        return new ApiCommonResponse<>(healthType.SUCCESS.status, null, null);
    }

    public static ApiCommonResponse<?> createFail(BindingResult bindingResult) {
        Map<String, String> errors = new HashMap<>();

        List<ObjectError> allErrors = bindingResult.getAllErrors();
        for (ObjectError error : allErrors) {
            if (error instanceof FieldError) {
                errors.put(((FieldError) error).getField(), error.getDefaultMessage());
            } else {
                errors.put(error.getObjectName(), error.getDefaultMessage());
            }
        }
        return new ApiCommonResponse<>(healthType.FAIL.status, errors, null);
    }

    private ApiCommonResponse(String status, T data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }
}
