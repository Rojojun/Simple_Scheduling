package com.example.scheduling.common;

public enum StatusType {
    USED("사용"),
    DELETED("삭제"),
    FORCED("시스템_삭제"),
    HISTORY("히스토리") // 스케쥴링에 의한 삭제
    ;


    public String getName() {
        return name;
    }

    private String name;

    StatusType(String name) {
        this.name = name;
    }
}
