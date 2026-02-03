package kr.co.training;

public class Ex21_3_Sorceress extends Ex21_3_Chararter {
	
//	캐릭터 클래스를 상속받는다.

	//	소서리스 객체 생성 시 힘10, 민첩7, 지력 35로 생성됩니다.
	Ex21_3_Sorceress(Ex21_3_CharaterAbility ca){
		ca.setStr(10);
		ca.setDex(7);
		ca.setKnowledge(35);
	}
	
//	attack 메서드(오버라이딩)
//	 - "지팡이를 휘두릅니다." 출력
//	 - 경험치 25증가, 체력 10 감소
//	 - 체력이 10 미만일 경우 "체력이 부족합니다."  출력
	@Override
	public void attack (Ex21_3_CharaterAbility ca) {
		 int curExp = ca.getExp();
		 int curHp = ca.getHp();
		
	    if (curHp < 10) {
	        System.out.println("체력이 부족합니다.");
	        return;
	    }
	     System.out.println("지팡이를 휘두릅니다.");
	     ca.setExp(curExp + 25);
	     ca.setHp(curHp - 10);
	}
//	skill 메서드(오버라이딩)
//	 - "아이스 애로우를 사용합니다." 출력
//	 - 경험치 37증가, 마력 23 감소
//	 - 마력이 23 미만일 경우 "마력이 부족합니다." 출력
	@Override
	public void skill(Ex21_3_CharaterAbility ca) {
		 int curExp = ca.getExp();
		 int curMp = ca.getMp();
		
	    if (curMp < 23) {
	        System.out.println("마력이 부족합니다.");
	        return;
	    }
	     System.out.println("아이스 애로우를 사용합니다.");
	     ca.setExp(curExp + 37);
	     ca.setMp(curMp - 23);
	}
	
//	levelUP메서드
//	 - "레벨업을 하여 지력이 5 증가합니다." 출력
//	 - 지력 5 증가
	
	public void levelUP (Ex21_3_CharaterAbility ca) {
		  int curknowledge = ca.getKnowledge();
		  ca.setKnowledge(curknowledge + 5);
		  System.out.println("레벨업을 하여 지력이 5 증가합니다.");

	  }
	
	
	
	
	
	
	
}
	




















	


