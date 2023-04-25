package com.blog.api.module.system.error;

import lombok.Getter;

@Getter
public class BlogException extends RuntimeException {

    private BlogError error;
    private String httpStatus;
    private Integer httpStatusCode;


    public BlogException(BlogError error) {
        this.error = error;
    }

    public BlogException(BlogError error, String httpStatus, Integer httpStatusCode) {
        super();
        this.error = error;
        this.httpStatus = httpStatus;
        this.httpStatusCode = httpStatusCode;
    }

    public BlogException(String message, BlogError error) {
        super(message);
        this.error = error;
    }

    public BlogException(String message, Throwable cause, BlogError error) {
        super(message, cause);
        this.error = error;
    }

    public BlogException(String message, BlogError error, String httpStatus, Integer httpStatusCode) {
        super(message);
        this.error = error;
        this.httpStatus = httpStatus;
        this.httpStatusCode = httpStatusCode;
    }

    public BlogException(Throwable cause, BlogError error, String httpStatus, Integer httpStatusCode) {
        super(cause);
        this.error = error;
        this.httpStatus = httpStatus;
        this.httpStatusCode = httpStatusCode;
    }

    public BlogException(String message, Throwable cause, BlogError error, String httpStatus, Integer httpStatusCode) {
        super(message, cause);
        this.error = error;
        this.httpStatus = httpStatus;
        this.httpStatusCode = httpStatusCode;

    }


}
