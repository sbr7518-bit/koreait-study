import './App.css'
import NewVariable from './components/01_NewVariable';


// return 안에는 여러 태그가 들어가 있으면 안되고 무조건 1개의 태그만 허용. 
// ex. section <- 하나의 태그 안에 작성할 것.
function App() {
  
  return (   
    <NewVariable />

  )

}

export default App
