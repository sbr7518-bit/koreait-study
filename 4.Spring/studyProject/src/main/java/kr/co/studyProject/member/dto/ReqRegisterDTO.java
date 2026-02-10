package kr.co.studyProject.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class ReqRegisterDTO {
	private String userName;
	private String userId;
	private String email;
	private String password;
	private String passwordCheck;
}
