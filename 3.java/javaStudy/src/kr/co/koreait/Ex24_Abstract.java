package kr.co.koreait;

public class Ex24_Abstract {

	public static void main(String[] args) {
		
		Ex24_1_Pineapplephone p1 = new Ex24_1_Pineapplephone();
		p1.powerOn();
		p1.powerOff();
		System.out.println();
		
		
//		Ex24_2_phone p2 = new Ex24_2_Pineapplephone(); 
//		-> 같은 추상메서드를 가지고 있는 부모클래스로 호출해도 상관없다 (이유: 같은 추상메서드를 오버라이딩 해야하기때문에)
		Ex24_2_Pineapplephone p2 = new Ex24_2_Pineapplephone();
		p2.openingLogo();
		p2.powerOn();
		p2.powerOff();
		System.out.println(Ex24_2_Pineapplephone.MAX_BATTERY_CAPACITY);
	}

}
