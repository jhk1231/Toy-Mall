package com.blog.api.module.model;

import com.blog.api.module.essential.constants.PauseReason;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.Comment;

@MappedSuperclass
public class UserStatusModel extends BaseStatusModel {

    @Column(name = "pause_reason", length = 32)
    @Enumerated(value = EnumType.STRING)
    @Comment("일시정지사유")
    private PauseReason pauseReason;


    public void setPauseReason(PauseReason pauseReason) {
        this.pauseReason = pauseReason;
    }
}
