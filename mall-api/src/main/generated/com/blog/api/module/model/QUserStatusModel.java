package com.blog.api.module.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserStatusModel is a Querydsl query type for UserStatusModel
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QUserStatusModel extends EntityPathBase<UserStatusModel> {

    private static final long serialVersionUID = -1809306600L;

    public static final QUserStatusModel userStatusModel = new QUserStatusModel("userStatusModel");

    public final QBaseStatusModel _super = new QBaseStatusModel(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final StringPath id = _super.id;

    public final EnumPath<com.blog.api.module.essential.constants.PauseReason> pauseReason = createEnum("pauseReason", com.blog.api.module.essential.constants.PauseReason.class);

    //inherited
    public final EnumPath<com.blog.api.module.essential.constants.BaseStatus> status = _super.status;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QUserStatusModel(String variable) {
        super(UserStatusModel.class, forVariable(variable));
    }

    public QUserStatusModel(Path<? extends UserStatusModel> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserStatusModel(PathMetadata metadata) {
        super(UserStatusModel.class, metadata);
    }

}

