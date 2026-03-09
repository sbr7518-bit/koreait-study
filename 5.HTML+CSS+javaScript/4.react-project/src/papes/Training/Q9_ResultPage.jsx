import Result from "../../components/Training/Q9_Result";

function ResultPage () {

    const students = [
        { name : "홍길동", score: 66}
    ];

    return (
        <>
            <p>결과 확인</p>
            <Result students = {students}/>
        </>
    )
}

export default ResultPage;