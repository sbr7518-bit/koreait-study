package kr.co.study.board.service.impl;

import java.util.ArrayList;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import kr.co.study.board.dto.ReqBoardDTO;
import kr.co.study.board.dto.ResBoardDTO;
import kr.co.study.board.entity.Board;
import kr.co.study.board.repository.BoardRepository;
import kr.co.study.board.service.BoardService;
import kr.co.study.member.entity.Member;
import kr.co.study.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NoticeServiceImpl implements BoardService {
		private final BoardRepository boardRepository;
		private final MemberRepository memberRepository;
		
		@Override
		public void write(ReqBoardDTO request, Long writerId) {
			// 1. 작성자 조회
			Member write = memberRepository.findById(writerId).orElse(null);
			// > .orElse : 결과가 없으면 null 로 처리하겠다.
			
			if(write == null) {
				System.out.println("유효하지 않은 사용자입니다.");
			}
			
			// 2. Board 엔티티 만들기
			Board board = new Board();
			board.setBoardType("NOTICE");
			board.setCategory(request.getCategory());
			board.setTitle(request.getTitle());
			board.setContent(request.getContent());
			board.setWriter(write);
			board.setViewCount(0);
			
			// 3. DB 저장
			boardRepository.save(board);
		}
	
		@Override
		public Page<ResBoardDTO> getBoardList(int page) {
			// 0. 페이징 처리 객체
			//  - 매개변수 : 'page'번째 요청, 한 페이지에 3개씩, 'id'기준 내림차순(desc)
			Pageable pageable = PageRequest.of(page, 3, Sort.by("id").descending());

			// 1. 공지사항 게시글 전체 조회
			Page<Board> boardList = boardRepository.findByBoardTypeOrderByIdDesc("NOTICE", pageable);
			
			// 2. 엔티티 타입을 Response DTO 타입으로 변경
			List<ResBoardDTO> list = new ArrayList<>();
			
			// 리스트 목록 
			for(Board b : boardList) {
				ResBoardDTO response = ResBoardDTO.builder()  // 새로운 객체를 계속 생성해줘야 중복이 안됨
										.id(b.getId())
										.category(b.getCategory())
										.title(b.getTitle())
										.content(b.getContent())
										.writerName(b.getWriter().getUserName())
										.createdAt(b.getCreatedAt())
										.build();
				list.add(response);
			}
			
			// 3. 응답 객체 
			//  - List<ResBoardDTO> 타입을 Page<ResBoardDTO> 타입으로 변환
			//  - 매개변수 : 원본 리스트, 페이징 정보(객체), 'db'에서 조회된 Page 객체의 요소 개수
			return new PageImpl<>(list, pageable, boardList.getTotalElements());
		}
		
		
		// 동작 순서
		//	1. 트랜잭션 시작
		//		- JPA의 영속성 컨텍스트 생성
		//		- 영속성 컨텍스트 : 엔티티의 변경을 감지하고 SQL을 저장하는 공간
		//	2. findById 호출
		//		- SELECT 실행
		//		- 영속성 컨텍스트에 1차 캐시에 저장 -> 스냅샷 저장소에 저장
		//	3. 나머지 메서드의 코드를 실행 (엔티티.setViewCount(5))
		//		- 1차 캐시에 변경된 값이 들어감
		//	4. JPA의 flush() 호출
		//		- 변경 감지 수행 (더티 체킹)
		//		- 변경된 값이 있으면 SQL 쿼리문 생성 후 실행
		//	5. 최종적으로 종료되며 트랜잭션 commit 수행
		@Override
		@Transactional
		public ResBoardDTO getBoardDetail(Long id){
			
			// 1. 게시글 조회
			Board board = boardRepository.findById(id).orElse(null);
			
			// 2. 조회수 증가 
			// 	- JPA 더티체킹으로 인해 update 자동 반영
			board.setViewCount(board.getViewCount()+1);
			
			// 3. 응답 DTO 변환  (Set 간편하게 사용하는 방법 : bulid 패턴으로 사용 / DTO에 Setter가 없기 때문에 값 수정은 불가)
			ResBoardDTO response = ResBoardDTO.builder()
									.id(board.getId())
									.title(board.getTitle())
									.content(board.getContent())
									.writerName(board.getWriter().getUserName())
									.createdAt(board.getCreatedAt())
									.viewCount(board.getViewCount())
									.build();
			return response;
		}
		
		@Override
		@Transactional
		public ResBoardDTO getBoardDetailEdit(Long id){
			
			Board board = boardRepository.findById(id).orElse(null);
			
			// 3. 응답 DTO 
			ResBoardDTO response = ResBoardDTO.builder()
									.id(board.getId())
									.title(board.getTitle())
									.content(board.getContent())
									.writerName(board.getWriter().getUserName())
									.createdAt(board.getCreatedAt())
									.viewCount(board.getViewCount())
									.build();
			return response;
		}
		
		@Override
		@Transactional
		public void edit(ReqBoardDTO request, Long id) {
			
			// 1. 기존 게시글이 존재하는지 조회
			Board board = boardRepository.findById(request.getId()).orElse(null);
			
			// 조회할 엔티티가 널이 아니고 조회한 아이디가 getWriter().getId() 비교 했을시 같지 않을 때 실행.
			if(board != null && !board.getWriter().getId().equals(id)) {
				System.out.println("게시글이 없거나 작성자가 아닙니다.");
			}
			
			// 2. 게시글 수정 반영
			board.setCategory(request.getCategory());
			board.setTitle(request.getTitle());
			board.setContent(request.getContent());
			// => set을 통해 내용이 변경되면서 flush ()호출 더티체킹을 통해 1차캐시와 스냅샷을 비교하며 차이점을 찾아낸다.
			//    변경된 값이 있으면 SQL를 작성 → SQL 저장소에 UPDATE board SET category="이벤트", ... WHERE id(PK값)=? 을 작성.
			//	  SQL 실행 → 3360:(포트)에 쿼리를 날린다. 
			//	  commit()을 찍고 트랜잭션 종료.
		}
		
		@Override
		public void delete(Long id, Long loginUserId) {
			
			// 1. id로 게시글 조회
			Board board = boardRepository.findById(id).orElse(null);
			
			// 2. 해당하는 게시글이 존재하는지 확인 및 작성자 검증
			if(board != null) {
			   System.out.println("삭제할 수 없습니다.");
			} else if (!board.getWriter().getId().equals(loginUserId)) {
			   System.out.println("삭제 권한이 없습니다.");
			}
			
			// 3. 삭제 처리
			boardRepository.delete(board);
			
			
		}
		
}






