package com.blog.api.module.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QFileStatusModel is a Querydsl query type for FileStatusModel
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QFileStatusModel extends EntityPathBase<FileStatusModel> {

    private static final long serialVersionUID = -1624057401L;

    public static final QFileStatusModel fileStatusModel = new QFileStatusModel("fileStatusModel");

    public final QBaseStatusModel _super = new QBaseStatusModel(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final StringPath id = _super.id;

    //inherited
    public final EnumPath<com.blog.api.module.essential.constants.BaseStatus> status = _super.status;

    public final EnumPath<com.blog.api.module.essential.constants.FileType> type = createEnum("type", com.blog.api.module.essential.constants.FileType.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QFileStatusModel(String variable) {
        super(FileStatusModel.class, forVariable(variable));
    }

    public QFileStatusModel(Path<? extends FileStatusModel> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFileStatusModel(PathMetadata metadata) {
        super(FileStatusModel.class, metadata);
    }

}

