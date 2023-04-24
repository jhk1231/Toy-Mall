import { Routes, Route } from 'react-router-dom';
import HomePage from '../pages/HomePages/HomePage';
import StudyPage from '../pages/StudyPage';
import LoginPage from 'pages/AuthPages/LoginPage';
import JoinPage from 'pages/AuthPages/JoinPage';

// childern배열에 있는 path에 '/'을 추가하면 안된다.
const AllRoutes = () => {
  return (
    <Routes>
      <Route path="/" element={<HomePage />}></Route>
      <Route path="/login" element={<LoginPage />}></Route>
      <Route path="/join" element={<JoinPage />}></Route>
      <Route path="/study" element={<StudyPage />}></Route>
    </Routes>
  );
};

export default AllRoutes;
