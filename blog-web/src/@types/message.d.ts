import { ArticleType } from './domain';
import { ItemLink } from './external';
import { EntityStatus } from '../constants/status';

// Req/Res
export interface GetArticleRequestDto {
  boardInfoNo: string;
}

export interface GetArticleResponseDto {
  links: Array<ItemLink>;
  articleInfoNo: string;
  boardInfoNo: string;
  writer: string;
  subject: string;
  content: string;
  issueDate: string;
  status: string;
}

export interface getArticleOneInfoRequestDto {
  articleInfoNo: string;
}

export interface ArticleInfoModel extends ArticleType {
  status: EntityStatus;
}
