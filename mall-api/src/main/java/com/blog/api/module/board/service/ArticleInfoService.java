package com.blog.api.module.board.service;

import com.blog.api.module.board.dto.ArticleInfoDto;
import com.blog.api.module.board.repository.query.ArticleInfoQueryRepository;
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

    private final ArticleInfoQueryRepository articleInfoQueryRepository;

    public Page<ArticleInfoDto> get(String boardInfoNo, Pageable pageable) {

        log.info("Start to get articles. [boardInfoNo:{}]", boardInfoNo);

        final Page<ArticleInfoDto> responseDto = articleInfoQueryRepository.findInfos(boardInfoNo, pageable);

        log.info("Finished to get articles. [boardInfoNo:{}]", boardInfoNo);

        return responseDto;
    }
}
