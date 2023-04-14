package com.store.api.module.system.error;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.validation.BindingResult;

@Getter
@NoArgsConstructor
public class MallBadRequestException extends RuntimeException {

    private BindingResult bindingResult;

    public MallBadRequestException(BindingResult bindingResult) {
        this.bindingResult = bindingResult;
    }
}
