package kr.co.training;

public class Ex21_3_Chararter {
	
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
	 public void attack(Ex21_3_CharaterAbility ca) {
		 System.out.println("주먹으로 공격합니다.");
	 }
//	 skill 메서드
//	  - "공통 스킬을 사용합니다." 출력
	 public void skill(Ex21_3_CharaterAbility ca) {
		 System.out.println("공통 스킬을 사용합니다.");
	 }
	

}
