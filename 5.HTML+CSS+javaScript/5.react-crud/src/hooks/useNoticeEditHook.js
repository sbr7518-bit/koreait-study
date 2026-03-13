import { useEffect, useRef, useState } from "react";
import { useNoticeEditFormQuery } from "../query/noticeEditFormQuery"
import { useNoticeEditMutation } from "../query/NoticeEditMutation";


export const useNoticeEditHook = (postId) => {

  // API를 통해 수정용 데이터 조회
  const { data: boardDTO, isLoading, isError, error } = useNoticeEditFormQuery(postId);
  const editMutation = useNoticeEditMutation(postId);

  // 상태(State) 관리
  const [category, setCategory] = useState('');
  const [title, setTitle] = useState('');
  const [imagePreview, setImagePreview] = useState(null);
  const [selectedFiles, setSelectedFiles] = useState([]);
  const [editorReady, setEditorReady] = useState(false);
  const quillRef = useRef(null);
  const contentLoadedRef = useRef(false);
  const editorInitializedRef = useRef(false);


  // API 데이터가 로드되면 state 업데이트
  useEffect(() => {
    if (boardDTO) {
      setCategory(boardDTO.category || '공지');
      setTitle(boardDTO.title || '');
    }
  }, [boardDTO]);

  // Quill 에디터 초기화
  useEffect(() => {
    let timeoutId = null;
    let retryCount = 0;
    const maxRetries = 50; // 최대 5초 대기 (100ms * 50)

    const initEditor = () => {
      // Quill이 로드되지 않았으면 재시도
      if (typeof window === 'undefined' || !window.Quill) {
        if (retryCount < maxRetries) {
          retryCount++;
          timeoutId = setTimeout(initEditor, 100);
        } else {
          console.error('[NoticeEdit] Quill을 로드할 수 없습니다.');
        }
        return;
      }

      const editorElement = document.getElementById('noticeEditor');
      if (!editorElement) {
        // DOM 요소가 아직 준비되지 않았으면 재시도
        if (retryCount < maxRetries) {
          retryCount++;
          timeoutId = setTimeout(initEditor, 100);
        }
        return;
      }

      // 이미 초기화되었으면 스킵
      if (editorInitializedRef.current || quillRef.current) {
        return;
      }

      try {
        const quill = new window.Quill('#noticeEditor', {
          theme: 'snow',
          placeholder: '공지사항 내용을 입력하세요',
          modules: {
            toolbar: [
              [{ 'header': [1, 2, 3, false] }],
              ['bold', 'italic', 'underline', 'strike'],
              ['blockquote', 'code-block'],
              [{ 'list': 'ordered' }, { 'list': 'bullet' }],
              ['link', 'image'],
              ['clean']
            ]
          }
        });

        quillRef.current = quill;
        editorInitializedRef.current = true;
        setEditorReady(true); // state 업데이트로 리렌더링 트리거

        // 에디터가 편집 가능한지 확인
        quill.enable(true);

        console.log('[NoticeEdit] Quill 에디터 초기화 완료');
      } catch (err) {
        console.error('[NoticeEdit] Quill 에디터 초기화 실패:', err);
      }
    };

    initEditor();

    // cleanup 함수
    return () => {
      if (timeoutId) {
        clearTimeout(timeoutId);
      }
    };
  }, []); // 컴포넌트 마운트 시 한 번만 실행

  // API 데이터가 로드되고 에디터가 초기화되면 내용 로드
  useEffect(() => {
    if (editorReady && quillRef.current && boardDTO && boardDTO.content && !contentLoadedRef.current) {
      try {
        const content = boardDTO.content || '';
        if (content.trim()) {
          quillRef.current.clipboard.dangerouslyPasteHTML(content);
          contentLoadedRef.current = true;
          console.log('[NoticeEdit] 게시글 내용을 에디터에 로드 완료');
        }
      } catch (err) {
        console.error('[NoticeEdit] 내용 로드 실패:', err);
      }
    }
  }, [boardDTO, editorReady]); // boardDTO와 에디터 초기화 상태가 준비되면 실행

  const handleImageChange = (e) => {
    const files = Array.from(e.target.files);
    setSelectedFiles(files);

    // 미리보기용 첫 번째 파일만 표시
    if (files.length > 0) {
      const reader = new FileReader();
      reader.onload = (event) => {
        setImagePreview(event.target.result);
      };
      reader.readAsDataURL(files[0]);
    } else {
      setImagePreview(null);
    }
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    // 1. 유효성 검사 
    if (!title.trim()) {
      alert('제목을 입력해주세요.');
      return;
    }

    if (!quillRef.current) {
      alert('에디터가 준비되지 않았습니다.');
      return;
    }

    // 에디터에서 내용 가져오기
    const content = quillRef.current.root.innerHTML;
    if (!content.trim() || content === '<p><br></p>') {
      alert('내용을 입력해주세요.');
      return;
    }

    // FormData 생성 (파일 업로드를 위해)
    const formData = new FormData();

    // BoardDTO.EditRequest 필드 추가
    formData.append('id', postId); // 서버의 ReqBoardDTO.id와 매핑
    formData.append('title', title);
    formData.append('content', content);
    formData.append('category', category);

    // 파일 추가 (여러 파일 가능)
    selectedFiles.forEach((file) => {
      formData.append('files', file);
    });

    editMutation.mutate(formData);
  };

  return {
    boardDTO, 
    isLoading, 
    isError, 
    error,
    category, 
    setCategory,
    title, 
    setTitle,
    imagePreview, 
    handleImageChange,
    selectedFiles,
    handleSubmit,
    isSubmitting: editMutation.isPending,
  };


}