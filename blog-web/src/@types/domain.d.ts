import EntityStatus from '../constants/status';
import { Link, ItemLink } from '../@types/external';

interface BaseType {
  id: string;
  status?: EntityStatus;
  createDate?: Date;
  updateDate?: Date;
}

// 유저정보
export interface UserType extends BaseType {
  username: string;
  password: string;
  nickname: string;
  registrationDate: Date;
  pauseReason: string;
  pauseDate: Date;
}

// 게시판
export interface BoardType extends BaseType {
  order: number;
  status: EntityStatus;
  userInfoNo: string;
}

// 게시글
export interface ArticleType extends BaseType {
  id: string;
  writer: string;
  subject: string;
  content: string;
  issueDate: string;
  boardInfoNo: string;
  img?: string;
  links?: ItemLink;
}

// 이미지 파일 정보
export interface FileType extends BaseType {
  name: string;
  path: string;
}

// 파일 매핑용 중간 테이블
export interface FileMappingType extends BaseType {
  ownerInfoNo: string;
  fileInfoNo: string;
}
