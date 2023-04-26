package com.blog.api.module.board.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QArticleInfo is a Querydsl query type for ArticleInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QArticleInfo extends EntityPathBase<ArticleInfo> {

    private static final long serialVersionUID = -877086863L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QArticleInfo articleInfo = new QArticleInfo("articleInfo");

    public final com.blog.api.module.model.QBaseEntity _super = new com.blog.api.module.model.QBaseEntity(this);

    public final QBoardInfo boardInfo;

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final StringPath id = _super.id;

    public final StringPath issueDate = createString("issueDate");

    //inherited
    public final EnumPath<com.blog.api.module.essential.constants.BlogEntityStatus> status = _super.status;

    public final StringPath subject = createString("subject");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QArticleInfo(String variable) {
        this(ArticleInfo.class, forVariable(variable), INITS);
    }

    public QArticleInfo(Path<? extends ArticleInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QArticleInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QArticleInfo(PathMetadata metadata, PathInits inits) {
        this(ArticleInfo.class, metadata, inits);
    }

    public QArticleInfo(Class<? extends ArticleInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.boardInfo = inits.isInitialized("boardInfo") ? new QBoardInfo(forProperty("boardInfo"), inits.get("boardInfo")) : null;
    }

}

