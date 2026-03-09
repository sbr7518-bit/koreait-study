
function Child({numbers}) {
    console.log(numbers)

    // 1. 변수에 넣고 출력
    // const doubleNumbers = numbers.map(number => number*2);

    return(
        <>
            <p>Child 입니다.</p>
            {/* <p>{doubleNumbers}</p> */}
            {/* 앞으로 사용하게 될 기본 구성 */}
            <ul>
                {/* {} 가 있을 경우엔 return을 작성해줘야 한다 */}
                {/* map에서는 'key(식별자 역할)'라는 속성을 권고함 */}
                {/* { numbers.map((number, index) => {
                    return <li key={index}>{number}</li>
                })} */}

                {/* 3보다 큰 요소만 렌더링 (.filter) */}
                {numbers
                    .filter(number => number > 3)
                    .map((number, index) => {
                        return <li key={index}>{number}</li>
                    })
                }
            </ul>
        </>
    )
}

export default Child;