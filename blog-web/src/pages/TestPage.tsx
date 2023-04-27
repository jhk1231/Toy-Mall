import { GetArticleRequestDto, GetArticleResponseDto } from '../@types/message';
import service from '../service/ApiAxiosService';

const Test = () => {
  const requestDto: GetArticleRequestDto = {
    boardInfoNo: '2dv7cdqle24242ab89e45869ba5f6q33',
  };

  const response = service.getArticleList(requestDto);
  console.log('hello');
  console.log('test.response', response);
  return <></>;
};

export default Test;
