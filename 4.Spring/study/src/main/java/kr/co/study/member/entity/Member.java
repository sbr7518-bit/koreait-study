package kr.co.study.member.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *  Member 엔티티 클래스
 *   - 회원 정보를 데이터베이스 테이블에 매핑하는 역할
 */

@Entity // JAP 엔티티로 선언
@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor
public class Member {
//	엔티티는 무조건 PK 지정해야 한다.
	@Id    // PK(Primary key) 지정
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	// > 기본 키 자동생성, id 값이 중복되지 않음 (자동생성 : auto_increment)
	
	private Long id;
	private String userId;
	private String userName;
	private String email;
	private String password;
	
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
//	 INSERT 되기 직전에 자동 실행되는 어노테이션  
	@PrePersist
	public void prePersist() {
		this.createdAt = LocalDateTime.now();  // 현재 시간을 자동실행.
	}
}







