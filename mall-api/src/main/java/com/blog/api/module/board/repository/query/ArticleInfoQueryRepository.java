package com.blog.api.module.board.repository.query;

import com.blog.api.module.board.domain.QArticleInfo;
import com.blog.api.module.board.domain.QBoardInfo;
import com.blog.api.module.board.dto.ArticleInfoDto;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.blog.api.module.board.domain.QArticleInfo.articleInfo;
import static com.blog.api.module.board.domain.QBoardInfo.boardInfo;

@Repository
@RequiredArgsConstructor
public class ArticleInfoQueryRepository {

    private final JPAQueryFactory jpaQueryFactory;


    public Page<ArticleInfoDto> findInfos(String boardInfoNo, Pageable pageable) {
        QArticleInfo ai = articleInfo;
        QBoardInfo bi = boardInfo;

        final List<ArticleInfoDto> content =
                jpaQueryFactory.select(Projections.fields(ArticleInfoDto.class,
                                ai.id.as("articleInfoNo"),
                                ai.writer.as("writer"),
                                ai.subject.as("subject"),
                                ai.content.as("content"),
                                ai.issueDate.as("issueDate"),
                                ai.status.as("status"),
                                ai.boardInfo.id.as("boardInfoNo")
                        ))
                        .from(ai)
                        .join(ai.boardInfo, bi)
                        .on(
                                ai.boardInfo.id.eq(boardInfoNo)
                        )
                        .limit(pageable.getPageSize())
                        .offset(pageable.getOffset())
                        .orderBy(ai.issueDate.desc())
                        .fetch();

        final JPAQuery<Long> countQuery =
                jpaQueryFactory.select(
                                ai.count().as("totalCount")
                        )
                        .from(ai)
                        .join(ai.boardInfo, bi)
                        .on(
                                ai.boardInfo.id.eq(boardInfoNo)
                        )
                        .limit(pageable.getPageSize())
                        .offset(pageable.getOffset())
                        .orderBy(ai.issueDate.desc());

        return PageableExecutionUtils.getPage(content, pageable, countQuery::fetchOne);
    }
}
