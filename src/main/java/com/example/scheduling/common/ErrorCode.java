package com.example.scheduling.common;

public enum ErrorCode {
    PASSWORD_UNMATCHED("패스워드가 일치하지 않습니다.",000);


    private String name;
    private int code;

    ErrorCode(String name, int code) {
        this.name = name;
        this.code = code;
    }
}
