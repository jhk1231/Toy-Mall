import React from 'react';
import axios, { AxiosResponse } from 'axios';
import { ApiResponseType } from '../@types/external';
import { GetArticleRequestDto, GetArticleResponseDto } from '../@types/message';

class Client {
  private client = axios.create({
    baseURL: process.env.REACT_APP_API_HOST,
  });

  public constructor() {}

  // public get = (url: string, params: string): Promise<ApiResponseType> => {
  // public get = (): Promise<ApiResponseType<GetArticleResponseDto> => {

  //   return this.client.get<ApiResponseType<GetArticleResponseDto>('article')
  //   .then((response) => {
  //     let result:ApiResponseType<GetArticleResponseDto> = response.data;
  //   });
  // };

  async get<P, R>(url: string, params: P): Promise<ApiResponseType<R>> {
    const result = await this.getRequest<P, R>(url, params);
    const responseDto: ApiResponseType<R> = result.data;
    return responseDto;
  }

  getRequest<P, R>(
    url: string,
    params: P,
  ): Promise<AxiosResponse<ApiResponseType<R>>> {
    return this.client.get(url, { params });
  }
}

export default new Client();
