package com.store.api.module.repositories.common;

import com.store.api.module.domain.member.UserInfo;
import org.hibernate.annotations.Cache;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

    @Cacheable("users")
    @Override
    <S extends UserInfo> List<S> findAll(Example<S> example);
}
