export type ApiResponseType = {
  code: string;
  message: string;
  data: any;
};

export interface GetArticleRequestDto {
  boardInfoNo: string;
  issueDate?: Date;
}
