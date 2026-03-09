
function EvenList ({numberList}) {

    return(
        <>
            <ul>
                {numberList
                    .filter(num => num %2 === 0)
                    .map((num, index) => {
                        return <li key={index}>{num}</li>
                    })
                }
            </ul>
        </>
    )
}

export default EvenList;