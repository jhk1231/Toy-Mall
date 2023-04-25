package com.blog.api.module.util;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.UUID;

public class UUIDGenerator implements IdentifierGenerator {


    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        return UUID.randomUUID().toString().replace("-", "");
    }


    public String getRandValue() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

}
