import useToastStore from "../store/18_useToastStore";


function Toast() {
    const { message, showMessage, clearMessage }= useToastStore();

    return(
        <>
            <button onClick={() => showMessage('알림이 도착했습니다!')}>알림 띄우기</button>
            
            {/* && 값이 있을때 아래에 있는 값을 렌더링 하겠다. , || 값이 없을 때 아래에 있는 값을 렌더링 하겠다. */}
            {message &&  
                <div style={{marginTop: '10px', padding: '8px', backgroundColor: '#ffeaa7'}}>
                        {message}
                        <button onClick={clearMessage}>닫기</button>
                </div>
            }
        </>   
    )
} 

export default Toast;