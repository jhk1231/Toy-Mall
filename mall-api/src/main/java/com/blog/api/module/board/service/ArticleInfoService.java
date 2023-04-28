package com.blog.api.module.board.service;

import com.blog.api.module.board.domain.ArticleInfo;
import com.blog.api.module.board.dto.ArticleInfoDto;
import com.blog.api.module.board.repository.ArticleInfoRepository;
import com.blog.api.module.board.repository.query.ArticleInfoQueryRepository;
import com.blog.api.module.system.error.BlogException;
import com.blog.api.module.system.error.EssentialError;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Slf4j
public class ArticleInfoService {

    private final ArticleInfoRepository articleInfoRepository;
    private final ArticleInfoQueryRepository articleInfoQueryRepository;

    public Page<ArticleInfoDto> get(String boardInfoNo, Pageable pageable) {

        log.info("Start to get articles. [boardInfoNo:{}]", boardInfoNo);

        final Page<ArticleInfoDto> responseDto = articleInfoQueryRepository.findInfos(boardInfoNo, pageable);

        log.info("Finished to get articles. [boardInfoNo:{}]", boardInfoNo);

        return responseDto;
    }

    public ArticleInfoDto get(String articleInfoNo) {

        log.info("Start to get one-article. [articleInfoNo:{}]", articleInfoNo);

        final ArticleInfo info = articleInfoRepository.findById(articleInfoNo)
                .orElseThrow(() -> new BlogException(EssentialError.NOT_FOUND_ARTICLE_INFO));
        final ArticleInfoDto dto = toArticleInfoDto(info);

        log.info("Finished to get one-article. [articleInfoNo:{}]", articleInfoNo);

        return dto;
    }

    private ArticleInfoDto toArticleInfoDto(ArticleInfo info) {
        return ArticleInfoDto.builder()
                .articleInfoNo(info.getId())
                .boardInfoNo(info.getBoardInfo().getId())
                .subject(info.getSubject())
                .content(info.getContent())
                .status(info.getStatus())
                .issueDate(info.getIssueDate())
                .build();
    }
}
