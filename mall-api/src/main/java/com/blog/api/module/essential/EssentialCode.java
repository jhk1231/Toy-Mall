package com.blog.api.module.essential;

import lombok.Getter;

@Getter
public enum EssentialCode {

    ;

    private final String division;
    private final String divisionName;
    private final String code;
    private final String codeName;
    private final boolean enabled;

    EssentialCode(String division, String divisionName, String code, String codeName, boolean enabled) {
        this.division = division;
        this.divisionName = divisionName;
        this.code = code;
        this.codeName = codeName;
        this.enabled = enabled;
    }
}
