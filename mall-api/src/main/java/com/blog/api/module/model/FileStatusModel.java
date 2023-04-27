package com.blog.api.module.model;

import com.blog.api.module.essential.constants.FileType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.Comment;

@MappedSuperclass
public class FileStatusModel extends BaseStatusModel {
    @Column(name = "type", length = 10, nullable = false)
    @Enumerated(value = EnumType.STRING)
    @Comment("구분")
    private FileType type;


    public void setType(FileType type) {
        this.type = type;
    }
}
