package kr.co.studyProject.member.service;

import kr.co.studyProject.member.dto.ReqLoginDTO;
import kr.co.studyProject.member.dto.ReqRegisterDTO;
import kr.co.studyProject.member.dto.ResLoginDTO;

public interface MemberService {

	void signup(ReqRegisterDTO request);

	ResLoginDTO login(ReqLoginDTO request);

}
