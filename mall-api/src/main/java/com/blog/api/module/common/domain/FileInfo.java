package com.blog.api.module.common.domain;


import com.blog.api.module.essential.constants.BlogEntityStatus;
import com.blog.api.module.model.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PUBLIC;

/**
 * 게시글 정보
 */
@Entity
@Table(name = "file_info")
@NoArgsConstructor(access = PRIVATE)
public class FileInfo extends BaseEntity {

    @Column(name = "name", length = 100, nullable = false)
    @Comment("파일명")
    private String name;

    @Column(name = "path", length = 100, nullable = false)
    @Comment("저장경로")
    private String path;

    @Builder(access = PUBLIC)
    FileInfo(String name, String path, BlogEntityStatus status) {
        this.name = name;
        this.path = path;
        status = status;
    }
}
