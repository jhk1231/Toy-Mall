import client from './ApiAxiosClient';
import { ApiResponseType } from '../@types/external';
import { ApiError } from 'essential/error/ApiError';

class ApiService {
  constructor() {}

  public getArticleList = async () => {
    const url = '/test/sample';

    let response = client
      .get(url, '')
      .then((res: ApiResponseType) => {
        if (!('OK' != res.code)) {
          throw new ApiError(res.code, res.message);
        }
        console.log(res);
      })
      .catch((error: any) => {
        if (error instanceof ApiError) {
          console.log('TODO: 뭘 처리할지 고민중..');
        }
        throw error;
      });
  };
}

export default new ApiService();
