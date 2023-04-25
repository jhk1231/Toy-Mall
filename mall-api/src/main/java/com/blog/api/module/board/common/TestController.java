package com.blog.api.module.board.common;

import com.blog.api.module.system.ApiResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test/sample")
@Slf4j
public class TestController {


    @GetMapping
    public ResponseEntity<ApiResponseDto<List<Map<String, Object>>>> get() {
        return ResponseEntity.ok(new ApiResponseDto<>(List.of(
                Map.of(
                        "subject", "[스프링 부트/Spring Boot] 스프링 게시판 만들기",
                        "category", "Spring",
                        "date", "20230425",
                        "content", "글 내용 미리보기1",
                        "img", "test.png",
                        "createAt", "20230425",
                        "updateAt", "20230426"
                ),
                Map.of(
                        "subject", "[스프링 부트/Spring Boot] JAVA 게시판 만들기",
                        "category", "Spring",
                        "date", "20230426",
                        "content", "글 내용 미리보기2",
                        "img", "a.png",
                        "createAt", "20230425",
                        "updateAt", "20230426"
                ),
                Map.of(
                        "subject", "[스프링 부트/Spring Boot] Hello 게시판 만들기",
                        "category", "Spring",
                        "date", "20230427",
                        "content", "글 내용 미리보기3",
                        "img", "spring.png",
                        "createAt", "20230425",
                        "updateAt", "20230426"
                )
        )));

    }
}
