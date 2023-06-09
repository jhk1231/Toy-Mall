package com.blog.api.module.board.controller.dto;

import com.blog.api.module.essential.constants.BaseStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Relation(collectionRelation = "content", itemRelation = "content")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ArticleInfoModel extends RepresentationModel<ArticleInfoModel> {

    @JsonProperty("articleInfoNo")
    private String articleInfoNo;

    @JsonProperty("boardInfoNo")
    private String boardInfoNo;

    @JsonProperty("writer")
    private String writer;

    @JsonProperty("subject")
    private String subject;

    @JsonProperty("content")
    private String content;

    @JsonProperty("issueDate")
    private String issueDate;

    @JsonProperty("status")
    private BaseStatus status;



}
