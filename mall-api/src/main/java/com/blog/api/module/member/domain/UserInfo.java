package com.blog.api.module.member.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.blog.api.module.member.common.status.UserStatus;
import com.blog.api.module.model.BaseEntity;
import jakarta.persistence.*;
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
public class UserInfo extends BaseEntity {

    @Column(name = "user_id", nullable = false)
    @Comment("회원 ID")
    private String userId;

    @Column(name = "password", nullable = false)
    @Comment("비밀번호")
    private String password;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @Column(name = "registration_date", nullable = false)
    @Comment("가입일자")
    private LocalDate registrationDate;

    @Column(name = "user_status", nullable = false)
    @Enumerated(EnumType.STRING)
    @Comment("고객상태")
    private UserStatus status;

    @Column(name = "pause_reason", length = 32)
    @Comment("일시정지사유")
    private String pauseReason;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @Column(name = "pause_date")
    @Comment("일시정지일시")
    private LocalDate pauseDate;


    @Builder(access = PUBLIC)
    UserInfo(String userId,
             String password,
             LocalDate registrationDate,
             UserStatus status,
             String pauseReason,
             LocalDate pauseDate) {
        this.userId = userId;
        this.password = password;
        this.registrationDate = registrationDate;
        this.status = status;
        this.pauseReason = pauseReason;
        this.pauseDate = pauseDate;
    }

}
