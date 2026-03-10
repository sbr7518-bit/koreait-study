import useDropdownStore from "../store/19_DropdownStore";

function Dropdown() {

    const {selectOption, setSelectOption} = useDropdownStore();
    
    return (
        <>
            <h2>드랍다운 선택</h2>
                <select name="" id="" onChange={(e) => setSelectOption(e.target.value)}>
                    <option value="">선택하세요</option>
                    <option value="apple">사과</option>
                    <option value="banana">바나나</option>
                    <option value="orange">오렌지</option>
                </select>

                <p>선택 된 값 : {setSelectOption} </p>

        </>
    )
}

export default Dropdown;