package kr.co.studyProject.board.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import kr.co.studyProject.board.dto.ReqBoardDTO;
import kr.co.studyProject.board.entity.Board;

public interface BoardService {
	
	void write(ReqBoardDTO request, Long writerId);

	Page<Board> getFreePage(Pageable pageable);
	
	Board getById(Long id);
}
