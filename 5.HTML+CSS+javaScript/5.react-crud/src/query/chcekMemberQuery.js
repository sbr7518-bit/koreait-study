import { useQuery } from "@tanstack/react-query"
import { checkMemberApi } from "../api/memberApi"


export const useCheckMemberQuery = () => {
    return useQuery({
        queryKey: ['checkMember'],
        queryFn: checkMemberApi,
        retry: false,  // 재시도 안함
        refetchOnWindowFocus: true,  // 다른 탭 갔다오면 재 확인
        staleTime: 0  // 항상 최신 상태를 확인 
                      // (요청이 온다 무조건 최신상태의 데이터를 가지고 오겠다)
    })
}