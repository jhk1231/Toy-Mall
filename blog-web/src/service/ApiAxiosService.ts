import { Get } from './ApiAxiosClient';
import { ApiResponseType, Data } from '../@types/external';
import { ApiError } from 'essential/error/ApiError';
import {
  ArticleInfoModel,
  GetArticleRequestDto,
  GetArticleResponseDto,
} from '../@types/message';

const checkApiResponse = (response: ApiResponseType<any>) => {
  if ('OK' != response.code) {
    throw new ApiError(response.code, response.message);
  }
  return null;
};

export const getArticleList = async (requestDto: GetArticleRequestDto) => {
  const responseDto = await Get<
    GetArticleRequestDto,
    Data<GetArticleResponseDto>
  >('article', requestDto);
  console.log('getArticleList.res', responseDto);
  checkApiResponse(responseDto);

  return responseDto.data;
};

export const getArticleOneInfo = async (articleInfoNo: string) => {
  const responseDto = await Get<null, ArticleInfoModel>(
    'article/' + articleInfoNo,
    null,
  );
  console.log('articleInfo', responseDto);

  return responseDto.data;
};
