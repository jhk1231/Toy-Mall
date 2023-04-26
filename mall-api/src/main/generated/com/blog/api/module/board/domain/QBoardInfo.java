package com.blog.api.module.board.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoardInfo is a Querydsl query type for BoardInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardInfo extends EntityPathBase<BoardInfo> {

    private static final long serialVersionUID = 1788324001L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoardInfo boardInfo = new QBoardInfo("boardInfo");

    public final com.blog.api.module.model.QBaseEntity _super = new com.blog.api.module.model.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final StringPath id = _super.id;

    public final StringPath name = createString("name");

    public final NumberPath<Integer> order = createNumber("order", Integer.class);

    //inherited
    public final EnumPath<com.blog.api.module.essential.constants.BlogEntityStatus> status = _super.status;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public final com.blog.api.module.member.domain.QUserInfo userInfo;

    public QBoardInfo(String variable) {
        this(BoardInfo.class, forVariable(variable), INITS);
    }

    public QBoardInfo(Path<? extends BoardInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoardInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoardInfo(PathMetadata metadata, PathInits inits) {
        this(BoardInfo.class, metadata, inits);
    }

    public QBoardInfo(Class<? extends BoardInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userInfo = inits.isInitialized("userInfo") ? new com.blog.api.module.member.domain.QUserInfo(forProperty("userInfo")) : null;
    }

}

