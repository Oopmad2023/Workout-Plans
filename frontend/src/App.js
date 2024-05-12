import React from 'react';
import { Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import './App.css';
import WorkoutPlanList from './Pages/WorkoutPlanList';
import WorkoutPlansPage from './Pages/WorkoutPlansPage';

const App = () => {
  return (
    <Router>
      <Routes>
        <Route path="/api/workout-plan" element={<WorkoutPlansPage />} />
        <Route path="/workout-plan-list" element={<WorkoutPlanList />} />
      </Routes>
    </Router>
  );
};

export default App;
