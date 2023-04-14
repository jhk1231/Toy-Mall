package com.store.api.module.member.repositoires;

import com.store.api.module.member.domain.UserDetailInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailInfoRepository extends JpaRepository<UserDetailInfo, String> {
}
