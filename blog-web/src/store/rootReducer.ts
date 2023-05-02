import { combineReducers } from '@reduxjs/toolkit';
import articleReducer from './slices/articleReducer';
import detailArticleReducer from './slices/detailArticleReducer';

const reducer = combineReducers({
  articleReducer,
  detailArticleReducer,
});

export type RootState = ReturnType<typeof reducer>;
export default reducer;
