package com.blog.api.module.essential.constants;

public enum BaseStatus {

    ACTIVE("ACTIVE"),
    DELETED("DELETED"),
    SUSPENDED("SUSPENDED")
    ;


    private String status;

    BaseStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
