import { useLocation } from "react-router-dom";


export default function Query(){
    // URLSearchParams : URL 정보를 편하게 사용할 수 있게 해주는 객체
    // useLocation : 현재 URL 정보를 가져오는 리액트 라우터 훅
    const query = new URLSearchParams(useLocation().search);    
    const param1 = query.get("name");    
    const param2 = query.get("age");    
    const param3 = query.get("addr");    
    

    return (
        <div>
            <p>이름 : {param1} </p>
            <p>나이 : {param2} </p>
            <p>주소 : {param3} </p>
        </div>
    )
}