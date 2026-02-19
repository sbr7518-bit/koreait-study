package kr.co.studyProject.board.controller;

import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import kr.co.studyProject.board.dto.ReqBoardDTO;
import kr.co.studyProject.board.entity.Board;
import kr.co.studyProject.board.repository.BoardRepository;
import kr.co.studyProject.board.service.BoardService;
import kr.co.studyProject.member.dto.ResLoginDTO;
import lombok.RequiredArgsConstructor;

// 게시판 컨트롤러
@Controller
@RequestMapping("/board/free")
@RequiredArgsConstructor
public class FreeController {
	private final BoardService boardService;
	private final BoardRepository boardRepository;
	
	
	@GetMapping("")
	public String list(Model model,
						   @PageableDefault(size = 5) Pageable pageable)	{
		
		model.addAttribute("page", boardService.getFreePage(pageable));
		return "fragments/board/free";
	}
	
	@GetMapping("/write")
	public String writeForm(HttpSession session) {
		ResLoginDTO loginUser = (ResLoginDTO) session.getAttribute("LOGIN_USER");
		if (loginUser == null) return "redirect:/member/login/form";
		
		return "fragments/board/free-write";
	}
	
	@PostMapping("/write")
	public String write(@ModelAttribute ReqBoardDTO request,HttpSession session) {
		
		ResLoginDTO loginUser = (ResLoginDTO) session.getAttribute("LOGIN_USER");
		if (loginUser == null) 
			return "redirect:/member/login/form";
		
		boardService.write(request, loginUser.getId());
		return "redirect:/board/free";
	}
	
	
	@GetMapping("/{id}")
	public String view(@PathVariable("id") Long id, Model model) {

	    Optional<Board> boardOpt = boardRepository.findById(id);

	    if (boardOpt.isPresent()) {
	        model.addAttribute("board", boardOpt.get());
	    } else {
	        Board sample = new Board();
	        sample.setId(id);
	        sample.setTitle("샘플 게시글 " + id);
	        sample.setContent("DB 없이 보는 테스트 게시글입니다.");
	        sample.setViewCount(0);

	        model.addAttribute("board", sample);
	    }

	    return "fragments/board/free-view";
	}
	
	
	
}
