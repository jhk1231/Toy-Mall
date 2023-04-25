import React from 'react';
import { Column } from 'react-table';
import Table from '../../components/Basic/Table';
import { ReactTableDataType, TableProps } from '../../@types/table';

const HomePage: React.FC = () => {
  const data = React.useMemo(
    () => [
      {
        col1: 'Hello',
        col2: 'World',
        col3: 'hh',
      },
      {
        col1: 'react-table',
        col2: 'rocks',
      },
      {
        col1: 'whatever',
        col2: 'you want',
        col3: 'hi',
      },
    ],
    [],
  );

  const columns = React.useMemo<Column<ReactTableDataType>[]>(
    () => [
      {
        Header: 'Column 1',
        accessor: 'col1',
      },
      {
        Header: 'Column 2',
        accessor: 'col2',
      },
      {
        Header: 'Col3',
        accessor: 'col3',
      },
    ],
    [],
  );

  return (
    <div>
      <h3>HomePage</h3>
      <Table columns={columns} data={data} />
    </div>
  );
};

export default HomePage;
