package com.blog.api.module.util.crypto;

public interface CryptoUtils {

    String encrypt(String plain) throws Exception;

    String decrypt(String cipher) throws Exception;
}
