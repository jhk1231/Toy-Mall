import { getItems } from './Board';
import { TableListType } from '../../@types/table';
import { ApiError } from 'essential/error/ApiError';
import apiService from '../../service/ApiAxiosService';

const DetailPage = () => {
  const data: Array<TableListType> = [
    {
      subject: '[스프링 부트/Spring Boot] 스프링 게시판 만들기',
      category: 'Spring',
      date: '20230425',
      content: '글 내용 미리보기1',
      img: 'test.png',
      createAt: '20230425',
      updateAt: '20230426',
    },
    {
      subject: '[스프링 부트/Spring Boot] JAVA 게시판 만들기',
      category: 'Spring',
      date: '20230426',
      content: '글 내용 미리보기2',
      img: 'a.png',
      createAt: '20230425',
      updateAt: '20230426',
    },
    {
      subject: '[스프링 부트/Spring Boot] Hello 게시판 만들기',
      category: 'Spring',
      date: '20230427',
      content: '글 내용 미리보기3',
      img: 'spring.png',
      createAt: '20230425',
      updateAt: '20230426',
    },
  ];

  console.log('1', apiService.getArticleList());

  return (
    <div>
      {data.map((item: TableListType) => {
        return (
          <>
            <div className="table__container">
              <div className="img__container">
                <img
                  className="table__img"
                  src={require(process.env.REACT_APP_IMG_PATH + item.img)}
                ></img>
              </div>
              <div className="table__content">
                <h3>{item.subject}</h3>
                <div>
                  <span>{item.category}</span>
                  <span>{item.date}</span>
                </div>
                <div>
                  <p>{item.content}</p>
                </div>
                <div>
                  <button>더 읽기</button>
                </div>
              </div>
            </div>
            <div style={{ clear: 'both' }}></div>
          </>
        );
      })}
    </div>
  );
};

export default DetailPage;
