package kr.co.koreait;

public class Ex25_2_Greeting {
	
//	지역 내부 클래스 (메서드 안에 클래스를 생성한 것)
	public void sayHello() {
		class LocalInnerCalss { // <- 지역 내부 클래스
			public void porint() {
				System.out.println("메서드 안에서만 사용가능한 클래스!");
			}
		}
		
		LocalInnerCalss local = new LocalInnerCalss(); // 객체 생성을 해주어야 메모리에 올라감으로써 사용가능해짐.
		local.porint();
		
	}

}
