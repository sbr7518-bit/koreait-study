package kr.co.koreait;

import java.util.Scanner;

public class Ex13_2_Person {

	
//	이름, 나이 입력받고 "안녕하세요. 제 이름은 000, 나이는 00살 입니다." 출력
		
	
	public void introduce(String name, int age) {
		System.out.println("안녕하세요. 제 이름은 " + name + ", 나이는 " + age + "살 입니다.");

	}	

/*
 *  sayAge() 메서드 생성
 * 	   - 매개변수로 나이를 받은 후
 *     - 나이를 반환
 *     -   "00살 입니다.
 */
			
	public String sayAge(int age) {
		return age + "살 입니다.";
	}

	
	
	
	
	
}
