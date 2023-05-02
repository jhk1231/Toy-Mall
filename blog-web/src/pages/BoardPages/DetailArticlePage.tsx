import { useEffect } from 'react';
import { useSelector, useDispatch } from 'react-redux';
import { useParams } from 'react-router-dom';
import { getArticleOneInfo } from '../../service/ApiAxiosService';
import { ArticleInfoModel } from '../../@types/message';
import { ApiError } from 'essential/error/ApiError';
import DetailArticle from '../../components/Board/DetailArticle';
import type { RootState } from '../../store/rootReducer';
import { EntityStatus } from 'constants/status';
import { fetchDataSuccess } from 'store/slices/detailArticleReducer';

const DetailPage = () => {
  const parmas = useParams();

  const defaultInfo: ArticleInfoModel | unknown = null;

  const dispatch = useDispatch();
  const state = useSelector(
    (state: RootState) =>
      state.detailArticleReducer ?? { articleInfo: defaultInfo },
  );

  const articleInfoNo: string = parmas.id as string;
  console.log('articleInfoNo', articleInfoNo);

  useEffect(() => {
    const articleInfo = async () => {
      try {
        const response: ArticleInfoModel = await getArticleOneInfo(
          articleInfoNo,
        );
        console.log('detail.response', response);
        dispatch(fetchDataSuccess(response));
      } catch (error: unknown) {
        if (error instanceof ApiError) {
          console.log(
            'Error 발생 [Code:' +
              error.name +
              '][message:' +
              error.message +
              ']',
          );
        }
      }
    };
    articleInfo();
  }, []);

  return <DetailArticle item={state.articleInfo} />;
};

export default DetailPage;
