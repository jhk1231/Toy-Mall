package com.store.api.module.domain.member;

import com.store.api.module.model.ContactEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import static lombok.AccessLevel.PUBLIC;

/**
 * 고객세부정보
 */
@Entity
@Table(name = "user_detail")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserDetailInfo extends ContactEntity {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_info",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_USER_DETAIL"))
    @Comment("고객정보")
    private UserInfo userInfo;


    @Builder(access = PUBLIC)
    UserDetailInfo(String phone, UserInfo userInfo) {
        phone = phone;
        this.userInfo = userInfo;
    }

}
