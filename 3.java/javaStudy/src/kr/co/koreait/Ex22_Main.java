package kr.co.koreait;

import java.util.ArrayList;

public class Ex22_Main {

	public static void main(String[] args) {
		

		Ex22_1_Samsong ss = new Ex22_1_Samsong();
		
		ss.powerOn();
		ss.powerOff();
		
//		Ex22_1_Computer com = new Ex22_1_Computer();
//		
//		com.powerOn();
//		com.powerOff();
//	   부모 클래스도 메인에서 사용 가능. 단, 부모 클래스 안에 있는 메스더만 사용가능.	
		
		
		Ex22_2_Dog d1 = new Ex22_2_Dog();
		d1.makeSound();
		
//		ArrayList<> 사용하는 방법 (강아지를 담을 리스트)
		ArrayList<Ex22_2_Dog> list  = new ArrayList<>();
		list.add(d1);  //인덱스 0번째 배열
		list.add(new Ex22_2_Dog()); // 인덱스 1번째 배열 
		
		System.out.println(list.get(0));
		list.get(0).makeSound();
		list.get(1).makeSound();
		
		
		
	}

}
