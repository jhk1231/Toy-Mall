package com.blog.api.module.board.repository;

import com.blog.api.module.board.domain.ArticleInfo;
import com.blog.api.module.board.dto.ArticleInfoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ArticleInfoRepository extends JpaRepository<ArticleInfo, String> {

}
