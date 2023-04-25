import React from 'react';
import logo from '../logo.svg';
import '../assets/css/style.css';
import Layout from 'components/Layout/Layout';
import AllRoutes from '../routes/AllRouter';
import SideBar from 'components/Layout/NavBar/SideBar';

function App() {
  return (
    <>
      <Layout>
        <SideBar />
        <div className="main-container">
          <AllRoutes />
        </div>
      </Layout>
    </>
  );
}

export default App;
