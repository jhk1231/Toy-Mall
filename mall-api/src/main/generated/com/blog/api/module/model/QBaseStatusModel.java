package com.blog.api.module.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBaseStatusModel is a Querydsl query type for BaseStatusModel
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QBaseStatusModel extends EntityPathBase<BaseStatusModel> {

    private static final long serialVersionUID = -1368649390L;

    public static final QBaseStatusModel baseStatusModel = new QBaseStatusModel("baseStatusModel");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final StringPath id = _super.id;

    public final EnumPath<com.blog.api.module.essential.constants.BaseStatus> status = createEnum("status", com.blog.api.module.essential.constants.BaseStatus.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QBaseStatusModel(String variable) {
        super(BaseStatusModel.class, forVariable(variable));
    }

    public QBaseStatusModel(Path<? extends BaseStatusModel> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBaseStatusModel(PathMetadata metadata) {
        super(BaseStatusModel.class, metadata);
    }

}

