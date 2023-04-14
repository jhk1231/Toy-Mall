package com.store.api.infra;

import com.store.api.module.domain.member.UserInfo;
import com.store.api.module.repositories.member.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.store.api.module.util.TestUtils.*;

@Component
@Profile(value = {"default"})
public class TestCommandLineRunner implements CommandLineRunner {

    @Autowired
    UserInfoRepository userInfoRepository;

    @Override
    public void run(String... args) throws Exception {
        userInfoRepository.saveAll(List.of(
                UserInfo.builder().userId(getUserId()).password(getPassword()).registrationDate(getRegistrationDate()).status(getUserStatus()).build()
        ));
    }
}
