package com.blog.api.module.board.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticleInfoModel extends RepresentationModel<ArticleInfoModel> {

    @JsonProperty("articleInfoNo")
    private String articleInfoNo;
}
