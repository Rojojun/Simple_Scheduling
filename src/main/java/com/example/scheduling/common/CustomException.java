package com.example.scheduling.common;

public class CustomException extends RuntimeException{
    private static ErrorCode errorCode;

    public CustomException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
