package com.blog.api.module.common.domain;


import com.blog.api.module.essential.constants.FileType;
import com.blog.api.module.model.BaseEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PUBLIC;

/**
 * 게시글 정보
 */
@Entity
@Table(name = "file_mapping_info")
@NoArgsConstructor(access = PRIVATE)
public class FileMappingInfo extends BaseEntity {

    @Column(name = "owner_info", length = 32, nullable = false)
    @Comment("파일 소유 고유키")
    private String name;

    @Column(name = "type", length = 10, nullable = false)
    @Enumerated(value = EnumType.STRING)
    @Comment("파일구분")
    private FileType type;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "file_info",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_MAPPING_FILE"))
    @Comment("첨부 파일")
    private FileInfo fileInfo;

    @Builder(access = PUBLIC)
    FileMappingInfo(String name, FileType type, FileInfo fileInfo) {
        this.name = name;
        this.type = type;
        this.fileInfo = fileInfo;
    }
}
