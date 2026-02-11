package kr.co.studyProject.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.studyProject.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

	boolean existsByEmail(String email);
	boolean existsByNickName(String nickName);
	
	Member findByEmail(String email);
	

}
