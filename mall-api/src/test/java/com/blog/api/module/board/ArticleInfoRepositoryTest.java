package com.blog.api.module.board;

import com.blog.api.module.board.domain.ArticleInfo;
import com.blog.api.module.board.domain.BoardInfo;
import com.blog.api.module.board.repository.ArticleInfoRepository;
import com.blog.api.module.board.repository.BoardInfoRepository;
import com.blog.api.module.member.domain.UserInfo;
import com.blog.api.module.member.repositoires.UserInfoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static com.blog.api.module.essential.constants.BlogEntityStatus.ACTIVE;

@SpringBootTest
class ArticleInfoRepositoryTest {

    @Autowired
    UserInfoRepository user;

    @Autowired
    BoardInfoRepository board;

    @Autowired
    ArticleInfoRepository article;

    @Test
    void saveDate() {

        UserInfo userInfo = UserInfo.builder()
                .userId("test")
                .password("t")
                .registrationDate(LocalDate.now())
                .status(ACTIVE)
                .build();

        user.save(userInfo);

        BoardInfo boardInfo = BoardInfo.builder()
                .name("Test")
                .order(0)
                .status(ACTIVE)
                .userInfo(userInfo)
                .build();

        board.save(boardInfo);

        ArticleInfo articleInfo = ArticleInfo.builder()
                .subject("[스프링 부트/Spring Boot] 스프링 게시판 만들기")
                .issueDate("20230410")
                .content("글 내용 미리보기1")
                .boardInfo(boardInfo)
                .build();

        article.save(articleInfo);
    }

}