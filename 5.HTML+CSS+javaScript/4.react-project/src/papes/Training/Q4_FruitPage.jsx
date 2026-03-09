import FruitList from "../../components/Training/Q4_FruitList";


function FruitPage () {

    return (
        <>
            <p>과일 목록 입니다.</p>

            <FruitList nameList={["사과","바나나","포도"]} />
        </>
    )
}

export default FruitPage;