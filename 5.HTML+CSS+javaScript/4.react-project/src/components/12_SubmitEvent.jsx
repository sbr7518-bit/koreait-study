import { useState } from "react";

function SubmitEvent() {

    const [formData, setFormDate] = useState({});

    function handleSubmit (e) {
        e.preventDefault();

        setFormDate({
            name: e.target.name.value,
            email: e.target.email.value
        });

        console.log(formData);
    }

    return(

        <form onSubmit={handleSubmit}>
            <input type="text" name ="name" />
            <input type="text" name ="email" />
            <button type="submit">제출</button>
        </form>
    
    )
}

export default SubmitEvent;