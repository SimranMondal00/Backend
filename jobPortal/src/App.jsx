import React from 'react';
import SearchIcon from '@mui/icons-material/Search';
import './App.css';
import AllPosts from './component/AllPosts';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Create from './component/Create';
import Navbar from './component/Navbar';
import Edit from './component/Edit';

function App() {
  return (
  <>
   <Navbar/>
   <BrowserRouter>
   <Routes>
   <Route path='/' element={<AllPosts/>}/>
   <Route path="/create" element={<Create />} />
   <Route path="/edit" element={<Edit />} />
   </Routes>
   </BrowserRouter> 
  </>
  );
}

export default App;