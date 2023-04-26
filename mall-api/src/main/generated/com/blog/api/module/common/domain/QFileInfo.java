package com.blog.api.module.common.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QFileInfo is a Querydsl query type for FileInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFileInfo extends EntityPathBase<FileInfo> {

    private static final long serialVersionUID = 918217472L;

    public static final QFileInfo fileInfo = new QFileInfo("fileInfo");

    public final com.blog.api.module.model.QBaseEntity _super = new com.blog.api.module.model.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final StringPath id = _super.id;

    public final StringPath name = createString("name");

    public final StringPath path = createString("path");

    //inherited
    public final EnumPath<com.blog.api.module.essential.constants.BlogEntityStatus> status = _super.status;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QFileInfo(String variable) {
        super(FileInfo.class, forVariable(variable));
    }

    public QFileInfo(Path<? extends FileInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFileInfo(PathMetadata metadata) {
        super(FileInfo.class, metadata);
    }

}

