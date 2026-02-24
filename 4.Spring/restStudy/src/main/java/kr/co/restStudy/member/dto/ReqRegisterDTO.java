package kr.co.restStudy.member.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 회원가입 요청을 받는 DTO입니다.
 * 회원가입에 필요한 정보(id, name, password, ...)를 받습니다.
 */

@Getter // get 생성 (입력,대입) 
@Setter // set 생성 (변경,수정)  -> 최대한 지향 하는게 좋다. 특정 값에 Set넣을 수 있음
@NoArgsConstructor  // 기본 생성자
@AllArgsConstructor  // 모든 필드가 다 있는 생성자
@Schema(description="회원가입 요청 DTO")
public class ReqRegisterDTO {

	@Schema(description="유저 이름", example="홍길동")
	private String userName;
	
	@Schema(description="유저 아이디", example="test")
	private String userId;
	
	@Schema(description="유저 이메일", example="test@naver.com")
	private String email;
	
	@Schema(description="비밀번호", example="qwer1234!")
	private String password;
	
	@Schema(description="비밀번호 확인", example="qwer1234!")
	private String passwordCheck;
	
}







