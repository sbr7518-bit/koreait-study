package kr.co.koreait;

public class Ex23_ploy {

	public static void main(String[] args) {

//		부모 클래스 타입으로 객체 생성 (평소 방식)
		Ex23_1_Parent parent = new Ex23_1_Parent();
		parent.printHello();
		System.out.println();
		
//		자식 클래스 타입으로 객체 생성 (평소 방식)
		Ex23_1_Child ch = new Ex23_1_Child();
		ch.printHello();
		ch.displayHello();
		System.out.println();
		
		Ex23_1_Parent par = ch; //클래스 타입 변환
		
		
//		클래스 타입 변환 (자식 객체를 부모 타입으로)
//		 - 부모 클래스에 있는 변수와 메서드만 사용
		Ex23_1_Parent p = new Ex23_1_Child();
		p.printHello();
		
//		자식 객체로 만들겠지만 기본 객체는 부모로 사용하겠다. (타입 제한)
		Ex23_2_Calendar cal = new Ex23_2_DeskCalendar("빨강", 8);
		cal.info();
		cal.hanging();
//		cal.onTheDesk();
		
		System.out.println("=======================");
//		=============================================================
		
//		Ex23_3_Computer
//		Ex23_3_Samsong
//		Ex23_3_LZ
//		Ex23_3_ComputerRoom
		
		Ex23_3_ComputerRoom cr = new Ex23_3_ComputerRoom();
//		cr.computer1 = new Ex23_3_Samsong();
//		cr.computer2 = new Ex23_3_Samsong();
//		cr.computer3 = new Ex23_3_Samsong();
		
		cr.computer1 = new Ex23_3_LZ();
		cr.computer2 = new Ex23_3_LZ();
		cr.computer3 = new Ex23_3_LZ();
		
		cr.allPowerOn();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
