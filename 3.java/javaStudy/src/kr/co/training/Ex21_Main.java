package kr.co.training;

public class Ex21_Main {

	public static void main(String[] args) {

		
		Ex21_1_Order od = new Ex21_1_Order();
		
		od.setNumber("ORDER3");
		od.setStatus("결제완료");
		od.setAmount(120.5);
		
		System.out.println();
				
		Ex21_2_Warlord war = new Ex21_2_Warlord();
		war.attack();
		war.walk();
		war.levelUP();
		
		System.out.println("==============================================");
		
//		------------------------------------------------------------------------
		
//		캐릭터의 능력치를 가진 객체
		Ex21_3_CharaterAbility ca = new Ex21_3_CharaterAbility();
		ca.setStr(10);
		ca.setDex(10);
		ca.setKnowledge(10);
		
//		소서리스 객체
		Ex21_3_Sorceress sor = new Ex21_3_Sorceress(ca);
		sor.walk();
		sor.attack(ca);
		
		
		
		
	}

}