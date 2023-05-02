package com.blog.api.module.system;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.PagedModel;

@Getter @Setter
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class PagedApiResponseDto<T> extends PagedModel<T> {

    private static final String DEFAULT_CODE = "OK";
    private static final String DEFAULT_MESSAGE = "";

    private String code = DEFAULT_CODE;
    private String message = DEFAULT_MESSAGE;
    private T data;

    public PagedApiResponseDto() {
    }

    public PagedApiResponseDto(T data) {
        this.data = data;
    }

    public PagedApiResponseDto(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
