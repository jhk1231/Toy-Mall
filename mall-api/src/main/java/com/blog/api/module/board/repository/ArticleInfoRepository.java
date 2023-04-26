package com.blog.api.module.board.repository;

import com.blog.api.module.board.domain.ArticleInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleInfoRepository extends JpaRepository<ArticleInfo, String> {
}
