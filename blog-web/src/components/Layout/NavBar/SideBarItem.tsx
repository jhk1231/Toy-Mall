import React from 'react';
const SideBarItem = ({ item, depth = 0 }) => {
  return (
    <div>
      <div style={{ paddingLeft: depth * 20 }}>{item.menuName}</div>
      <div>
        {item.childrens.map((child) => (
          <SideBarItem item={child} depth={depth + 1} />
        ))}
      </div>
    </div>
  );
};

export default SideBarItem;
