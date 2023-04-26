package com.blog.api.module.member.repositoires;

import com.blog.api.module.member.domain.UserInfo;
import org.apache.catalina.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

    @Cacheable("users")
    @Override
    <S extends UserInfo> List<S> findAll(Example<S> example);

    Optional<UserInfo> findByUserId(@Param("userId") String userId);
}
