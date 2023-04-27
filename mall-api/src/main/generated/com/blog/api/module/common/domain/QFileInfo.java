package com.blog.api.module.common.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFileInfo is a Querydsl query type for FileInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFileInfo extends EntityPathBase<FileInfo> {

    private static final long serialVersionUID = 918217472L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFileInfo fileInfo = new QFileInfo("fileInfo");

    public final com.blog.api.module.model.QFileStatusModel _super = new com.blog.api.module.model.QFileStatusModel(this);

    public final com.blog.api.module.board.domain.QArticleInfo articleInfo;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final StringPath id = _super.id;

    public final StringPath name = createString("name");

    public final StringPath path = createString("path");

    //inherited
    public final EnumPath<com.blog.api.module.essential.constants.BaseStatus> status = _super.status;

    //inherited
    public final EnumPath<com.blog.api.module.essential.constants.FileType> type = _super.type;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public final com.blog.api.module.member.domain.QUserInfo userInfo;

    public QFileInfo(String variable) {
        this(FileInfo.class, forVariable(variable), INITS);
    }

    public QFileInfo(Path<? extends FileInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFileInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFileInfo(PathMetadata metadata, PathInits inits) {
        this(FileInfo.class, metadata, inits);
    }

    public QFileInfo(Class<? extends FileInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.articleInfo = inits.isInitialized("articleInfo") ? new com.blog.api.module.board.domain.QArticleInfo(forProperty("articleInfo"), inits.get("articleInfo")) : null;
        this.userInfo = inits.isInitialized("userInfo") ? new com.blog.api.module.member.domain.QUserInfo(forProperty("userInfo")) : null;
    }

}

