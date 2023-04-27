package com.blog.api.module.common.domain;


import com.blog.api.module.board.domain.ArticleInfo;
import com.blog.api.module.essential.constants.BaseStatus;
import com.blog.api.module.essential.constants.FileType;
import com.blog.api.module.member.domain.UserInfo;
import com.blog.api.module.model.FileStatusModel;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PUBLIC;

/**
 * 게시글 정보
 */
@Entity
@Table(name = "file_info")
@NoArgsConstructor(access = PRIVATE)
public class FileInfo extends FileStatusModel {

    @Column(name = "name", length = 100, nullable = false)
    @Comment("파일명")
    private String name;

    @Column(name = "path", length = 100, nullable = false)
    @Comment("저장경로")
    private String path;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "article_info",
            foreignKey = @ForeignKey(name = "file_info_article"))
    @Comment("게시글 고유키")
    private ArticleInfo articleInfo;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_info",
            foreignKey = @ForeignKey(name = "file_info_user"))
    @Comment("사용자 고유키")
    private UserInfo userInfo;

    @Builder(access = PUBLIC)
    FileInfo(String name,
             String path,
             FileType type,
             BaseStatus status,
             ArticleInfo articleInfo,
             UserInfo userInfo) {
        this.name = name;
        this.path = path;
        this.setType(type);
        this.setStatus(status);
        this.articleInfo = articleInfo;
        this.userInfo = userInfo;
    }
}
