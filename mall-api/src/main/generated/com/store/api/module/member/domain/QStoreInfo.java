package com.store.api.module.member.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStoreInfo is a Querydsl query type for StoreInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStoreInfo extends EntityPathBase<StoreInfo> {

    private static final long serialVersionUID = -1721569275L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStoreInfo storeInfo = new QStoreInfo("storeInfo");

    public final com.store.api.module.model.QContactEntity _super = new com.store.api.module.model.QContactEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final StringPath id = _super.id;

    //inherited
    public final StringPath phone = _super.phone;

    //inherited
    public final StringPath tel1 = _super.tel1;

    //inherited
    public final StringPath tel2 = _super.tel2;

    //inherited
    public final StringPath tel3 = _super.tel3;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public final QUserInfo userInfo;

    public QStoreInfo(String variable) {
        this(StoreInfo.class, forVariable(variable), INITS);
    }

    public QStoreInfo(Path<? extends StoreInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStoreInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStoreInfo(PathMetadata metadata, PathInits inits) {
        this(StoreInfo.class, metadata, inits);
    }

    public QStoreInfo(Class<? extends StoreInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userInfo = inits.isInitialized("userInfo") ? new QUserInfo(forProperty("userInfo")) : null;
    }

}

