package kr.co.restStudy.member.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 로그인 응답 서비스에 데이터를 돌려보내는 엔티티 DTO
 *  DTO (Data Transfer Object)
 *		→ 계층 간 데이터 전달용 객체
 */

@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor
public class ResLoginDTO {
	private Long id;
	private String userId;
	private String userName;
	private String email;
	
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
}
