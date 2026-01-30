package kr.co.koreait;

public class Ex14_Overloading {

	public static void main(String[] args) {

//		오버로딩 (Overloading)
//		 - 같은 메서드 이름을 사용하지만 매개변수의 타입(자료형)과 위치가 다른 방식	
		
//		객체 생성
//		 - 클래스명 변수명 = new 클래스명();
		Ex14_Overloading over = new Ex14_Overloading();
		
//		메서드 호출
//		 - 변수명.메서드명();
		over.introduce("신보라");		
		over.introduce("신보라", 20);
		
		Ex14_1_Calc cl = new Ex14_1_Calc();
		cl.add(20,10);
		cl.add(20,30,10);
				
	}

//	 	메서드 생성
	public void introduce(String name) {
		System.out.println("안녕하세요. 제 이름은 " + name + "입니다. ");
	}
	
//		오버로딩 (Overloading)  -> 매개변수 즉 타입이 서로 다름, 호출할 때 입력한 타입에 맞춰 호출한다.
	public void introduce(String name, int age) {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	  
	
	
}
