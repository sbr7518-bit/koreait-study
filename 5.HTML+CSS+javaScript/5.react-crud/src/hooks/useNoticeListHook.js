
// Hook : 함수형 컴포넌트에서 React의 상태, 생명주기, 로직(useNoticeListHook)을 사용할 수 있는 API(함수)
//  - React Hook : 리액트에서 미리 만들어진 함수(Hook)
//      > ex) useState, useQuery, useMutation, ...
import { useNavigate } from "react-router-dom";
import { useMemo, useState } from "react";
import { useNoticeListQuery }  from "../query/NoticeListQuery"

//  - 커스텀 Hook : 개발자가 직접 만든 함수(Hook)
export const useNoticeListHook = () => {
    const navigate = useNavigate();
    const [ currentPage, setCurrentPage ] = useState(1);

    // 공지사항 리스트 조회
    const { data, isLoading, isError, error } = useNoticeListQuery(currentPage);
    
    // useMemo(): 계산 결과를 캐싱하여 불필요한 재계산 방지하는 리액트 훅
    //  - data의 값이 변경될 때만 연산을 수행
    //  - 변경되지 않는다면 캐싱된 이전 결과를 재사용
    const noticeList = useMemo(() => { // 게시글 리스트
        if (!data) return [];
        if (data.content && Array.isArray(data.content)) return data.content;
        return [];
    }, [data])

    const totalPages = useMemo(()=> {  // 전체 페이지 수
        if (!data) return 1;
        if (data.totalPages !== undefined) return data.totalPages;
        return 1;
    }, [data])

    // currentPage 상태에 값을 변경하는 함수
    //  - 페이지 버튼을 클릭했을 때 실행할 함수 (1~5)
    const handlePageChange =  (pageNum) => {
        if (pageNum >= 1 && pageNum <= totalPages) {
            setCurrentPage(pageNum);
        }
    }

    // 첫 페이지로 이동 (<<)
    const goToFirstPage = () => {
        handlePageChange(1);
    }

    // 이전 페이지로 이동 (<)
    const goToPrevPage = () => {
        if(currentPage > 1) {
            handlePageChange(currentPage - 1);
        }
    }

    // 마지막 페이지로 이동 (>>)
    const goToLastPage = () => {
        handlePageChange(totalPages);
    }

    // 다음 페이지로 이동 (>)
    const goToNextPage = () => {
        if(currentPage > totalPages) {
            handlePageChange(currentPage + 1);
        }
    }

    // 페이지 번호들이 들어간 배열 생성  
    const pageNumbers = useMemo(() => {
        // 숫자 계산하는 방식
        const pages = [];
        const pageGroup = Math.ceil(currentPage / 5);  // ceil => 소수점 올려주는 함수
        const startPage = (pageGroup - 1) * 5 + 1;
        const endPage = Math.min(pageGroup * 5, totalPages);

        // 상황 : currentPage(사용자가 요청한 페이지) = 3, totalPage(백엔드에서 사용한 페이지) = 12
        // 1. pageGroup = 1
        // 2. startPage = (1-1) * 5 = 0 , 0 + 1 = 1 
        // 3. endPage = currentPage : 5 와 totalPages : 12 => 둘 중에 작은 값(min)을 실행: 5   

        for(let i=startPage; i<=endPage; i++) {
            pages.push(i);
        }

        return pages;
    }, [currentPage, totalPages])

    const goToDetail = (postId) => {
        navigate(`/notice/detail/${postId}`);
    }

    return { noticeList,
            currentPage,
            totalPages,
            isLoading,
            isError,
            error,
            handlePageChange,
            goToFirstPage,
            goToPrevPage,
            goToLastPage,
            goToNextPage,
            pageNumbers,
            goToDetail }
}

