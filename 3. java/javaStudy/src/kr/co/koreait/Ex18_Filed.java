package kr.co.koreait;

public class Ex18_Filed {

//		필드 
		int num = 10; // 인스턴스 변수
	
	public static void main(String[] args) {

		//필드 (=멤버 변수)
		// - 클래스 레벨의 변수를 의미 ({} -> 범위 안에 들어가 있으면 그 안에서 언제든 사용 가능)
		int num = 7;
		
		Ex18_1_Car car = new Ex18_1_Car();
		car.wheel = 5;

		System.out.println(car.speed);
		System.out.println(car.wheel);

		Ex18_1_Car sonata = new Ex18_1_Car();
		sonata.wheel = 7;
		sonata.speed = 140;

		System.out.println(sonata.speed);
		System.out.println(sonata.wheel);
		
		System.out.println("================================");
		
//		객체를 생성해서 "minsu" 와 "jjangu"의 이름, 나이, 주소, 핸드폰을 출력하기 
		
//		Ex18_2_person minsu = new Ex18_2_person();
//		
//		minsu.name = "김민수";
//		minsu.age = 19;
//		minsu.addr = "인천";
//		minsu.phone = "010-1111-1111";
//		minsu.intorudce();
//		
		Ex18_2_person jjangu = new Ex18_2_person("신짱구", 5, "떡잎마을", "없음");  // -> Ex18_2_person : 생성자를 호출하는 것이다.
		
//		jjangu.name = "신짱구";
//		jjangu.age = 5;
//		jjangu.addr = "떡잎마을";
//		jjangu.phone = "없음";
		jjangu.intorudce();
				
		System.out.println(Ex18_2_person.HOBBY);
//		Ex18_2_person.intorudce();
		
		Ex18_2_person min  = new Ex18_2_person("신짱구", 5);
		min.intorudce();		
		

	
		
		
		
	}
	

}
