package com.blog.api.module.board.dto;

import com.blog.api.module.essential.constants.BaseStatus;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
public class ArticleInfoDto {

    private String articleInfoNo;
    private String boardInfoNo;
    private String writer;
    private String subject;
    private String content;
    private String issueDate;
    private BaseStatus status;
}
