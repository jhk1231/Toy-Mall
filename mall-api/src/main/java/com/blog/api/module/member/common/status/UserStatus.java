package com.blog.api.module.member.common.status;

public enum UserStatus {

    ACTIVE("ACTIVE"),
    DELETED("DELETED"),
    SUSPENDED("SUSPENDED")
    ;


    private String status;

    UserStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
