import React from 'react';
import axios, { AxiosResponse } from 'axios';
import { ApiResponseType } from '../@types/external';
import { GetArticleRequestDto, GetArticleResponseDto } from '../@types/message';

const client = axios.create({
  baseURL: process.env.REACT_APP_API_HOST,
});

export const Get = async <P, R>(
  url: string,
  params: P,
): Promise<ApiResponseType<R>> => {
  const response = await client.get(url, { params });
  console.log('clinet.response', response.data);
  return response.data;
};
