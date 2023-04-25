package com.blog.api.module.system;

import com.blog.api.module.system.error.dto.DefaultErrorResponseDto;
import com.blog.api.module.system.error.dto.InvalidResponseDto;
import com.blog.api.module.system.error.BlogBadRequestException;
import com.blog.api.module.system.error.BlogError;
import com.blog.api.module.system.error.BlogException;
import com.blog.api.module.util.BlogErrorLogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

import static com.blog.api.module.system.error.EssentialError.INVALID_REQUEST;
import static com.blog.api.module.system.error.EssentialError.UNKNOWN;
import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@RestControllerAdvice
@Slf4j
public class BlogRestControllerAdvice {

    @ExceptionHandler(BlogBadRequestException.class)
    ResponseEntity<ApiResponseDto<InvalidResponseDto>> handleMallBadRequestException(BlogBadRequestException ex) {

        BlogErrorLogger.log(ex);

        final List<String> fieldErrors = new ArrayList<>();
        final BindingResult bindingResult = ex.getBindingResult();
        bindingResult.getFieldErrors().forEach(error -> {
            error.getCode();
            fieldErrors.add(error.getField() + ":" + error.getDefaultMessage());
        });

        List<String> globalErrors = new ArrayList<>();
        bindingResult.getGlobalErrors().forEach(error -> {
            globalErrors.add(error.getDefaultMessage());
        });

        InvalidResponseDto data = InvalidResponseDto.builder()
                .globalErrors(globalErrors)
                .fieldErrors(fieldErrors)
                .build();

        final ApiResponseDto<InvalidResponseDto> responseDto = new ApiResponseDto<>();
        responseDto.setCode(INVALID_REQUEST.getErrorCode());
        responseDto.setMessage(INVALID_REQUEST.getErrorMessage());
        responseDto.setData(data);

        return new ResponseEntity<>(responseDto, BAD_REQUEST);
    }


    @ExceptionHandler(BlogException.class)
    ResponseEntity<ApiResponseDto<?>> handleMallException(BlogException ex) {

        BlogErrorLogger.log(ex);

        final BlogError error = ex.getError();
        final Throwable cause = ex.getCause();

        final DefaultErrorResponseDto data = new DefaultErrorResponseDto();
        if (cause != null) {
            data.setDetailMessage(cause.getMessage());
        } else {
            data.setDetailMessage(ex.getMessage());
        }

        ApiResponseDto<DefaultErrorResponseDto> responseDto = new ApiResponseDto<>();
        responseDto.setCode(error.getErrorCode());
        responseDto.setMessage(error.getErrorMessage());
        responseDto.setData(data);

        return new ResponseEntity<>(responseDto, INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    ResponseEntity<ApiResponseDto<DefaultErrorResponseDto>> handleException(Exception ex) {

        BlogErrorLogger.log(ex);

        final DefaultErrorResponseDto data = DefaultErrorResponseDto.builder()
                .detailMessage(ex.getMessage())
                .build();

        ApiResponseDto<DefaultErrorResponseDto> responseDto = new ApiResponseDto<>();
        responseDto.setCode(UNKNOWN.getErrorCode());
        responseDto.setMessage(UNKNOWN.getErrorMessage());
        responseDto.setData(data);
        return new ResponseEntity<>(responseDto, INTERNAL_SERVER_ERROR);
    }

}

