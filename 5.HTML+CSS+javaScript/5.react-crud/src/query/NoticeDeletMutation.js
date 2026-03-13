import { useMutation, useQueryClient } from "@tanstack/react-query"
import { noticeDeleteApi } from "../api/boardApi"
import { useNavigate } from "react-router-dom"


export const useNoticeDeleteMutation = () => {
  const queryClient = useQueryClient();
  const navigate = useNavigate();

  return useMutation({
    mutationFn: (postId) => noticeDeleteApi (postId),
    onSuccess: () => {
      // 리스트 캐시 무효화
     queryClient.invalidateQueries({
        queryKey:['noticeList']
     }) 
      navigate('/notice/list')
    }
  })
}