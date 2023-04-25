package com.store.api.module.product.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductInfo is a Querydsl query type for ProductInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductInfo extends EntityPathBase<ProductInfo> {

    private static final long serialVersionUID = -2082081530L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductInfo productInfo = new QProductInfo("productInfo");

    public final com.store.api.module.model.QBaseEntity _super = new com.store.api.module.model.QBaseEntity(this);

    public final EnumPath<com.store.api.module.product.common.ProductCategory> category = createEnum("category", com.store.api.module.product.common.ProductCategory.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final StringPath id = _super.id;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public final com.store.api.module.member.domain.QUserInfo userInfo;

    public QProductInfo(String variable) {
        this(ProductInfo.class, forVariable(variable), INITS);
    }

    public QProductInfo(Path<? extends ProductInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductInfo(PathMetadata metadata, PathInits inits) {
        this(ProductInfo.class, metadata, inits);
    }

    public QProductInfo(Class<? extends ProductInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userInfo = inits.isInitialized("userInfo") ? new com.store.api.module.member.domain.QUserInfo(forProperty("userInfo")) : null;
    }

}

