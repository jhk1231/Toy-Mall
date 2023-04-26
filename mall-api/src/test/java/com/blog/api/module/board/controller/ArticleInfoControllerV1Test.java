package com.blog.api.module.board.controller;

import com.blog.api.module.board.domain.BoardInfo;
import com.blog.api.module.board.dto.ArticleInfoDto;
import com.blog.api.module.board.repository.BoardInfoRepository;
import com.blog.api.module.board.service.ArticleInfoService;
import com.blog.api.module.essential.constants.BlogEntityStatus;
import com.blog.api.module.member.domain.UserInfo;
import com.blog.api.module.member.repositoires.UserInfoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.blog.api.module.essential.constants.BlogEntityStatus.ACTIVE;
import static com.blog.api.module.util.TestUtils.getUserId;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureRestDocs
class ArticleInfoControllerV1Test {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    ArticleInfoService articleInfoService;

    @Autowired
    UserInfoRepository userInfoRepository;

    @Autowired
    BoardInfoRepository boardInfoRepository;

    @Test
    void get() {
        final PageRequest pageRequest = PageRequest.of(2, 50);
        final List<ArticleInfoDto> content = getArticleList();
        final PageImpl<ArticleInfoDto> serviceResponseDto = new PageImpl<>(content, pageRequest, content.size());
        given(articleInfoService.get(any(String.class), any(Pageable.class)))
                .willReturn(serviceResponseDto);






    }

    private List<ArticleInfoDto> getArticleList() {
        UserInfo userInfo = userInfoRepository.findByUserId(getUserId()).get();
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