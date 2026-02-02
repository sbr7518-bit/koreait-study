package kr.co.koreait;

import kr.co.training.Ex20_1_person;

public class Ex20_getterSetter {

	public static void main(String[] args) {

		
		Ex20_1_person kim = new Ex20_1_person();  //2번작성
		kim.setAge(-5); // setAge (대입타입 void o): 필드에 직접 값을 넣는다.
		kim.setName("짱구");
		kim.setAddr("인천");
		kim.setIsStudent(true);
		
		System.out.println(kim.getAge());  // getAge(반환타입 void X) : 불러오는 거기 때문에 sop 해주어야 실행됨.
		System.out.println(kim.getName());
		System.out.println(kim.getAddr());
		System.out.println(kim.getStudent());
		
		
		
		
		
		
	}

}
