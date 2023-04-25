package com.blog.api.module.util;

import com.blog.api.module.member.common.status.UserStatus;

import java.time.LocalDate;
import java.util.UUID;

public abstract class TestUtils {

    public static String createUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String getUserId() {
        return "test1234";
    }

    public static String getPassword() {
        return "password";
    }

    public static LocalDate getRegistrationDate() {
        return LocalDate.now();
    }

    public static UserStatus getUserStatus() {
        return UserStatus.ACTIVE;
    }
}