package com.blog.api.module.essential.constants;

public enum PauseReason {

    DELETED("DELETED")
    ;


    private String reason;

    PauseReason(String reason) {
        this.reason = reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
