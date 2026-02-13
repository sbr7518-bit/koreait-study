package kr.co.studyProject.member.controller;

import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	// get => 가입화면 보여주기  (/member/register/form 템플릿: signup.html)
	@GetMapping("/register/form")
	public String registerform() {
		return "signup";
	}
	
	// post => 가입처리 (/member/signup (POST)	 템플릿 redirect:/member/login/form)
	@PostMapping("/signup")
	public String signup(ReqRegisterDTO request) {
		memberService.signup(request);
		return "redirect:/member/login/form";
	}
	
	@GetMapping("/login/form")
	public String loginform() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute ReqLoginDTO request,
						HttpSession session) {
		ResLoginDTO response = memberService.login(request);
		if(response == null) {
			return "redirect:/member/register/form";
		}
		
		session.setAttribute("LOGIN_USER", response);
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
	    session.invalidate();
	    return "redirect:/";
	}
	
	
	
	

}
