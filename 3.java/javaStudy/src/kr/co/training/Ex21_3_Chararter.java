package kr.co.training;

public class Ex21_3_Chararter {
	
//	동작 메서드 
	
	 protected Ex21_3_CharaterAbility ca; 
	 // Ex21_3_CharaterAbility 필드를 'ca'로 소환
	 public Ex21_3_Chararter(Ex21_3_CharaterAbility ca) {
		this.ca = ca; // 'ca'를 현재 필드에 저장 = 이곳에서 사용가능
	}
	
//	 walk 메서드
//	  - "캐릭터가 한걸음 걷습니다." 출력
	 public void walk() {
		 System.out.println("캐릭터가 한 걸음 걷습니다.");
	 }
//	 stop 메서드
//	  - "캐릭터가 멈춥니다." 출력
	 public void stop() {
		 System.out.println("캐릭터가 멈춥니다.");
	 }
//	 attack 메서드
//	  - "주먹으로 공격합니다." 출력
	 public void attack() {
		 System.out.println("공격합니다.");
	 }
//	 skill 메서드
//	  - "공통 스킬을 사용합니다." 출력
	 public void skill() {
		 System.out.println("공통 스킬을 사용합니다.");
	 }
	

}
