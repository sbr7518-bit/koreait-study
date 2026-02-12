package kr.co.studyProject.member.service.impl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.co.studyProject.member.dto.ReqLoginDTO;
import kr.co.studyProject.member.dto.ReqRegisterDTO;
import kr.co.studyProject.member.dto.ResLoginDTO;
import kr.co.studyProject.member.entity.Member;
import kr.co.studyProject.member.repository.MemberRepository;
import kr.co.studyProject.member.service.MemberService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

	private final MemberRepository memberRepository;
	private final BCryptPasswordEncoder passwordEncoder;

	
	
	@Override
	public void signup(ReqRegisterDTO request) {
		
		if(!request.getPassword().equals(request.getPasswordCheck())) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return;
		}
		
		if(memberRepository.existsByEmail(request.getEmail())) {
			System.out.println("이미 사용중인 이메일 입니다.");
			return;
		}
		
		if(memberRepository.existsByNickName(request.getNickName())) {
			System.out.println("이미 사용중인 닉네임 입니다.");
			return;
		}
		
		String encodedPassword = passwordEncoder.encode(request.getPassword());
		
		Member member = new Member();
		member.setUserName(request.getUserName());
		member.setEmail(request.getEmail());
		member.setNickName(request.getNickName());
		member.setPassword(encodedPassword);
		member.setPhoneNumber(request.getPhoneNumber());
		
		memberRepository.save(member);
		
	}
	
	@Override
	public ResLoginDTO login (ReqLoginDTO request) {
		Member member = memberRepository.findByEmail(request.getEmail());
		
		if(member == null) {
			return null;
		}
		
		if(!passwordEncoder.matches(request.getPassword(), member.getPassword())){
			return null;
		}
		
		ResLoginDTO response = new ResLoginDTO();
		response.setId(member.getId());
		response.setUserName(member.getUserName());
		response.setEmail(member.getEmail());
		response.setNickName(member.getNickName());
		response.setCreatedAt(member.getCreatedAt());
		response.setUpdatedAt(member.getUpdatedAt());
		
		return response;
	}
	

}
