package com.blog.api.module.board.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBoardInfo is a Querydsl query type for BoardInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardInfo extends EntityPathBase<BoardInfo> {

    private static final long serialVersionUID = 1788324001L;

    public static final QBoardInfo boardInfo = new QBoardInfo("boardInfo");

    public final com.blog.api.module.model.QBaseStatusModel _super = new com.blog.api.module.model.QBaseStatusModel(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final StringPath id = _super.id;

    public final StringPath name = createString("name");

    public final NumberPath<Integer> order = createNumber("order", Integer.class);

    //inherited
    public final EnumPath<com.blog.api.module.essential.constants.BaseStatus> status = _super.status;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QBoardInfo(String variable) {
        super(BoardInfo.class, forVariable(variable));
    }

    public QBoardInfo(Path<? extends BoardInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoardInfo(PathMetadata metadata) {
        super(BoardInfo.class, metadata);
    }

}

