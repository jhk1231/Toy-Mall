package com.blog.api.module.board.domain;

import com.blog.api.module.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import static jakarta.persistence.FetchType.EAGER;
import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PUBLIC;

/**
 * 게시글 정보
 */
@Entity
@Table(name = "article_info")
@NoArgsConstructor(access = PRIVATE)
public class ArticleInfo extends BaseEntity {

    @Column(name = "subject", length = 100, nullable = false)
    @Comment("제목")
    private String subject;

    @Column(name = "content", columnDefinition = "logtext")
    @Comment("내용")
    private String content;

    @Column(name = "issue_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd")
    private String issueDate;

    @ManyToOne(fetch = EAGER)
    @JoinColumn(name = "board_info",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_ARTICLE_BOARD"))
    @Comment("게시판정보")
    private BoardInfo boardInfo;

    @Builder(access = PUBLIC)
    ArticleInfo(String subject,
                String content,
                String issueDate,
                BoardInfo boardInfo) {
        this.subject = subject;
        this.content = content;
        this.issueDate = issueDate;
        this.boardInfo = boardInfo;
    }
}
