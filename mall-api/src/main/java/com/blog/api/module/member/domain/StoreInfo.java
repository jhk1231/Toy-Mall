package com.blog.api.module.member.domain;

import com.blog.api.module.model.ContactEntity;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PRIVATE;

@Entity
@Table(name = "store_info")
@NoArgsConstructor(access = PRIVATE)
public class StoreInfo extends ContactEntity {

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_info",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_USER_STORE")
    )
    @Comment("고객정보")
    private UserInfo userInfo;
}
