import axiosInstance from "./axiosInstance"

export const noticeListApi = async (page = 1) => {
    const response = await axiosInstance.get("/api/board/notice", {
        params: {
            page: page
        },
        withCredentials: true
    })
    return response.data;
}


// 공지사항 상세보기 조회
export const noticeDetailApi = async (postId) => {
    try{
        const response = await axiosInstance.get(`/api/board/notice/${postId}`, {
            withCredentials: true
        })
        return response.data;
    } catch(err) {
        
        // response가 있다는 것 자체를 기준
        // 서버가 응답을 했는데 상태 코드가 4xx, 5xx
        if(err.response) {
            console.error('응답데이터 : ', err.response.data);
            throw err;
        } else if(err.request) {
            // 요청은 보냈는데 서버가 응답을 하지 않았을 때
            console.log('서버에 연결할 수 없습니다.')
            throw err;
        } else {
            // 요청 중 에러 발생했을 때
            console.log('요청 중 에러 발생 : ', err.message);
            throw err;
        }
    }
}

export const noticeDeleteApi = async (postId) => {
        const response = await axiosInstance.delete(`/api/board/notice/${postId}`, {
            withCredentials: true
        })

        return response.data;
}






