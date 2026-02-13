package kr.co.studyProject.board.service.impl;

import kr.co.studyProject.board.dto.ReqBoardDTO;
import kr.co.studyProject.board.entity.Board;
import kr.co.studyProject.board.repository.BoardRepository;
import kr.co.studyProject.board.service.BoardService;
import kr.co.studyProject.member.entity.Member;
import kr.co.studyProject.member.repository.MemberRepository;

public class FreeServiceImpl implements BoardService {
	private final BoardRepository boardRepository;
	private final MemberRepository memberRepository;

	@Override
	public void write(ReqBoardDTO request, Long writeremil) {
		
		Member write = memberRepository.findById(writeremil).orElse(null);
		
		if(write == null) {
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

}
