import { Link } from 'react-router-dom';

const SideBar = () => {
  const menu: Array<IMenu> = [
    {
      name: 'hi',
      childrens: [],
    },
    {
      name: 'hi2',
      childrens: [],
    },
  ];
  let depth = 0;

  return (
    <div className="rightcolumn">
      <div className="card">
        <h3>study</h3>
      </div>
    </div>
  );
};

export default SideBar;
