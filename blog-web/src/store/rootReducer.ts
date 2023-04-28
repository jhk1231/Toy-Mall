import { combineReducers } from '@reduxjs/toolkit';
import articleReducer from './slices/articleReducer';

const reducer = combineReducers({
  articleReducer,
});

export type RootState = ReturnType<typeof reducer>;
export default reducer;
