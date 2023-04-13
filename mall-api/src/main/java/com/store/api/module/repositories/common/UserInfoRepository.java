package com.store.api.module.repositories.common;

import com.store.api.module.domain.member.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, String> {
}
