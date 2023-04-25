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

  return <div className="sidebar">{}</div>;
};

export default SideBar;
