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
                  <span>{item.writer}</span>
                  <span>{item.issueDate}</span>
                </div>
                <div>
                  <p>{item.content}</p>
                </div>
                <div>
                  <button className="root_btn bg_black">
                    {item.links && (
                      <Link className="root_a" to={item.id}>
                        더 보기
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
