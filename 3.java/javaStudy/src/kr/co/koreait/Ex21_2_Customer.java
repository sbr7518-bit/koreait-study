package kr.co.koreait;

public class Ex21_2_Customer extends Ex21_2_Person {
	int memberId;
	
	Ex21_2_Customer(String name, int age, int memberId) {
		super(name,age);  // 부모 클래스 필드에 있는 값은 'super'로 지정. (부모 기본생성자 없을시)
		this.memberId = memberId;  // 자식 클래스 필드에 있는 값은 자기객체 지정.
		
	}
	
	void enter(){
		System.out.printf("회원 번호 : %d, %s(%d세)님이 입장하셨습니다.", memberId ,name,age);
	}
	
	
	

}
