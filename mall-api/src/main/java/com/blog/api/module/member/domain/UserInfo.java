package com.blog.api.module.member.domain;

import com.blog.api.module.essential.constants.BaseStatus;
import com.blog.api.module.essential.constants.PauseReason;
import com.blog.api.module.model.UserStatusModel;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.LocalDate;

import static lombok.AccessLevel.PUBLIC;

/**
 * 고객관리 Table
 */
@Entity
@Table(name = "user_info")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserInfo extends UserStatusModel {

    @Column(name = "user_id", nullable = false)
    @Comment("회원 ID")
    private String userId;

    @Column(name = "password", nullable = false)
    @Comment("비밀번호")
    private String password;

    @Column(name = "nickname", length = 30, nullable = false)
    @Comment("닉네임")
    private String nickname;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @Column(name = "registration_date", nullable = false)
    @Comment("가입일자")
    private LocalDate registrationDate;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @Column(name = "pause_date")
    @Comment("일시정지일시")
    private LocalDate pauseDate;


    @Builder(access = PUBLIC)
    UserInfo(String userId,
             String password,
             LocalDate registrationDate,
             BaseStatus status,
             String nickname,
             PauseReason pauseReason,
             LocalDate pauseDate) {
        this.userId = userId;
        this.password = password;
        this.registrationDate = registrationDate;
        this.nickname = nickname;
        this.setStatus(status);
        this.setPauseReason(pauseReason);
        this.pauseDate = pauseDate;
    }

}
