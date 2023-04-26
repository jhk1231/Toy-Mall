package com.blog.api.module.board.dto;

import com.blog.api.module.essential.constants.BlogEntityStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class ArticleInfoDto {

    private String articleInfoNo;
    private String boardInfoNo;
    private String subject;
    private String content;
    private String issueDate;
    private BlogEntityStatus status;
}
