package com.store.api.module.domain.member;

import com.store.api.module.common.status.UserStatus;
import com.store.api.module.repositories.member.UserDetailInfoRepository;
import com.store.api.module.repositories.member.UserInfoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.time.LocalDate;

@SpringBootTest
class UserDetailInfoTest {

    @Autowired
    UserInfoRepository userInfoRepository;

    @Autowired
    UserDetailInfoRepository userDetailInfoRepository;

    @Test
    @Rollback(value = false)
    void builder() {
        final UserInfo userInfo = getUserInfo();
        final UserDetailInfo info = getUserDetailInfo(userInfo);
        userInfoRepository.save(userInfo);
        userDetailInfoRepository.save(info);
    }

    private static UserDetailInfo getUserDetailInfo(UserInfo userInfo) {
        return UserDetailInfo.builder()
                .phone("hi")
                .userInfo(userInfo)
                .build();
    }

    private static UserInfo getUserInfo() {
        return UserInfo.builder()
                .userId("hoon")
                .password("h2")
                .registrationDate(LocalDate.now())
                .status(UserStatus.ACTIVE)
                .build();
    }
}