package kr.co.koreait;


public class Ex24_2_Pineapplephone implements Ex24_2_Phone{
	
	
// 부모격인 폰 클래스가 미완성 메서드이기 때문에 여기도 직접 abstract 구현하거나 
// 오버라이딩으로 불러오기
	
//	 상속받은 클래스명(openingLogo)을 작성하여 오버라이딩
	@Override  
	public void openingLogo() {
		System.out.println("");
	}
	@Override  
	public void powerOn() {
		System.out.println("파인애플폰 켜짐");
	}
	@Override  
	public void powerOff() {
		System.out.println("파인애플폰 꺼짐");
	}
	
	

}
