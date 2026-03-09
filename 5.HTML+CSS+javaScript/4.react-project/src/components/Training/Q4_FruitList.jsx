

function FruitList ({nameList}) {

    return (
            <ul> { nameList.map((fruit,index) =>{
                return <li key={index}>{fruit}</li>
            })}
            </ul>
    )
}

export default FruitList;