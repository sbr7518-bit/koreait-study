//package kr.co.restStudy;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.tags.Tag;
//
//@RestController   // @Controller + @ResponseBody
//@RequestMapping("/api")
//@Tag(name="Member", description="회원 API")
//public class MemberController {
//	
//	
//	@GetMapping("/{id}")
//	@Operation(summary="회원 찾기", description="회원을 조회합니다.")
//	public ResponseEntity<Member> findMember(@PathVariable("id") Long id) {
//		// 서비스 호출(id)
//		
//		Member m = new Member();
//		m.setId(id);
//		m.setName("홍길동");
//		m.setAddr("인천");
//		
//		return new ResponseEntity<Member> (m, HttpStatus.OK);
//	}
//	
//	
//	@PostMapping()
//	@Operation(summary="회원 응답 DTO", description="회원을 등록합니다.")
//	public ResponseEntity<String> register(ReqMemberDTO request){
//		System.out.println(request.getEmail());
//		
//		return new ResponseEntity<String> ("회원가입 성공", HttpStatus.OK);
//	}
//	
//	
//
//}
