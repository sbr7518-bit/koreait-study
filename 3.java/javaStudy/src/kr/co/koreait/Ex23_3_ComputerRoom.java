package kr.co.koreait;

public class Ex23_3_ComputerRoom {
	
//	Ex23_3_Samsong computer1;
//	Ex23_3_Samsong computer2;
//	Ex23_3_Samsong computer3;
	
	Ex23_3_Computer computer1;
	Ex23_3_Computer computer2;
	Ex23_3_Computer computer3;
	
	
	// 모든 컴퓨터를 키게 만드는 메서드
	public void allPowerOn() {
		computer1.powerOn();
		computer2.powerOn();
		computer3.powerOn();
	}
	
	// 자식에 대한 매개변수 사용시 자식1, 자식2 따로 (메서드)생성해야하지만 부모 매개변수(Ex23_3_Computer) 사용시 자식 둘다 사용 가능.
//	public void selectPowerOn(Ex23_3_Samsong samsong) {
//		samsong.powerOn();
//	}
	
	public void selectPowerOn(Ex23_3_Computer Computer) {
		Computer.powerOn();
	}
	
	
	

}
