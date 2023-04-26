package com.blog.api.module.board.repository;

import com.blog.api.module.board.domain.BoardInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardInfoRepository extends JpaRepository<BoardInfo, String> {
}
