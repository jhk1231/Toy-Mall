package com.blog.api.module.util;

import com.blog.api.module.system.error.BlogBadRequestException;
import com.blog.api.module.system.error.BlogException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BlogErrorLogger {

    public static void log(BlogBadRequestException ex) {
        log.error("Bad request exception.", ex);
    }

    public static void log(BlogException ex) {
        log.error("[ERR_CODE:{}]{}", ex.getError().getErrorCode(), ex.getError().getErrorMessage(), ex);
    }

    public static void log(Exception ex) {
        log.error("API unknown error", ex);
    }
}
