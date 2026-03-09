import { useState } from "react";

function InputField () {

    const [name, setName] = useState('');
    const [email, setEmail] = useState('');
    
    function handleName(e) {
        setName(e.target.value)
        console.log(name);
    }

    function handleEmail(e) {
        setEmail(e.target.value);
        console.log(email);
    }

    return(
        <form action="">
            <input type="text" onChange={handleName} />
            <input type="text" onChange={handleEmail} />
        </form>
    )
}

export default InputField;