package com.store.api.infra.config;

import com.store.api.module.util.crypto.CryptoUtils;
import com.store.api.module.util.crypto.PasswordCryptoUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CryptoConfig {

    @Bean
    @Qualifier("pwCryptoUtils")
    public CryptoUtils pwCryptoUtils() {
        return new PasswordCryptoUtils();
    }
}
