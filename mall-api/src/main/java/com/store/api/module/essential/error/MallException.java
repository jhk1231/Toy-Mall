package com.store.api.module.essential.error;

import lombok.Getter;

@Getter
public class MallException extends RuntimeException {

    private MallError error;
    private String httpStatus;
    private Integer httpStatusCode;


    public MallException(MallError error) {
        this.error = error;
    }

    public MallException(MallError error, String httpStatus, Integer httpStatusCode) {
        super();
        this.error = error;
        this.httpStatus = httpStatus;
        this.httpStatusCode = httpStatusCode;
    }

    public MallException(String message, MallError error) {
        super(message);
        this.error = error;
    }

    public MallException(String message, Throwable cause, MallError error) {
        super(message, cause);
        this.error = error;
    }

    public MallException(String message, MallError error, String httpStatus, Integer httpStatusCode) {
        super(message);
        this.error = error;
        this.httpStatus = httpStatus;
        this.httpStatusCode = httpStatusCode;
    }

    public MallException(Throwable cause, MallError error, String httpStatus, Integer httpStatusCode) {
        super(cause);
        this.error = error;
        this.httpStatus = httpStatus;
        this.httpStatusCode = httpStatusCode;
    }

    public MallException(String message, Throwable cause, MallError error, String httpStatus, Integer httpStatusCode) {
        super(message, cause);
        this.error = error;
        this.httpStatus = httpStatus;
        this.httpStatusCode = httpStatusCode;

    }


}
