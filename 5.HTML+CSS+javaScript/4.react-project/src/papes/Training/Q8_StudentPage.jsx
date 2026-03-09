import StudentList from "../../components/Training/Q8_StudentList";


function StudentPage () {

    const students = [
        { name : "김학생", score: 90},
        { name : "이학생", score: 80}
    ];

    return (
        <>
            <p>학생 점수</p>
            <StudentList students = {students}/>
        </>
    );
}
export default StudentPage;