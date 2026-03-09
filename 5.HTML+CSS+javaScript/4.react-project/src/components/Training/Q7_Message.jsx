import { useState } from "react";

function Massage () {

    const[text, setText] = useState("안녕하세요.");

    function handleCilck() {
        setText("반갑습니다.");
    }

    return (
        <button onClick={handleCilck}>{text}</button>
    )

}

export default Massage;