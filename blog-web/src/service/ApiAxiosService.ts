import Client from './ApiAxiosClient';
import { ApiResponseType } from '../@types/external';
import { ApiError } from 'essential/error/ApiError';
import { GetArticleRequestDto, GetArticleResponseDto } from '../@types/message';

class ApiAxiosService {
  constructor() {}

  private checkApiResponse(response: ApiResponseType<any>) {
    if ('OK' != response.code) {
      throw new ApiError(response.code, response.message);
    }
    return null;
  }

  public async getArticleList(requestDto: GetArticleRequestDto) {
    const result = await Client.get<
      GetArticleRequestDto,
      GetArticleResponseDto
    >('article', requestDto);
    const responseDto: ApiResponseType<GetArticleResponseDto> = await result;
    this.checkApiResponse(responseDto);
    console.log('service.res', result);

    return responseDto;
  }
}

export default new ApiAxiosService();
