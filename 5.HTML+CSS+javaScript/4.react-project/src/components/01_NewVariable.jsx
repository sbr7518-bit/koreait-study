function PrintWorld() {
  return(
    <p>Hello World!</p>
  )

}
// return 안에는 여러 태그가 들어가 있으면 안되고 무조건 1개의 태그만 허용. 
// ex. section <- 하나의 태그 안에 작성할 것.

function NewVariable() {
  
  return (   
    <section>
    <h1>hi</h1>
    <h2>Hello</h2>
    <PrintWorld />
    </section>
  )

}

export default NewVariable
