package com.blog.api.module.board.mapper;

import com.blog.api.module.board.controller.dto.ArticleInfoModel;
import com.blog.api.module.board.dto.ArticleInfoDto;
import org.springframework.stereotype.Component;

@Component
public class ArticleInfoMapper {

    public ArticleInfoModel toModel(ArticleInfoDto dto) {
        ArticleInfoModel model = new ArticleInfoModel();
        model.setArticleInfoNo(dto.getArticleInfoNo());

        return model;
    }
}