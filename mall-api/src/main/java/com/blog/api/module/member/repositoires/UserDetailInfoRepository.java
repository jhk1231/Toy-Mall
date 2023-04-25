package com.blog.api.module.member.repositoires;

import com.blog.api.module.member.domain.UserDetailInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailInfoRepository extends JpaRepository<UserDetailInfo, String> {
}
