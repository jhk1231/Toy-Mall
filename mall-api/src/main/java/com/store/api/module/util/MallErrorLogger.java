package com.store.api.module.util;

import com.store.api.module.essential.error.MallBadRequestException;
import com.store.api.module.essential.error.MallException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MallErrorLogger {

    public static void log(MallBadRequestException ex) {
        log.error("Bad request exception.", ex);
    }

    public static void log(MallException ex) {
        log.error("[ERR_CODE:{}]{}", ex.getError().getErrorCode(), ex.getError().getErrorMessage(), ex);
    }

    public static void log(Exception ex) {
        log.error("API unknown error", ex);
    }
}
