


function EventHandler () {
    function handleClick() {
        alert('클릭되었습니다.');
    }

    return (
        // onClick = {()} -> () 소괄호를 넣어주면 새로고침할 때 바로 함수가 실행. 넣으면 안된다.
        <button onClick={handleClick}>클릭</button>

        //  만약 괄호 사용하고 싶다면 밑에 방식으로 사용.
        // <button onClick={() => {
        //     alert('클릭되었습니다.');
        // }}>클릭</button>
    )

}

export default EventHandler;