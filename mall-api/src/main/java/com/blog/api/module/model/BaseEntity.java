package com.blog.api.module.model;

import com.blog.api.module.essential.constants.BlogEntityStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.Persistable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;

@DynamicInsert
@DynamicUpdate
@EntityListeners(AuditingEntityListener.class)
@Getter
@MappedSuperclass
public class BaseEntity implements Serializable, Persistable<String> {

    @Id
    @GenericGenerator(name = "blog-uuid", strategy = "com.blog.api.module.util.UUIDGenerator")
    @GeneratedValue(generator = "blog-uuid")
    @Column(length = 32, nullable = false)
    private String id;

    @Column(name = "status", length = 10, nullable = false)
    @Enumerated(value = EnumType.STRING)
    @Comment("상태")
    private BlogEntityStatus status;

    @Column(name = "created_at", updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @CreatedDate
    private LocalDateTime createdDate;

    @Column(name = "updated_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @LastModifiedDate
    private LocalDateTime updatedDate;


    @Override
    public String getId() {
        return getId();
    }

    @Override
    public boolean isNew() {
        return this.updatedDate == null;
    }

}

