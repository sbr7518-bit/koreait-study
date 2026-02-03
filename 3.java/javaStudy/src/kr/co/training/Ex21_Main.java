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
		
//		캐릭터의 능력치를 가진 객체  (생성자)
		Ex21_3_CharaterAbility ca = new Ex21_3_CharaterAbility();
		
//		소서리스 객체
		Ex21_3_Sorceress sor = new Ex21_3_Sorceress(ca);
		
		sor.attack();
		System.out.println("현재 체력 : " + ca.getHp());
		System.out.println("현재 경험치 : " + ca.getExp());
		System.out.println("현재 지력 : " + ca.getKnowledge());
		
//		체력을 0으로 직접 설정
		ca.setHp(0);
//		공격 시도 (메서드)
		sor.attack();
		
		System.out.println();
		
		sor.skill();
		System.out.println("현재 마력 : " + ca.getMp());
		System.out.println("현재 경험치 : " + ca.getExp());
		
		ca.setExp(13); //레벨업 호출
		
//		메서드 호출을 사용해야 값이 변경
		sor.levelUP(); //메서드 사용
		System.out.println("현재 지력 : " + ca.getKnowledge());
		System.out.println();
		
		System.out.println("현재 체력 : " + ca.getHp());
		ca.setHp(50);
		System.out.println("체력이 50 감소했습니다");
		System.out.println("현재 체력 : " + ca.getHp());
		
//		현재 능력치를 확인합니다.
		System.out.println(ca);
		
		
		
	}

}