package com.blog.api.module.system.error;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.validation.BindingResult;

@Getter
@NoArgsConstructor
public class BlogBadRequestException extends RuntimeException {

    private BindingResult bindingResult;

    public BlogBadRequestException(BindingResult bindingResult) {
        this.bindingResult = bindingResult;
    }
}
