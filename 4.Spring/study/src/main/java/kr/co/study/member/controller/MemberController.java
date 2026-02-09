package kr.co.study.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.study.member.dto.ReqRegisterDTO;
import kr.co.study.member.service.MemberService;
import lombok.RequiredArgsConstructor;

@Controller	  // Controller : 컨트롤러임을 선언하는 어노테이션
@RequestMapping("/member") // RequestMapping() : URL 매핑(GET+POST)
@RequiredArgsConstructor   // final 키워드가 붙은 필드에 대한 생성자를 만듬(생성자 주입방식)   -> 앞으로 사용하게 될 방식
public class MemberController {
	
	// 필드 주입 방식(권장 X) → 자동으로 생성  
    // @Autowired
    // private MemberService memberService;
	private final MemberService memberService;
	

	/**
	 * 회원가입 페이지로 이동할 때 사용되는 메서드 입니다
	 * localhost:8080/member/register/form  (GET 요청이 오면 실행됩니다)
	 * 최상위 리렉토리 'templates'를 바라보고 있다. -> 여기서부터 시작, 그래서 'pages'를 입력한 것
	 * @return 
	 */
	@GetMapping("/register/form") // GetMapping : GET 요청만 받음
	public String registerForm() {
		return "pages/member/register";
	}

	@PostMapping("/register")
	public String register(ReqRegisterDTO request) {
		memberService.register(request);
		return "pages/member/login";
	}
	
	
	
}
