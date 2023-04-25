package com.blog.api.module.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
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
    @GenericGenerator(name = "mall-uuid", strategy = "com.store.api.module.util.UUIDGenerator")
    @GeneratedValue(generator = "mall-uuid")
    @Column(length = 32, nullable = false)
    private String id;

    @Column(name = "created_at", updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @CreatedDate
    protected LocalDateTime createdDate;

    @Column(name = "updated_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @LastModifiedDate
    protected LocalDateTime updatedDate;


    @Override
    public String getId() {
        return getId();
    }

    @Override
    public boolean isNew() {
        return this.updatedDate == null;
    }

}

