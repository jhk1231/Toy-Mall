package com.blog.api.module.common.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFileMappingInfo is a Querydsl query type for FileMappingInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFileMappingInfo extends EntityPathBase<FileMappingInfo> {

    private static final long serialVersionUID = -517538806L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFileMappingInfo fileMappingInfo = new QFileMappingInfo("fileMappingInfo");

    public final com.blog.api.module.model.QBaseEntity _super = new com.blog.api.module.model.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final QFileInfo fileInfo;

    //inherited
    public final StringPath id = _super.id;

    public final StringPath name = createString("name");

    //inherited
    public final EnumPath<com.blog.api.module.essential.constants.BlogEntityStatus> status = _super.status;

    public final EnumPath<com.blog.api.module.essential.constants.FileType> type = createEnum("type", com.blog.api.module.essential.constants.FileType.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QFileMappingInfo(String variable) {
        this(FileMappingInfo.class, forVariable(variable), INITS);
    }

    public QFileMappingInfo(Path<? extends FileMappingInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFileMappingInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFileMappingInfo(PathMetadata metadata, PathInits inits) {
        this(FileMappingInfo.class, metadata, inits);
    }

    public QFileMappingInfo(Class<? extends FileMappingInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.fileInfo = inits.isInitialized("fileInfo") ? new QFileInfo(forProperty("fileInfo")) : null;
    }

}

