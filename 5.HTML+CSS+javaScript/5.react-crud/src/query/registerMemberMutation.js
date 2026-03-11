import { useMutation } from '@tanstack/react-query';
import { registerMemberApi } from '../api/memberApi';
import { useNavigate } from 'react-router-dom';

// useMutation : 데이터 변경을 수행 (POST, PUT, DELETE 등)
// useQuery : 데이터 조회를 수행 (GET)
export const registerMemberMutation = () => {
    const navigate = useNavigate();
    
    return useMutation({
        mutationFn: registerMemberApi,
        onSuccess: (data) => { //  요청성공 시 실행
            alert("회원가입이 완료되었습니다.")
            navigate('/login'); // navigator -> 로그인으로 요청해서 이동하게 해주는 라우터
        },
        onError: (error) => { // 실패 시 실행
            alert("회원가입 요청 중 오류가 발생했습니다.")
        }
    })
}          
