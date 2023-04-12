package com.store.domain.common;

import com.store.domain.BaseTimeEntity;
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

import static lombok.AccessLevel.PUBLIC;

/**
 * 고객세부정보
 */
@Entity
@Table(name = "user_detail")
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class UserDetailInfo extends BaseTimeEntity implements Persistable<String> {

    @Id
    @GenericGenerator(name = "mall-uuid", strategy = "com.store.util.UUIDGenerator")
    @GeneratedValue(generator = "mall-uuid")
    @Column(length = 32, nullable = false)
    @Comment("고객세부정보고유키")
    private String id;


    @Column(name = "phone", length = 14)
    private String phone;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_info",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_USER_INFO"))
    @Comment("고객정보")
    private UserInfo userInfo;


    @Builder(access = PUBLIC)
    UserDetailInfo(String phone, UserInfo userInfo) {
        this.phone = phone;
        this.userInfo = userInfo;
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
