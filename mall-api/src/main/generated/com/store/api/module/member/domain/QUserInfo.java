package com.store.api.module.member.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserInfo is a Querydsl query type for UserInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserInfo extends EntityPathBase<UserInfo> {

    private static final long serialVersionUID = 454376835L;

    public static final QUserInfo userInfo = new QUserInfo("userInfo");

    public final com.store.api.module.model.QBaseEntity _super = new com.store.api.module.model.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final StringPath id = _super.id;

    public final StringPath password = createString("password");

    public final DatePath<java.time.LocalDate> pauseDate = createDate("pauseDate", java.time.LocalDate.class);

    public final StringPath pauseReason = createString("pauseReason");

    public final DatePath<java.time.LocalDate> registrationDate = createDate("registrationDate", java.time.LocalDate.class);

    public final EnumPath<com.store.api.module.member.common.status.UserStatus> status = createEnum("status", com.store.api.module.member.common.status.UserStatus.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public final StringPath userId = createString("userId");

    public QUserInfo(String variable) {
        super(UserInfo.class, forVariable(variable));
    }

    public QUserInfo(Path<? extends UserInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserInfo(PathMetadata metadata) {
        super(UserInfo.class, metadata);
    }

}

