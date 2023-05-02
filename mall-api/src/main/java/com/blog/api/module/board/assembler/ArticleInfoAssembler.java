package com.blog.api.module.board.assembler;

import com.blog.api.module.board.controller.ArticleInfoControllerV1;
import com.blog.api.module.board.controller.dto.ArticleInfoModel;
import com.blog.api.module.board.dto.ArticleInfoDto;
import com.blog.api.module.board.mapper.ArticleInfoMapper;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class ArticleInfoAssembler
        extends RepresentationModelAssemblerSupport<ArticleInfoDto, ArticleInfoModel> {

    private final ArticleInfoMapper mapper;

    public ArticleInfoAssembler(ArticleInfoMapper mapper) {
        super(ArticleInfoDto.class, ArticleInfoModel.class);
        this.mapper = mapper;
    }

    @Override
    public ArticleInfoModel toModel(ArticleInfoDto dto) {
        return mapper.toModel(dto).add(linkTo(methodOn(ArticleInfoControllerV1.class).get(dto.getArticleInfoNo())).withSelfRel());
    }
}
