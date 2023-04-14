package com.store.api.module.essential.error;

public enum EssentialError implements MallError {


    UNKNOWN("ERR_UNKNOWN", "알 수 없는 에러가 발생했습니다."),
    INVALID_REQUEST("ERR_INVALID_REQUEST", "잘못된 요청입니다."),
    PW_ENCRYPT_FAILURE("ERR_PW_ENCRYPT_FAILURE", "[PW]암호화에 실패하였습니다."),
    PW_DECRYPT_FAILURE("ERR_PW_DECRYPT_FAILURE", "[PW]복호화에 실패하였습니다.");
    private String errorCode;
    private String errorMessage;

    EssentialError(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    @Override
    public String getErrorCode() {
        return this.errorCode;
    }

    @Override
    public String getErrorMessage() {
        return this.errorMessage;
    }
}
