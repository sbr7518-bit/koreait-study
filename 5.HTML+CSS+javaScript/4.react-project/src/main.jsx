import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import { QueryClientProvider } from '@tanstack/react-query'
import { QueryConfig } from './config/QueryConfig.js'

import './index.css'
import App from './App.jsx'
import NewVariable from './components/01_NewVariable.jsx'
import RouterTest from './pages/02_RouterTest.jsx'
import Query from './pages/03_Query.jsx'
import Path from './pages/04_Path.jsx'
import Extension from './pages/05_Extension.jsx'
import Props from './pages/06_Props.jsx'
import Rendering from './pages/07_Rendering.jsx'

import {createBrowserRouter, RouterProvider} from "react-router-dom"
import ListRendering from './pages/08_ListRendering.jsx'
import EventHandler from './pages/09_EventHandler.jsx'
import State from './pages/10_State.jsx'
import UseState from './pages/11_ObjectState.jsx'
import FormHandling from './pages/12_FormHandling.jsx'
import Lifting from './pages/13_Lifting.jsx'
import Counter from './pages/14_Counter.jsx'
import ThemeToggle from './pages/15_ThemeToggle.jsx'
import NameInput from './pages/16_NameInput.jsx'
import VisitCount from './pages/17_VisitCount.jsx'
import OtherPage from './pages/17_OtherPage.jsx'
import Toast from './pages/18_Toast.jsx'
import Gugudan from './pages/training/Q10_Gugudan.jsx'
import Dropdown from './pages/19_Dropdown.jsx'
import NumberList from './pages/20_NumberList.jsx'
import GetUsers from './pages/21_GetUsers.jsx'
import GetUsers2 from './pages/22_GetUsers.jsx'

const router = createBrowserRouter([
  {
    path: "/01", // URL
    element: <NewVariable /> // 해당 URL로 요청이 왓을 때 보여줄(렌더링 할) 함수
  },
  {
    path: "/02",
    element: <RouterTest />
  },
  {
    path: "/03",
    element: <Query />
  },
  {
    path: "/04/:value",
    element: <Path />
  },
  {
    path: "/05",
    element: <Extension />
  },
  {
    path: "/06",
    element: <Props />
  },
  {
    path: "/07",
    element: <Rendering />
  },
  {
    path: "/08",
    element: <ListRendering />
  },
  {
    path: "/09",
    element: <EventHandler />
  },
  {
    path: "/10",
    element: <State />
  },
  {
    path: "/11",
    element: <UseState />
  },
  {
    path: "/12",
    element: <FormHandling />
  },
  {
    path: "/13",
    element: <Lifting />
  },
  {
    path: "/14",
    element: <Counter />
  },
  {
    path: "/15",
    element: <ThemeToggle />
  },
  {
    path: "/16",
    element: <NameInput />
  },
  {
    path: "/17",
    element: <VisitCount />
  },
  {
    path: "/17_Other",
    element: <OtherPage />
  },
  {
    path: "/18",
    element: <Toast />
  },
  {
    path: "/Q10",
    element: <Gugudan />
  },
  {
    path: "/19",
    element: <Dropdown />
  },
  {
    path: "/20",
    element: <NumberList />
  },
  {
    path: "/21",
    element: <GetUsers />
  },
  {
    path: "/22",
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







