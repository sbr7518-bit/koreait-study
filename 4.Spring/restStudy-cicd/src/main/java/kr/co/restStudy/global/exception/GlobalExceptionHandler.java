package kr.co.restStudy.global.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import kr.co.restStudy.exception.MemberException;

@ControllerAdvice  // 모든 컨트롤러에서 발생하는 예외를 한 곳에서 처리하는 어노테이션(역할지정)
public class GlobalExceptionHandler {

	@ExceptionHandler(MemberException.class)
	public ResponseEntity<String> handleMember(MemberException me) {
		
		return new ResponseEntity<String>(me.getResult(),me.getStatus());
		
	}
	
	
}
