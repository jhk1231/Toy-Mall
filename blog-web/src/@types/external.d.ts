export interface ApiResponseType<T> {
  code: string;
  message: string;
  data: Data<T>;
}

interface Data<T> {
  links: Array<Link>;
  content: Array<T>;
  page: PageModel;
}

export interface Link {
  rel: string;
  href: string;
}

interface PageModel {
  size: number;
  totalElements: number;
  totalPages: number;
  number: number;
}
