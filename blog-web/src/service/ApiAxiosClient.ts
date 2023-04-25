import React from 'react';
import axios from 'axios';
import { ApiResponseType } from '../@types/external';

class Client {
  private client = axios.create({
    baseURL: process.env.REACT_APP_API_HOST,
  });

  public constructor() {}

  public get = (url: string, params: string): Promise<ApiResponseType> => {
    return this.client.get(url).then((response) => {
      let transformedResponse: ApiResponseType = {
        code: response.data.code,
        message: response.data.message,
        data: response.data.data,
      };
      return transformedResponse;
    });
  };
}

export default new Client();
