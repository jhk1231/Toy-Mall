import { ArticleInfoModel } from '../../@types/message';
import { ArticleType } from '../../@types/domain';
import { EntityStatus } from 'constants/status';

const FETCH_DATA_REQUEST = 'FETCH_DATA_REQUEST';
const FETCH_DATA_SUCCESS = 'FETCH_DATA_SUCCESS';
const FETCH_DATA_FAILURE = 'FETCH_DATA_FAILURE';

// 액션 생성자 함수 정의
export const fetchDataRequest = () => ({
  type: FETCH_DATA_REQUEST,
});

export const fetchDataSuccess = (data: ArticleInfoModel) => ({
  type: FETCH_DATA_SUCCESS,
  payload: data,
});

export const fetchDataFailure = (error: unknown) => ({
  type: FETCH_DATA_FAILURE,
  payload: error,
});

// type ArticleAction = ReturnType<typeof addArticle>;

type ArticleState = {
  articleInfo: ArticleInfoModel;
};

const initialState: ArticleState = {
  articleInfo: {
    id: '',
    writer: '',
    subject: '',
    content: '',
    issueDate: '',
    boardInfoNo: '',
    status: EntityStatus.ACTIVE,
  },
};

//리듀서 작성
const detailArticleReducer = (state = initialState, action: any) => {
  switch (action.type) {
    case FETCH_DATA_REQUEST:
      return {
        ...state,
      };
    case FETCH_DATA_SUCCESS:
      return {
        ...state,
        articleInfo: action.payload,
      };
    case FETCH_DATA_FAILURE:
      return {
        ...state,
      };
    default:
      return state;
  }
};

export default detailArticleReducer;
