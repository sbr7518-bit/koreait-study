package kr.co.koreait;

public class Ex23_2_DeskCalendar extends Ex23_2_Calendar {

	Ex23_2_DeskCalendar(String color, int months) {
		super(color, months);
	}
	
	@Override  // 클래스 변환시 부모 변수명 과 자식 변수명이 동일한 메서드가 있을 때 자식에 오버라이딩이 있으면 값을 덮씌운다. 
	public void hanging() {
		System.out.println(color + "색 달력을 벽에 걸기 위해 고리가 필요합니다.");
	}
	public void onTheDesk() {
		System.out.println(color + "색 달력을 벽에 세울 수 있습니다.");
	}
	
}
