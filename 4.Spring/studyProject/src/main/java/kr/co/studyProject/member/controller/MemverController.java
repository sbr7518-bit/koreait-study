package kr.co.studyProject.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemverController {
	
	@GetMapping("register/form")
	public String regosterForm() {
		return "pages/memeber/register";
	}

	
	
	

}
