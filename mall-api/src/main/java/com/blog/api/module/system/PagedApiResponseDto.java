package com.blog.api.module.system;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ApiResponseDto<T> {

    private static final String DEFAULT_CODE = "OK";
    private static final String DEFAULT_MESSAGE = "";

    private String code = DEFAULT_CODE;
    private String message = DEFAULT_MESSAGE;
    private T data;

    public ApiResponseDto() {
    }

    public ApiResponseDto(T data) {
        this.data = data;
    }

    public ApiResponseDto(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
