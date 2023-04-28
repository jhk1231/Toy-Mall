import { ArticleType } from '../../@types/domain';

const FETCH_DATA_REQUEST = 'FETCH_DATA_REQUEST';
const FETCH_DATA_SUCCESS = 'FETCH_DATA_SUCCESS';
const FETCH_DATA_FAILURE = 'FETCH_DATA_FAILURE';

// 액션 생성자 함수 정의
export const fetchDataRequest = () => ({
  type: FETCH_DATA_REQUEST,
});

export const fetchDataSuccess = (data: any) => ({
  type: FETCH_DATA_SUCCESS,
  payload: data,
});

export const fetchDataFailure = (error: unknown) => ({
  type: FETCH_DATA_FAILURE,
  payload: error,
});

// type ArticleAction = ReturnType<typeof addArticle>;

type ArticleState = {
  articleList: Array<ArticleType>;
};

const initialState: ArticleState = {
  articleList: [],
};

//리듀서 작성
const articleReducer = (state = initialState, action: any) => {
  switch (action.type) {
    case FETCH_DATA_REQUEST:
      return {
        ...state,
      };
    case FETCH_DATA_SUCCESS:
      return {
        ...state,
        articleList: action.payload,
      };
    case FETCH_DATA_FAILURE:
      return {
        ...state,
      };
    default:
      return state;
  }
};

export default articleReducer;
