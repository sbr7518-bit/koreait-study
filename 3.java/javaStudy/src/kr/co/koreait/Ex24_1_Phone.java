package kr.co.koreait;

public abstract class Ex24_1_Phone {
	
	public abstract void openingLogo();
//	 미완성 메서드가 포함되어 있기 때문에 미완성 클래스로 판정
//	 미완성 클래스 안에선 제한없이 자유롭게 작성 가능
	
//	규격과 내용을 통일시킬 수 있끼 때문에 미완성 메서드를 사용(통일성과 유지보수 높아짐)
	
	public void powerOn()	{
		openingLogo();
		System.out.println("핸드폰이 켜집니다.");
	}
	
	public void powerOff()	{
		System.out.println("핸드폰이 꺼집니다.");
	}
	
	

}
