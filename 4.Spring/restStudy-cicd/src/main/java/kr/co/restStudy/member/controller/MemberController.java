package kr.co.restStudy.member.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpSession;
import kr.co.restStudy.member.dto.ReqLoginDTO;
import kr.co.restStudy.member.dto.ReqRegisterDTO;
import kr.co.restStudy.member.dto.ResLoginDTO;
import kr.co.restStudy.member.service.MemberService;
import lombok.RequiredArgsConstructor;

@Controller	  // Controller : 컨트롤러임을 선언하는 어노테이션
@RequestMapping("/api/member") // RequestMapping() : URL 매핑(GET+POST)
@RequiredArgsConstructor   // final 키워드가 붙은 필드에 대한 생성자를 만듬(생성자 주입방식)   -> 앞으로 사용하게 될 방식
@Tag(name="Member", description="회원 API")
public class MemberController {
	private final MemberService memberService;


	@PostMapping("/register")  
	@Operation(summary="회원 등록", description="신규 회원을 등록합니다.")
	public ResponseEntity<String> register(@RequestBody ReqRegisterDTO request) {
		memberService.register(request);
		
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}
	
	@PostMapping("/login")  
	@Operation(summary="로그인", description="사용자 로그인 기능을 담당합니다.")
	public ResponseEntity<String> login(@RequestBody ReqLoginDTO request,
						HttpSession session) {
		ResLoginDTO response = memberService.login(request);
		
		// 로그인 실패할 경우 회원가입 페이지로 이동
		if(response == null) {
			return new ResponseEntity<String>("조회 실패", HttpStatus.NOT_FOUND);
		}
		// 로그인이 성공할 경우
		session.setAttribute("LOGIN_USER", response);
		return new ResponseEntity<String>("OK", HttpStatus.OK); 
	}
	
	@GetMapping("/logout")
	@Operation(summary="로그아웃", description="사용자 로그아웃 기능을 담당합니다.")
	public ResponseEntity<String> logout(HttpSession session) {
		
		session.invalidate();	// 세션 무효화 : 세션에 들어가 있는 데이터를 모두 삭제한다.
		
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}
	
	@GetMapping("/check")
	@Operation(summary="로그인 확인", description="회원이 로그인 상태인지 확인합니다.")
	public ResponseEntity<ResLoginDTO> loginCheck(HttpSession session) {
		ResLoginDTO loginUser = (ResLoginDTO) session.getAttribute("LOGIN_USER");
		
		if(loginUser == null) {
			return new ResponseEntity<ResLoginDTO>(loginUser, HttpStatus.UNAUTHORIZED);
		}
		
		return new ResponseEntity<ResLoginDTO>(loginUser, HttpStatus.OK); 
	}
	
	
	
	
	
	
	
	
	
	
}
