package kr.co.studyProject.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.studyProject.board.service.BoardService;
import lombok.RequiredArgsConstructor;

// 게시판 컨트롤러
@Controller
@RequestMapping("/board/free")
@RequiredArgsConstructor
public class FreeController {
	private final BoardService boardService;
	
	@GetMapping
	public String freeList(@RequestParam)
	
	
	
}
