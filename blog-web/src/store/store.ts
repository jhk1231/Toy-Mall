import { Action, configureStore } from '@reduxjs/toolkit';
import reducer, { ReducerType } from './rootReducer';

export const store = configureStore({
  reducer,
});

export type AppDispatch = typeof store.dispatch;
export default store;
