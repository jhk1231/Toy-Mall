package com.blog.api.module.board.controller;

import com.blog.api.module.board.domain.ArticleInfo;
import com.blog.api.module.board.domain.BoardInfo;
import com.blog.api.module.board.dto.ArticleInfoDto;
import com.blog.api.module.board.repository.ArticleInfoRepository;
import com.blog.api.module.board.repository.BoardInfoRepository;
import com.blog.api.module.board.service.ArticleInfoService;
import com.blog.api.module.member.domain.UserInfo;
import com.blog.api.module.member.repositoires.UserInfoRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static com.blog.api.module.essential.constants.BaseStatus.ACTIVE;
import static com.blog.api.module.util.TestUtils.*;
import static com.blog.api.module.util.TestUtils.getUserStatus;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@Disabled
@SpringBootTest(
        properties = {
                "logging.level.org.hibernate=debug"
        }
)
@AutoConfigureMockMvc
@AutoConfigureRestDocs
class ArticleInfoControllerV1Test {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ArticleInfoService articleInfoService;

    @Autowired
    UserInfoRepository userInfoRepository;

    @Autowired
    BoardInfoRepository boardInfoRepository;

    @Autowired
    ArticleInfoRepository articleInfoRepository;

    @Test
    @Rollback(value = false)
    @Transactional
    void setUp() throws Exception {
        UserInfo user = UserInfo
                .builder()
                .userId(getUserId())
                .password(getPassword())
                .registrationDate(getRegistrationDate())
                .nickname("Hoon")
                .status(getUserStatus())
                .build();

        userInfoRepository.save(user);
    }


    @Test
    @Rollback(value = false)
    @Transactional
    void setBoard() throws Exception {
//        BoardInfo board = BoardInfo.builder()
//                .name("Spring Boot")
//                .order(0)
//                .status(ACTIVE)
//                .build();

        BoardInfo board = boardInfoRepository.findById("2dv7cdqle24242ab89e45869ba5f6q33").get();
        List<ArticleInfo> list = new ArrayList<>();
        ArticleInfo info0 = ArticleInfo.builder()
                .subject("[스프링 부트/Spring Boot] 스프링 게시판 만들기")
                .status(ACTIVE)
                .issueDate("20230425")
                .content("글 내용 미리보기1")
                .boardInfo(board)
                .build();

        ArticleInfo info1 = ArticleInfo.builder()
                .subject("[스프링 부트/Spring Boot] JAVA 게시판 만들기")
                .status(ACTIVE)
                .issueDate("20230421")
                .content("글 내용 미리보기2")
                .boardInfo(board)
                .build();

        ArticleInfo info2 = ArticleInfo.builder()
                .subject("[스프링 부트/Spring Boot] Hello 게시판 만들기")
                .status(ACTIVE)
                .issueDate("20230411")
                .content("글 내용 미리보기3")
                .boardInfo(board)
                .build();

        list.add(info0);
        list.add(info1);
        list.add(info2);


        articleInfoRepository.saveAll(list);
    }


    @Test
    void get() {
        final PageRequest pageRequest = PageRequest.of(2, 50);
        final List<ArticleInfoDto> content = getArticleList();
        final PageImpl<ArticleInfoDto> serviceResponseDto = new PageImpl<>(content, pageRequest, content.size());
        given(articleInfoService.get(any(String.class), any(Pageable.class)))
                .willReturn(serviceResponseDto);
    }

    private List<ArticleInfoDto> getArticleList() {
        BoardInfo board = boardInfoRepository.findAll().get(0);

        List<ArticleInfoDto> list = new ArrayList<>();
        ArticleInfoDto dto = new ArticleInfoDto();
        dto.setSubject("[스프링 부트/Spring Boot] 스프링 게시판 만들기");
        dto.setStatus(ACTIVE);
        dto.setIssueDate("20230425");
        dto.setContent("글 내용 미리보기1");
        dto.setBoardInfoNo(board.getId());

        ArticleInfoDto dto2 = new ArticleInfoDto();
        dto2.setSubject("[스프링 부트/Spring Boot] JAVA 게시판 만들기");
        dto2.setStatus(ACTIVE);
        dto2.setIssueDate("20230421");
        dto2.setContent("글 내용 미리보기2");
        dto2.setBoardInfoNo(board.getId());

        ArticleInfoDto dto3 = new ArticleInfoDto();
        dto3.setSubject("[스프링 부트/Spring Boot] Hello 게시판 만들기");
        dto3.setStatus(ACTIVE);
        dto3.setIssueDate("20230411");
        dto3.setContent("글 내용 미리보기3");
        dto3.setBoardInfoNo(board.getId());

        list.add(dto);
        list.add(dto2);
        list.add(dto3);
        return list;
    }
}