package com.blog.api.module.board.domain;

import com.blog.api.module.essential.constants.BlogEntityStatus;
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


    @Column(name = "name", length = 100)
    @Comment("게시판명")
    private String name;

    @Column(name = "order", length = 4)
    @Comment("순번")
    private Integer order;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_info",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_USER_PRODUCT"))
    @Comment("고객정보")
    private UserInfo userInfo;


    @Builder(access = PUBLIC)
    BoardInfo(String name, int order, BlogEntityStatus status, UserInfo userInfo) {
        this.name = name;
        this.order = order;
        this.userInfo = userInfo;
        status = status;
    }
}
