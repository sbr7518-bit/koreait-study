package kr.co.studyProject.member.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResLoginDTO {
	private Long id;
	private String userName;
	private String email;
	private String nickName;
	private String phoneNumber;
	
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
}
