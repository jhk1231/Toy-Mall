package com.blog.api.infra;

import com.blog.api.module.board.repository.BoardInfoRepository;
import com.blog.api.module.member.repositoires.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = {"default"})
public class TestCommandLineRunner implements CommandLineRunner {

    @Autowired
    UserInfoRepository user;

    @Autowired
    BoardInfoRepository board;

    @Override
    public void run(String... args) throws Exception {
//        user.saveAll(List.of(
//                UserInfo.builder().userId(getUserId()).password(getPassword()).registrationDate(getRegistrationDate()).status(getUserStatus()).build()
//        ));
//
//        UserInfo userInfo = user.findByUserId(getUserId()).get();
//
//        BoardInfo boardInfo = BoardInfo
//                .builder()
//                .name("Spring")
//                .order(0)
//                .userInfo(userInfo)
//                .build();
//
//        board.save(boardInfo);
    }
}
