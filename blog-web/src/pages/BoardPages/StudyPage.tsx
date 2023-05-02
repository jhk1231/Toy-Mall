import React, { useEffect } from 'react';
import { useSelector, useDispatch } from 'react-redux';
import { TableListType } from '../../@types/table';
import { ApiError } from 'essential/error/ApiError';
import type { RootState } from '../../store/rootReducer';
import {
  GetArticleRequestDto,
  GetArticleResponseDto,
} from '../../@types/message';
import { getArticleList } from 'service/ApiAxiosService';
import { fetchDataSuccess } from 'store/slices/articleReducer';
import { ArticleType } from '../../@types/domain';
import Article from 'components/Board/Article';

const StudyPage = () => {
  const dispatch = useDispatch();
  const state = useSelector(
    (state: RootState) => state.articleReducer ?? { articleList: [] },
  );

  const createArticleInfo = (
    responseDto: Array<GetArticleResponseDto>,
  ): Array<ArticleType> => {
    const infos: Array<ArticleType> = [];
    responseDto.forEach((dto) => {
      let info: ArticleType = {
        id: dto.articleInfoNo,
        writer: dto.writer,
        subject: dto.subject,
        content: dto.content,
        issueDate: dto.issueDate,
        boardInfoNo: dto.boardInfoNo,
        links: dto.links[0],
      };
      infos.push(info);
    });
    return infos;
  };

  useEffect(() => {
    const fetchBoardData = async () => {
      try {
        const requestDto: GetArticleRequestDto = {
          boardInfoNo: '2dv7cdqle24242ab89e45869ba5f6q33',
        };

        const response: Array<GetArticleResponseDto> = (
          await getArticleList(requestDto)
        ).content;

        console.log('fetchBoardData.response', response);
        const infos = createArticleInfo(response);
        console.log('infos', infos);
        dispatch(fetchDataSuccess(infos));
      } catch (error: unknown) {
        if (error instanceof ApiError) {
          console.log(
            'Error 발생 [Code:' +
              error.name +
              '][message:' +
              error.message +
              ']',
          );
        }
      }
    };

    fetchBoardData();
  }, []);

  return <Article items={state.articleList} />;
};

export default StudyPage;
