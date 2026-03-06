import Child from "../components/06_Child"   // 자식

export default function Props() {   // 부모
    // Porps
    //  - 컴포넌트끼리 서로 데이터를 전달하기 위한 방식
    //  - 부모에서 던져주는 이름(변수명)과 자식에서 받는 이름(변수명)이 동일해야 한다.
    return (
        <>
            <Child 
                // img는 객체를 전달
                img={{ src:'https://i.imgur.com/R6Pwu27.jpeg', alt:'고양이'}}
                
                // size는 값(500)을 전달
                size={500} />
        </>
    )
}