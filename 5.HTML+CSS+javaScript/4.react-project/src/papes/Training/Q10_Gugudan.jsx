import useGugudanStore from "../../store/Training/Q/Q10_GugudanStore";


function Gugudan() {
    const { a,
            b,
            answer,
            result,
            setA,
            setB,
            setAnswer,
            checkAnswer,
            clear 
        } = useGugudanStore();

    return (
        <>
            <div>
                <label htmlFor=" number1">첫번째 수 (a): </label>
                <input type="number" id="number1" value={a} onChange={(e) => setA(e.target.value)}/>
            </div>
            <div>
                <label htmlFor=" number2">두번째 수 (b): </label>
                <input type="number" id="number2" value={b} onChange={(e) => setB(e.target.value)}/>
            </div>
            <p>
                {/* 문제 : a x b = ? 형식으로 보여야 함*/}
                {/* 문제 : {a} x {b} = ? */}
                문제 : {a || '_'} x {b || '_'} = ?
            </p>

            <input type="number" value={answer} onChange={(e) => setAnswer(e.target.value)}/>
            <button onClick={checkAnswer}>정답 확인</button>
            <button style={{marginLeft: '10px'}} onClick={clear}>초기화</button>

            {/* 
                사용자가 입력한 숫자가 정답일 경우 '정답 입니다!' 출력
                정답이 아닐 경우 '오답 입니다!' 출력
            */}
            <p style={{marginTop: '10px'}} > {result} </p>
        </>
    )
}

export default Gugudan; 