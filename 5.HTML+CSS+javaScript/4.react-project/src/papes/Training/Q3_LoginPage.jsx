import LoginStatus from "../../components/Training/Q3_LoginStatus";

function LoginPage () {

    const isLogin = true;
    
    return (
        <>
        <LoginStatus isLogin ={isLogin}/>
        </>
    );

}

export default LoginPage;