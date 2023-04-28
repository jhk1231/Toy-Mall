package com.blog.api.module.board.controller;

import com.blog.api.module.board.assembler.ArticleInfoAssembler;
import com.blog.api.module.board.controller.dto.ArticleInfoModel;
import com.blog.api.module.board.dto.ArticleInfoDto;
import com.blog.api.module.board.service.ArticleInfoService;
import com.blog.api.module.essential.constants.BaseStatus;
import com.blog.api.module.system.ApiResponseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
@RequiredArgsConstructor
@Slf4j
public class ArticleInfoControllerV1 {

    private final ArticleInfoService articleInfoService;
    private final ArticleInfoAssembler articleInfoAssembler;
    private final PagedResourcesAssembler<ArticleInfoDto> articleInfoDtoPagedResourcesAssembler;

    @GetMapping
    public ResponseEntity<ApiResponseDto<PagedModel<ArticleInfoModel>>>
    get(@RequestParam("boardInfoNo") String boardInfoNo,
        @PageableDefault(size = 10, direction = Sort.Direction.DESC) Pageable pageable) {

        log.info("Request to get articles. [boardInfoNo:{}]", boardInfoNo);

        final Page<ArticleInfoDto> serviceResponseDto = articleInfoService.get(boardInfoNo, pageable);
        final PagedModel<ArticleInfoModel> model = articleInfoDtoPagedResourcesAssembler.toModel(serviceResponseDto, articleInfoAssembler);
        final ApiResponseDto<PagedModel<ArticleInfoModel>> responseDto = new ApiResponseDto<>(model);

        log.info("Response to get articles. [boardInfoNo:{}]", boardInfoNo);

        return ResponseEntity.ok(responseDto);
    }


    @GetMapping("/{articleInfoNo}")
    public ResponseEntity<ApiResponseDto<ArticleInfoModel>>
    get(@PathVariable("articleInfoNo") String articleInfoNo) {

        log.info("Request to get one-article. [articleInfoNo:{}]", articleInfoNo);

        final ArticleInfoDto serviceResponseDto = articleInfoService.get(articleInfoNo);
        final ArticleInfoModel model = createArticleModel(serviceResponseDto);
        final ApiResponseDto<ArticleInfoModel> responseDto = new ApiResponseDto<>(model);

        log.info("Response to get one-article. [articleInfoNo:{}]", articleInfoNo);

        return ResponseEntity.ok(responseDto);
    }

    private ArticleInfoModel createArticleModel(ArticleInfoDto serviceResponseDto) {
        ArticleInfoModel model = new ArticleInfoModel();
        model.setArticleInfoNo(serviceResponseDto.getArticleInfoNo());
        model.setBoardInfoNo(serviceResponseDto.getBoardInfoNo());
        model.setSubject(serviceResponseDto.getSubject());
        model.setContent(serviceResponseDto.getContent());
        model.setIssueDate(serviceResponseDto.getIssueDate());
        model.setStatus(serviceResponseDto.getStatus());

        return model;
    }
}
