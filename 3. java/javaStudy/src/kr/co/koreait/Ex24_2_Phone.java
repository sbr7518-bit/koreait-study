package kr.co.koreait;

public interface Ex24_2_Phone {

	//	static final 생략되어 있음.	(붙어 있기 때문에 무조건 값을 입력해야함 (선언불가))
	int MAX_BATTERY_CAPACITY = 100;

	public abstract void openingLogo();
	//	 미완성 메서드가 포함되어 있기 때문에 미완성 클래스로 판정
	//	 미완성 클래스 안에선 제한없이 자유롭게 작성 가능

	//	규격과 내용을 통일시킬 수 있끼 때문에 미완성 메서드를 사용(통일성과 유지보수 높아짐)

//	abstract 생략되어 있음
	public void powerOn();

	public void powerOff();



}
