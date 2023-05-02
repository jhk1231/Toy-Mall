export interface ApiResponseType<T> {
  code: string;
  message: string;
  data: T;
}

export interface PagedApiResponseType<T> {
  code: string;
  message: string;
  data: EmbeddedData<T>;
}

interface EmbeddedData<T> {
  _embedded: Data<T>;
}

interface Data<T> {
  links: Array<Link>;
  content: Array<T>;
  page: PageModel;
}

export interface Link {
  first: Href;
  self: Href;
  next: Href;
  last: Href;
}

export interface ItemLink {
  self: Href;
}

interface Href {
  href: string;
}

interface PageModel {
  size: number;
  totalElements: number;
  totalPages: number;
  number: number;
}
