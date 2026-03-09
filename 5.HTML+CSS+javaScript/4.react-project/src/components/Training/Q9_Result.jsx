
function Result ({students}) {
   
    // const student = students [0];

    // return (
        
    //         <h3>
    //             {student.name} - {student.score >= 60 ? "합격" : "불합격"}
    //         </h3>
    //     );

    return (
        <>
            {
                students.map((student, index) => {
                    return (<h3 key ={index}> {student.name} - 
                    {student.score >= 60 ? "합격" : "불합격"}
                    </h3>
                    );
                }) 
            }
        </>
    )

    }

export default Result;