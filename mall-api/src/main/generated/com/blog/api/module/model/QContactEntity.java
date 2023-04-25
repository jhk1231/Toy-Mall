package com.blog.api.module.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QContactEntity is a Querydsl query type for ContactEntity
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QContactEntity extends EntityPathBase<ContactEntity> {

    private static final long serialVersionUID = -448692534L;

    public static final QContactEntity contactEntity = new QContactEntity("contactEntity");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final StringPath id = _super.id;

    public final StringPath phone = createString("phone");

    public final StringPath tel1 = createString("tel1");

    public final StringPath tel2 = createString("tel2");

    public final StringPath tel3 = createString("tel3");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedDate = _super.updatedDate;

    public QContactEntity(String variable) {
        super(ContactEntity.class, forVariable(variable));
    }

    public QContactEntity(Path<? extends ContactEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QContactEntity(PathMetadata metadata) {
        super(ContactEntity.class, metadata);
    }

}

