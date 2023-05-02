import { Routes, Route } from 'react-router-dom';
import HomePage from '../pages/HomePages/HomePage';
import StudyPage from '../pages/BoardPages/StudyPage';
import LoginPage from 'pages/AuthPages/LoginPage';
import JoinPage from 'pages/AuthPages/JoinPage';
import TestPage from 'pages/TestPage';
import DetailArticlePage from '../pages/BoardPages/DetailArticlePage';

// childern배열에 있는 path에 '/'을 추가하면 안된다.
const AllRoutes = () => {
  return (
    <div className="leftcolumn">
      <div className="card">
        <Routes>
          <Route path="/" element={<HomePage />}></Route>
          <Route path="/login" element={<LoginPage />}></Route>
          <Route path="/join" element={<JoinPage />}></Route>
          <Route path="/study" element={<StudyPage />}></Route>
          <Route path="/study/:id" element={<DetailArticlePage />}></Route>
          <Route path="/test" element={<TestPage />}></Route>
        </Routes>
      </div>
    </div>
  );
};

export default AllRoutes;
