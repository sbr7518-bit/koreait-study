import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import { QueryClientProvider } from '@tanstack/react-query'
import { QueryConfig } from './config/QueryConfig.js'

import {createBrowserRouter, RouterProvider} from "react-router-dom"
import './index.css'
import App from './App.jsx'
import NewVariable from './components/01_NewVariable.jsx'
import RouterTest from './papes/02_RouterTest.jsx'
import Query from './papes/03_Query.jsx'
import Path from './papes/04_Path.jsx'
import Extension from './papes/05_Extension.jsx'
import Props from './papes/06_Props.jsx'
import Rendering from './papes/07_Rendering.jsx'
import ListRendering from './papes/08_ListRendering.jsx'
import EventHandler from './papes/09_EventHandler.jsx'
import ProfilePage from './papes/Training/Q1_ProfilePage.jsx'
import ButtonPage from './papes/Training/Q2_ButtonPage.jsx'
import LoginPage from './papes/Training/Q3_LoginPage.jsx'
import FruitPage from './papes/Training/Q4_FruitPage.jsx'
import EvenPage from './papes/Training/Q5_EvenPage.jsx'
import MenuPage from './papes/Training/Q6_MenuPage.jsx'
import MassagePage from './papes/Training/Q7_MassagePage.jsx'
import StudentPage from './papes/Training/Q8_StudentPage.jsx'
import ResultPage from './papes/Training/Q9_ResultPage.jsx'
import State from './papes/10_State.jsx'
import UseState from './papes/11_UseState.jsx'
import FormHandling from './papes/12_FormHandling.jsx'
import Lifting from './papes/13_Lifting.jsx'
import ThemeToggle from './papes/15_ThemeToggle.jsx'
import NameInput from './papes/16_NameInput.jsx'
import OtherPage from './papes/17_OtherPage.jsx'
import VisitCount from './papes/17_VisitCount.jsx'
import Toast from './papes/18_Toast.jsx'
import Gugudan from './papes/Training/Q10_Gugudan.jsx'
import Dropdown from './papes/19_Dropdown.jsx'
import NumberList from './papes/20_NumberList.jsx'
import GetUsers from './papes/21_GetUsers.jsx'
import GetUsers2 from './papes/22_GetUsers.jsx'


const router = createBrowserRouter([
  {
    path:"/01",  // URL
    element: <NewVariable /> // 해당 URL로 요청이 왔을 때 보여줄(렌더링 할) 함수
  },
  { 
    path:"/02",
    element: <RouterTest />
  },
  {
    path:"/03",
    element: <Query />
  },
  {
    path:"/04/:value",
    element: <Path />
  },
  {
    path:"/05",
    element: <Extension />
  },
  {
    path:"/06",
    element: <Props />
  },
  {
    path:"/07",
    element: <Rendering />
  },
  {
    path:"/08",
    element: <ListRendering />
  },
  {
    path:"/09",
    element: <EventHandler />
  },
  {
    path:"/Q1",
    element: <ProfilePage />
  },
  {
    path:"/Q2",
    element: <ButtonPage />
  },
  {
    path:"/Q3",
    element: <LoginPage />
  },
  {
    path:"/Q4",
    element: <FruitPage />
  },
  {
    path:"/Q5",
    element: <EvenPage />
  },
  {
    path:"/Q6",
    element: <MenuPage />
  },
  {
    path:"/Q7",
    element: <MassagePage />
  },
  {
    path:"/Q8",
    element: <StudentPage />
  },
  {
    path:"/Q9",
    element: <ResultPage />
  },
  {
    path:"/10",
    element: <State />
  },
  {
    path:"/11",
    element: <UseState />
  },
  {
    path:"/12",
    element: <FormHandling />
  },
  {
    path:"/13",
    element: <Lifting />
  },
  {
    path:"/15",
    element: <ThemeToggle />
  },
  {
    path:"/16",
    element: <NameInput />
  },
  {
    path:"/17",
    element: <VisitCount />
  },
  {
    path:"/17_Other",
    element: <OtherPage />
  },
  {
    path:"/18",
    element: <Toast />
  },
  {
    path:"/Q10",
    element: <Gugudan />
  },
  {
    path:"/19",
    element: <Dropdown />
  },
  {
    path:"/20",
    element: <NumberList />
  },
  {
    path:"/21",
    element: <GetUsers />
  },
  {
    path:"/22",
    element: <GetUsers2 />
  }   

])

createRoot(document.getElementById('root')).render(
  <StrictMode>

    <QueryClientProvider client={QueryConfig}>
      <RouterProvider router={router} />
    </QueryClientProvider>

  </StrictMode>,
)
