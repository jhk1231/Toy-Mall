export type ReactTableDataType = Record<string, unknown>;

export type TableProps = {
  columns: Column<ReactTableData>[];
  data: ReactTableData[];
};

export type TableListType = {
  subject: string;
  category: string;
  date: string;
  content: string;
  img: string;
  createAt: string;
  updateAt: string;
};
