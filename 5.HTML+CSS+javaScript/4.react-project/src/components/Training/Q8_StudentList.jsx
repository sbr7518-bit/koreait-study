
function StudentList ({students}) {

    return (
        <>
            { 
                students.map((student, index) => (
                    <p key={index}> 
                    {student.name} - {student.score} 점 
                    </p>
                ))
            }
        </>
    )
}

export default StudentList;