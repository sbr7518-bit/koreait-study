package kr.co.studyProject.board.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.studyProject.board.dto.ReqBoardDTO;
import kr.co.studyProject.board.entity.Board;
import kr.co.studyProject.board.repository.BoardRepository;
import kr.co.studyProject.board.service.BoardService;
import kr.co.studyProject.member.entity.Member;
import kr.co.studyProject.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class FreeServiceImpl implements BoardService {
	private final BoardRepository boardRepository;
	private final MemberRepository memberRepository;

	@Override
	public void write(ReqBoardDTO request, Long writerid) {
		
//		Member write = memberRepository.findById(writerid)
//		  .orElseThrow(() -> new IllegalArgumentException("유효하지 않은 사용자입니다."));
		
		Member write = memberRepository.findById(writerid).orElse(null);
		if(write == null)	{
			System.out.println("유효하지 않은 사용자입니다.");
		}
		
		
		Board board = new Board();
		board.setBoardType("FREE");
		board.setCategory(request.getCategory());
		board.setTitle(request.getTitle());
		board.setContent(request.getContent());
		board.setWriter(write);
		board.setViewCount(0);
		
		boardRepository.save(board);
	}

	@Override
	public Page<Board> getFreePage(Pageable pageable) {
		return boardRepository.findByBoardTypeOrderByIdDesc("FREE", pageable);
	}

	@Override
	public Board getById(Long id) {
	    return boardRepository.findById(id)
	        .orElseThrow(() -> new IllegalArgumentException("게시글 없음: " + id));
	}
	
	
}
