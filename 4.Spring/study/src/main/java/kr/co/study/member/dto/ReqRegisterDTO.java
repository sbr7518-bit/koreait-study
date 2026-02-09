package kr.co.study.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 회원가입 요청을 받는 DTO입니다.
 * 회원가입에 필요한 정보(id, name, password, ...)를 받습니다.
 */

@Getter // get 생성 (입력, 대입)
@Setter // set 생성 (변경,수정)  -> 최대한 지향 하는게 좋다. 특정 값에 Set넣을 수 있음
@NoArgsConstructor  // 기본 생성자
@AllArgsConstructor  // 모든 필드가 다 있는 생성자
@ToString // 모든 필드에 있는 값을 문자열 형태로 반환  (개발단계에서만 사용. 개발 완료시 빼야함)
@Data // (웬만하면 안쓰는 거 추천) get+set+ToString+ ... 이것저것 다 합쳐진 녀석.
public class ReqRegisterDTO {
//	홈페이지 안에 있는 값 이름들과 필드에 있는 값 이름이 일치해야 한다.
	private String userName;
	private String userId;
	
//	@Setter  -> 입력시 이메일만 set 으로 사용 가능
	private String email;
	private String password;
	private String passwordCheck;
	
}







