package com.blog.api.module.member.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserDetailInfo is a Querydsl query type for UserDetailInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserDetailInfo extends EntityPathBase<UserDetailInfo> {

    private static final long serialVersionUID = 744981940L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserDetailInfo userDetailInfo = new QUserDetailInfo("userDetailInfo");

    public final com.blog.api.module.model.QContactEntity _super = new com.blog.api.module.model.QContactEntity(this);

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

    public QUserDetailInfo(String variable) {
        this(UserDetailInfo.class, forVariable(variable), INITS);
    }

    public QUserDetailInfo(Path<? extends UserDetailInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserDetailInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserDetailInfo(PathMetadata metadata, PathInits inits) {
        this(UserDetailInfo.class, metadata, inits);
    }

    public QUserDetailInfo(Class<? extends UserDetailInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userInfo = inits.isInitialized("userInfo") ? new QUserInfo(forProperty("userInfo")) : null;
    }

}

