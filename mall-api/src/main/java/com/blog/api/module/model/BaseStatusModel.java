package com.blog.api.module.model;

import com.blog.api.module.essential.constants.BaseStatus;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.Comment;

@MappedSuperclass
public class BaseStatusModel extends BaseEntity {
    @Column(name = "status", length = 10, nullable = false)
    @Enumerated(value = EnumType.STRING)
    @Comment("상태")
    private BaseStatus status;


    public void setStatus(BaseStatus status) {
        this.status = status;
    }
}
