import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import NewVariable from './components/01_NewVariable.jsx'
import RouterTest from './papes/02_RouterTest.jsx'
import Query from './papes/03_Query.jsx'
import Path from './papes/04_Path.jsx'
import Extension from './papes/05_Extension.jsx'
import Props from './papes/06_Props.jsx'
import Rendering from './papes/07_Rendering.jsx'

import {createBrowserRouter, RouterProvider} from "react-router-dom"

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
  }
])

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <RouterProvider router={router} />
  </StrictMode>,
)
