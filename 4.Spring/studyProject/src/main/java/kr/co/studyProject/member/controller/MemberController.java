package kr.co.studyProject.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import kr.co.studyProject.member.dto.ReqLoginDTO;
import kr.co.studyProject.member.dto.ReqRegisterDTO;
import kr.co.studyProject.member.dto.ResLoginDTO;
import kr.co.studyProject.member.service.MemberService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
	
	private final MemberService memberService;
	
	
	@GetMapping("/register/form")
	public String registerForm() {
		return "signup";
	}
	
	@PostMapping("/register")
	public String register(ReqRegisterDTO request) {
		memberService.register(request);
		return "redirect:/member/login/form";
	}
	
	@GetMapping("/login/form")
	public String loginform() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(ReqLoginDTO request,
						HttpSession session) {
		ResLoginDTO response = memberService.login(request);
		if(response == null) {
			return "redirect:/member/register/form";
		}
		
		session.setAttribute("LOGIN_USER", response);
		return "redirect:/";
	}
	
	
	

}
