import { useMutation, useQueryClient } from "@tanstack/react-query"
import { noticeEditApi } from "../api/boardApi"
import { useNavigate } from "react-router-dom";

export const useNoticeEditMutation = (postId) => {
  const queryClient = useQueryClient();
  const navigate = useNavigate();

  return useMutation({
    mutationFn:(formData) => noticeEditApi(postId,formData),
    onSuccess: () => {
      queryClient.invalidateQueries({
        queryKey:['noticeList']        
      });
      queryClient.invalidateQueries({
        queryKey: ['noticeDetail', postId] 
      });
      queryClient.invalidateQueries({ 
        queryKey: ['noticeEdit', postId] 
      });

      alert('게시글 내용이 수정되었습니다.')
      navigate(`/notice/list`);
    },
    onError: (error) => {
      alert('게시글 수정이 실패했습니다.')
    }
  });
};