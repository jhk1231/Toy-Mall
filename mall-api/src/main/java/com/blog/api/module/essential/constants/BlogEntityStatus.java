package com.blog.api.module.essential.constants;

public enum BlogEntityStatus {

    ACTIVE("ACTIVE"),
    DELETED("DELETED"),
    SUSPENDED("SUSPENDED")
    ;


    private String status;

    BlogEntityStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
