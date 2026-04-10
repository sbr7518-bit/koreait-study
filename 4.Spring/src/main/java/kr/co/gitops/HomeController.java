package kr.co.gitops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//
@RestController
public class HomeController {
		
	@GetMapping("/")
	public String home() {
		return "버전 1.0 - cicd 테스트 입니다.";
	}
}
