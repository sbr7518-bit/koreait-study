package kr.co.koreait;

// 하나의 소스파일(.java)에서 여러개의 클래스를 작성할 때 주의점
//	1. 하나의 소스파일은 1개의 'public class'만을 가져야 함. (2개 이상 불가)
//	2. 'public class'가 없는 경우에는 소스 파일의 이름과 클래스 이름 중 둘 중에 하나라도 일치하면 됨. 
//	 > 'public class'가 있는 경우에는 무조건 소스 파일의 이름과 클래스 이름이 일치해야 함. 

public class Ex17_Class {

	public static void main(String[] args) {

//		클래스(Class)
//		 - 개발자가 특정 프로그램을 만들기 위한 설계도(틀)
//		 - ex) 계산기 클래서, 회원 클래스 등
		
//		접근 제어자
//		 - public : 전체 패키지에서 접근 가능
//		 - (default) : 같은 패키지에서만 접근 가능
		
//		클래스명 규칙
//		 - 대소문자를 구분한다. (한글도 표기 가능)
//		 - 파스칼 표기법을 사용한다.
//		  > UserName, Board 등 (앞글자가 대문자)
			
	}	
}

//  'public class'는 한 파일에 무조건 하나만 작성. 두 개의 'public'은 허용 안함. 파일 한개당 보낼 수 있는 파일은 하나이기 때문
class tset { 

}