package com.blog.api.module.board.domain;

import com.blog.api.module.essential.constants.BaseStatus;
import com.blog.api.module.model.BaseStatusModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PUBLIC;

/**
 * 게시판 정보
 */
@Entity
@Table(name = "board_info")
@NoArgsConstructor(access = PRIVATE)
public class BoardInfo extends BaseStatusModel {

    @Column(name = "name", length = 100)
    @Comment("게시판명")
    private String name;

    @Column(name = "order", length = 4)
    @Comment("순번")
    private int order;


    @Builder(access = PUBLIC)
    BoardInfo(String name,
              int order,
              BaseStatus status) {
        this.name = name;
        this.order = order;
        this.setStatus(status);
    }
}
