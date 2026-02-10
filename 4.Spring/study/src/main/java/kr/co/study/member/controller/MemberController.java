package kr.co.study.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import kr.co.study.member.dto.ReqLoginDTO;
import kr.co.study.member.dto.ReqRegisterDTO;
import kr.co.study.member.dto.ResLoginDTO;
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
//	private final = 상수로 만들어주기 

	/**
	 * 회원가입 페이지로 이동할 때 사용되는 메서드 입니다
	 * localhost:8080/member/register/form  (GET 요청이 오면 실행됩니다)
	 * 최상위 리렉토리 'templates'를 바라보고 있다. -> 여기서부터 시작, 그래서 'pages'를 입력한 것
	 * @return 
	 */
	
//	회원가입 화면 요청
	@GetMapping("/register/form") // GetMapping : GET = 요청만 받음. URL표시되기 때문에 중요한 정보는 쓰면 안된다. 
	public String registerForm() {  
		return "pages/member/register";
	}

	/**
	 * 회원가입 요청을 처리할 때 사용되는 메서드 입니다.
	 * localhost:8080/member/register로 POST 요청이 오면 처리합니다.
	 * 
	 * 요청 데이터의 이름(userName, userId, ...)과 ReqRegisterDTO의 변수명이 일치해야 합니다.
	 * @param request 회원가입 요청 데이터를 담은 DTO
	 * @return /src/resources/templates/pages/member/login.html
	 */
	
	@PostMapping("/register")  // PostMapping(로직담당) : 
//									> 중요한 정보들을 네트워크 패킷 안(body)에 숨겨져 URL에 표시되지 않은 상태로 사용
	public String register(ReqRegisterDTO request) {
		memberService.register(request);
		// redirect: 앞에 붙이면 해당 경로를 Spring 에게 다시 요청
		//		- 쉽게는 컨트롤러가 컨트롤러를 다시 호출할 때 주로 사용 (자기자신을 다시 부를때)
		return "redirect:/member/login/form";
	}
	
//	로그인 화면 요청
	@GetMapping("/login/form")
	public String loginForm() {
		return "pages/member/login";
	}
	
	/**
	 * 로그인 요청을 처리하는 메서드 입니다.
	 * @param request 사용자가 입력한 로그인 정보
	 * @return
	 */
	@PostMapping("/login")  
	public String login(ReqLoginDTO request,
						HttpSession session) {
		ResLoginDTO response = memberService.login(request);
		
		// 로그인 실패할 경우 회원가입 페이지로 이동
		if(response == null) {
			return "redirect:/member/register/form";
		}
		// 로그인이 성공할 경우
		session.setAttribute("LOGIN_USER", response);
		return "redirect:/"; // 메인 페이지로 이동
	}
	/**
	 *  로그아웃을 처리하는 메서드입니다.
	 *  세션을 무효화한 후 메인 페이지로 이동
	 * @param session 현재 사용자의 세션
	 * @return /로 리다이렉트 (메인 페이지)
	 */
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();	// 세션 무효화 : 세션에 들어가 있는 데이터를 모두 삭제한다.
		
		return "redirect:/";
	}
	
	
	
	
	
	
	
	
	
	
	
}
