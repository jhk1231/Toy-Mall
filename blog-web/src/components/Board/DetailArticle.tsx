import { ArticleInfoModel } from '../../@types/message';
import { Link, NavLink, useNavigate } from 'react-router-dom';
import { ArticleType } from '../../@types/domain';

interface DetailArticleProps {
  item: ArticleInfoModel;
}

const DetailArticle = ({ item }: DetailArticleProps) => {
  console.log('detail.item', item);
  return (
    <div className="detail_ariticle_container">
      <div className="article_head">
        <div className="subject_box">
          <h3>{item.subject}</h3>
        </div>
        <div className="article_tool_box">
          <div className="article_writer">
            <span className="writer">{item.writer}</span>
            <span>{item.issueDate}</span>
          </div>
          <div className="article_btn_box">
            <button className="root_btn bg_black">수정</button>
            <button className="root_btn bg_black">작성</button>
          </div>
        </div>
      </div>
      <div className="article_body">
        <div dangerouslySetInnerHTML={{ __html: item.content }}></div>
      </div>
    </div>
  );
};

export default DetailArticle;
