import { Link } from 'react-router-dom';
import SideBarItem from './SideBarItem';

interface MenuContent {
  menuName: string;
  childrens: Array<MenuContent>;
}

const SideBar = () => {
  const menu: [{ menuName: string; childrens: unknown }] = [
    {
      menuName: 'hi',
      childrens: [],
    },
    {
      menuName: 'hi2',
      childrens: [],
    },
  ];
  let depth = 0;

  return <div className="sidebar">{}</div>;
};

export default SideBar;
