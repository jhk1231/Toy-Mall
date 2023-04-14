package com.store.api.module.repositories.member;

import com.store.api.module.domain.member.UserDetailInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailInfoRepository extends JpaRepository<UserDetailInfo, String> {
}
