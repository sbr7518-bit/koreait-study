package kr.co.training;

public class Ex23_Main {

	public static void main(String[] args) {
		
		
		//	1. Farm 객체 생성.
		Ex23_1_Farm farm = new Ex23_1_Farm();
		//	2. Pig 객체 생성.
		EX23_1_Pig pig = new EX23_1_Pig();
		//	3. Cow 객체 생성.
		Ex23_1_Cow cow = new Ex23_1_Cow();
		//	4. Farm 의 sound() 메서드를 호출하세요.
		// 	- 2번 호출하며 각각 Pig 와 Cow 객체를 인자로 넘겨주세요.
		
//		 <객체지향적 작성>
//		farm.sound(pig,cow);
		
//		 <다형성 작성>
		farm.sound(pig, "꿀꿀");
		farm.sound(cow, "음메");
		
		System.out.println("==================");
//		=======================================
		
//		Q. 부부가 식사중에 여자가 말했다.
//		"여보 마트가서 우유사고 만약에 아보카도 있으면 6개 사와"
//		개발자 남자는 마트를 다녀온 뒤 우유 6개를 건내며 말했다. "아보카도 있었어"
//		조건에 맞춰 기능을 구현하세요.
		
		
		Ex23_2_SuperMarket market = new Ex23_2_SuperMarket();
		
		// 아보카도가 있는 경우
		Ex23_2_HasAvocado c1 = new Ex23_2_HasAvocado();
		market.goSuperMarket(c1);
		System.out.println("구입한 우유 개수 : " + market.getmilkCount());
		
		// 구현 다 하고 아보카도가 없는 경우(NoAvocado 객체)도 작성
		Ex23_2_NoAvocado c2 = new Ex23_2_NoAvocado();
		market.goSuperMarket(c2);
		System.out.println("구입한 우유 개수 : " + market.getmilkCount());
		

		
		
		
		
		
		


	}

}
