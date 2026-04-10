package kr.co.koreait;

public class Ex18_2_person {

//		필드 선언만
//	 	이름(name)
//	 	나이(age)
//	 	주소(addr)
//	 	핸드폰번호(phone)
	
//			객체 명
		String name;
		int age;
		String addr;
		String phone; 
		final static String HOBBY = "잠자기"; // static : 객체 생성, new 연산자 작성 없이 바로 출력 가능함
//		'static'가 붙으면 클래스 변수 , 안 붙으면 인스턴스 변수라고 부름
//  ------------------------------------------------------------------ 		
//		이름만 받는 생성자 (생성자 this)
//		 - 나머지 값을 this() 활용해서 초기화 진행
//		 - age : 0, addr : "인천", phone : "010-1234-1234"
//		 - 매개변수 4개를 받는 생성자를 호출하여 초기화 진행
		
		Ex18_2_person(String name) {
			this(name, 0, "인천","010-1234-1234");
			
// 			-> 생성자 this() : 같은 클래스의 다른 생성자를 호출. 
//			(무조건 첫줄에 작성 : 그 뒤에 오는 생성자들을 호출해야하기 때문)
		}
		
//	------------------------------------------------------------------	
//		 이름하고 나이만 받는 생성자
//		 - 주소랑 핸드폰 번호는 기본값을 지정해서 줌
	
		Ex18_2_person(String name, int age){
//			this.name = name;
//			this.age = age;
//			this.addr = "지구";
//			this.phone = "아직 없음";
			this(name, age, "지구", "아직 없음");  
		}
//							 -------- 매 개 변 수 명 ----------
//		  이름, 나이, 주소, 핸드폰을 작성할 때 불러옴.
		Ex18_2_person(String name, int age, String addr, String phone) {
			System.out.println("생성자가 호출되었습니다.");
			this.name = name; 
			this.age = age;
			this.addr = addr;
			this.phone = phone;
// 			this. : 객체 자기자신을 의미하기 때문에 'String name'의 값을 갖는다. -> 같은 변수명을 사용해도 겹치지 않음.
		}

//  ----------------------------------------------------------				
//		intorudce 메서드  => 호출하는 메서드
//		 - "이름 : 000"
//		 - "나이 : 000"
//		 - "주소 : 000"
//		 - "핸드폰 번호 : 000"
		
		public void intorudce()	{
			System.out.println("안녕");
			System.out.println("이름 : " + name);		
			System.out.println("나이 : " + age);	
			System.out.println("주소 : " + addr);	
			System.out.println("핸드폰번호 : " + phone);
		}


}
