
function Button () {
    // function handleClick() {
    //     alert('클릭되었습니다.');
    // }

    // 자바스크립트 방식
    const handleClick = () => {
        alert('클릭되었습니다.');
    }

    return (
        <button onClick={handleClick}>클릭하기</button>
    )

}

export default Button;