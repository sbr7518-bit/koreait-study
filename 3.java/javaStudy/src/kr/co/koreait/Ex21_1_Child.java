package kr.co.koreait;

public class Ex21_1_Child extends Ex21_1_parent {
	
	Ex21_1_Child(){
		super();  //부모 생성자를 먼저 호출해서 실행시킨다.
		System.out.println("자식 생성자입니다.");
	}
	
	public void childinfo() {
		System.out.println("자식 클래스의 childinfo() 입니다.");
	}
	
//      상속 : 부모클래스에 있는 필드 값을 자식 클래스에 작성하지 않아도 메인클래스에 사용 가능하다 (자바에선 단일상속만 가능)
	

}
