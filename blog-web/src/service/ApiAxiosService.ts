import { Get } from './ApiAxiosClient';
import { ApiResponseType } from '../@types/external';
import { ApiError } from 'essential/error/ApiError';
import { GetArticleRequestDto, GetArticleResponseDto } from '../@types/message';

const checkApiResponse = (response: ApiResponseType<any>) => {
  if ('OK' != response.code) {
    throw new ApiError(response.code, response.message);
  }
  return null;
};

export const getArticleList = async (requestDto: GetArticleRequestDto) => {
  const responseDto = await Get<GetArticleRequestDto, GetArticleResponseDto>(
    'article',
    requestDto,
  );
  console.log('getArticleList.res', responseDto);
  checkApiResponse(responseDto);

  return responseDto.data;
};
