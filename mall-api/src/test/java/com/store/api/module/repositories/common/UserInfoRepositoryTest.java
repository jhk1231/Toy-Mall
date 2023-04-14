package com.store.api.module.repositories.common;

import com.store.api.module.common.status.UserStatus;
import com.store.api.module.domain.member.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class UserInfoRepositoryTest {

    @Autowired
    UserInfoRepository repository;


    @Test
    void chacheTest() {
        log.info("===================1===================");
        List<UserInfo> all = repository.findAll();
        log.info("===================1-2===================");
        List<UserInfo> all2 = repository.findAll();
        log.info("===================1===================");

    }


    @Test
    @Transactional
    @Rollback(value = false)
    void insert() {
        List<UserInfo> infos = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            infos.add(getUserInfo(i));
        }
        repository.saveAll(infos);
    }

    private static UserInfo getUserInfo(int i) {
        return UserInfo.builder()
                .userId("hoon" + i)
                .password("h2")
                .registrationDate(LocalDate.now())
                .status(UserStatus.ACTIVE)
                .build();
    }

}