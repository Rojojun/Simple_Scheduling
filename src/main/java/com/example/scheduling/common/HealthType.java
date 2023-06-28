package com.example.scheduling.common;

public enum HealthType {
    SUCCESS("success", "성공"),
    FAIL("fail","실패"),
    ERROR("error", "에러");

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public String status;
    public String name;

    HealthType(String status, String name) {
        this.status = status;
        this.name = name;
    }
}
