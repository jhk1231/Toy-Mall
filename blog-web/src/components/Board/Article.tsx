import { Link, NavLink, useNavigate } from 'react-router-dom';
import { ArticleType } from '../../@types/domain';

interface ArticleProps {
  items: ArticleType[];
}

const Article = ({ items }: ArticleProps) => {
  return (
    <div>
      {items.map((item: ArticleType) => {
        return (
          <>
            <div className="table__container">
              <div className="img__container">
                <img
                  className="table__img"
                  src={require(process.env.REACT_APP_IMG_PATH +
                    (item.img || 'default.png'))}
                ></img>
              </div>
              <div className="table__content">
                <h3>{item.subject}</h3>
                <div>
                  <span>{item.boardInfoNo}</span>
                  <span>{item.issueDate}</span>
                </div>
                <div>
                  <p>{item.content}</p>
                </div>
                <div>
                  <button>
                    {item.links && (
                      // <Link key={item.links.rel} to={item.links.href}>
                      <Link
                        key={item.links.rel}
                        to={{
                          pathname: '/study/detail',
                          state: ,
                        }}
                      >
                        더 읽기
                      </Link>
                    )}
                  </button>
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

export default Article;
