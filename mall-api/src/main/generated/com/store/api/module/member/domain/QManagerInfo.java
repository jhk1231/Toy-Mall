package com.store.api.module.member.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QManagerInfo is a Querydsl query type for ManagerInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QManagerInfo extends EntityPathBase<ManagerInfo> {

    private static final long serialVersionUID = 1293837137L;

    public static final QManagerInfo managerInfo = new QManagerInfo("managerInfo");

    public final com.store.api.module.model.QBaseEntity _super = new com.store.api.module.model.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final StringPath id = _super.id;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QManagerInfo(String variable) {
        super(ManagerInfo.class, forVariable(variable));
    }

    public QManagerInfo(Path<? extends ManagerInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QManagerInfo(PathMetadata metadata) {
        super(ManagerInfo.class, metadata);
    }

}

