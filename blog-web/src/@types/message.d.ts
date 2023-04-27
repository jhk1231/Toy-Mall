import { Link } from './external';

// Req/Res
export interface GetArticleRequestDto {
  boardInfoNo: string;
}

export interface GetArticleResponseDto {
  links: Array<Link>;
  articleInfoNo: string;
  boardInfoNo: string;
  subject: string;
  content: string;
  issueDate: string;
  status: string;
}
