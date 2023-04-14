package com.store.api.module.domain.product;

import com.store.api.module.common.ProductCategory;
import com.store.api.module.domain.member.UserInfo;
import com.store.api.module.model.BaseEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.*;

@Entity
@Table(name = "product_info")
@NoArgsConstructor(access = PRIVATE)
public class ProductInfo extends BaseEntity {


    @Column(name = "category", nullable = false)
    @Enumerated(EnumType.STRING)
    private ProductCategory category;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_info",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_USER_PRODUCT"))
    @Comment("고객정보")
    private UserInfo userInfo;


    @Builder(access = PUBLIC)
    ProductInfo(ProductCategory category, UserInfo userInfo) {
        this.category = category;
        this.userInfo = userInfo;
    }
}
