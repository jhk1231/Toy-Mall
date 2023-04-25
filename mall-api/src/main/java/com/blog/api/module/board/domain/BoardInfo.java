package com.blog.api.module.board.domain;

import com.blog.api.module.board.common.ProductCategory;
import com.blog.api.module.member.domain.UserInfo;
import com.blog.api.module.model.BaseEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.*;

/**
 * 게시판 정보
 */
@Entity
@Table(name = "board_info")
@NoArgsConstructor(access = PRIVATE)
public class BoardInfo extends BaseEntity {


//    @Column(name = "category", nullable = false)
//    @Enumerated(EnumType.STRING)
//    private ProductCategory category;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_info",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_USER_PRODUCT"))
    @Comment("고객정보")
    private UserInfo userInfo;


    @Builder(access = PUBLIC)
    BoardInfo(ProductCategory category, UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
