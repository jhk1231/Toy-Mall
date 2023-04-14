package com.store.api.module.util.crypto;

import com.store.api.module.system.error.MallException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import static com.store.api.module.system.error.EssentialError.PW_DECRYPT_FAILURE;
import static com.store.api.module.system.error.EssentialError.PW_ENCRYPT_FAILURE;

@Component
public class CryptoService {

    private CryptoUtils pwCryptoUtils;

    public CryptoService(
            @Qualifier("pwCryptoUtils") CryptoUtils pwCryptoUtils) {
        this.pwCryptoUtils = pwCryptoUtils;
    }

    public String encryptForPassword(String plain) {
        try {
            return pwCryptoUtils.encrypt(plain);
        } catch (Exception ex) {
            throw new MallException("[PW]암호화 실패", ex, PW_ENCRYPT_FAILURE);
        }
    }

    public String decryptForPassword(String cipher) {
        try {
            return pwCryptoUtils.decrypt(cipher);
        } catch (Exception ex) {
            throw new MallException("[PW]복호화 실패", ex, PW_DECRYPT_FAILURE);
        }
    }

}
