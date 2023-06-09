package com.store.domain.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.store.domain.BaseTimeEntity;
import com.store.domain.UserStatus;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.domain.Persistable;

import java.time.LocalDate;

import static lombok.AccessLevel.PUBLIC;

/**
 * 고객관리 Table
 */
@Entity
@Table(name = "user_info")
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class UserInfo extends BaseTimeEntity implements Persistable<String> {

    @Id
    @GenericGenerator(name = "mall-uuid", strategy = "com.store.util.UUIDGenerator")
    @GeneratedValue(generator = "mall-uuid")
    @Column(length = 32, nullable = false)
    @Comment("고객관리고유키")
    private String id;

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
    UserInfo(LocalDate registrationDate,
             UserStatus status,
             String pauseReason,
             LocalDate pauseDate) {
        this.registrationDate = registrationDate;
        this.status = status;
        this.pauseReason = pauseReason;
        this.pauseDate = pauseDate;
    }

    @Override
    public String getId() {
        return getId();
    }

    @Override
    public boolean isNew() {
        return this.updatedDate == null;
    }
}
