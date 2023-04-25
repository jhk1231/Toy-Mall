import React from 'react';
import axios from 'axios';
import { TableListType } from '../../@types/table';

type ApiResponseType2 = {
  code: string;
  message: string;
  data: any;
};

let url: string = process.env.REACT_APP_API_HOST + 'test/sample';

// export function getItems() {
//   axios
//     .get(url)
//     .then((res) => {
//       console.log(res);
//       let result: Array<TableListType> = res.data.data;
//       return result;
//     })
//     .catch((error) => {
//       console.log(error);
//       return null;
//     })
//     .then(() => {
//       console.log('always run');
//     });
// }

export const getItems = async <T = ApiResponseType2>(): Promise<T> => {
  const { data } = await axios.get<T>(url);
  return data;
};
