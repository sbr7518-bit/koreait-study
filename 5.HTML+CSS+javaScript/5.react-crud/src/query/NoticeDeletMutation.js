import { useMutation } from "@tanstack/react-query"
import { noticeDeleteApi } from "../api/boardApi"


export const useNoticeDeleteMutation = () => {

  return useMutation({
    mutationFn: noticeDeleteApi
  })
}