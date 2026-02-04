package kr.co.training;


public class Warlord implements Character{
	
//	<Warlord 클래스, Character 인터페이스를 상속받음>
//	  1. 워로드는 객체 생성 시 기본 스탯을 갖습니다. 힘 30 , 덱스 17, 지력 10
			private int str = 30;
			private int dex = 30;
			private int knowledge = 10;
//
//	  2. 기본 공격 attack 메서드
//	    * 참고 : 케릭터가 먼저 공격하고, 그 다음 몬스터가 공격을 합니다.
//	               즉, 서로 한 번씩 돌아가며 공격합니다.
			
			@Override
			public void attack(CharaterAbility ch, MonsterAbility mon) {
// ------- 케릭터 공격 차례
//  - 마력이 6 미만이라면 기본 공격 사용 불가 ("마력이 부족해 공격할 수 없습니다" 출력)
//  - "몬스터가 OO의 피해를 입었습니다!" 출력    
//  - 몬스터가 케릭터 힘*1.3 만큼의 체력이 깍입니다.
//  - 케릭터의 마력 6 감소
				if(ch.getMp() < 6) {
					System.out.println("마력이 부족하여 공격할 수 없습니다.");
					return;
				} 
				int damage = (int)(ch.getStr()*1.3);
				System.out.println("몬스터가 " + damage + "의 피해를 입었습니다!");
				mon.takeDamage(damage);
				ch.addMp(-6);
//			    ------- 케릭터 공격 차례(몬스터 처치 시)
//			    - 몬스터의 체력이 0 이하라면 "몬스터 사냥을 성공하셨습니다" 출력
//			    - 케릭터의 경험치 13 증가
				if(mon.getHp() <= 0) {
					System.out.println("몬스터 사냥을 성공하셨습니다.");
					ch.addExp(13);
					return;					
				}
//			    ------- 몬스터 공격
//			    - "몬스터가 공격했습니다!" 출력    
//			    - "케릭터가 OO의 피해를 입었습니다!" 출력
//			    - 몬스터 데미지 만큼 케릭터의 체력이 감소합니다.
				System.out.println("몬스터가 공격했습니다!");
				int mondamage = mon.getDamage();
				ch.addHp(-mondamage);
				System.out.println("캐릭터가 " + mondamage + "의 피해를 입었습니다.");
//			    ------- 몬스터 공격(케릭터 사망 시) if로 사용
//			    > 케릭터의 체력과 마력이 70으로 회복됩니다.
//			    > 경험치가 30 감소합니다.
				if(ch.getHp() <= 0) { // 값을 그대로 가지고 올 때 get 사용
					System.out.println("캐릭터가 사망했습니다.");
					ch.setHp(70);
					ch.setMp(70);	// 값을 새로운 값으로 수정할때 set 사용
					ch.addExp(-30);  // 값을 증가 및 감소 할 땐 add 사용
					return;
				}
			}
//
//	  3. 힘 스킬 strSkill 메서드
//	    * 참고 : 케릭터가 먼저 공격하고, 그 다음 몬스터가 공격을 합니다.
//	               즉, 서로 한 번씩 돌아가며 공격합니다.
			@Override
			public void strSkill(CharaterAbility ch, MonsterAbility mon) {
//			    ------- 케릭터 공격 차례
//			    - 마력이 15 미만이라면 스킬 사용 불가 ("마력이 부족해 스킬을 사용할 수 없습니다." 출력)
//			    - "몬스터가 힘 스킬로 인해 OO의 피해를 입었습니다!" 출력
//			    - 몬스터가 힘*1.8 만큼의 체력이 깍입니다.
//			    - 케릭터의 마력 15 감소  
				if(ch.getMp() < 15) {
					System.out.println("마력이 부족하여 공격할 수 없습니다.");
					return;
				} 
				int damage = (int)(ch.getStr()*1.8);
				System.out.println("몬스터가 힘 스킬로 인해 " + damage + "피해를 입었습니다!");
				mon.takeDamage(damage);
				ch.addMp(-15);
//			   ------- 케릭터 공격 차례(몬스터 처치 시)
//			    - 몬스터의 체력이 0 이하라면 "몬스터 사냥을 성공하셨습니다" 출력
//			    - 케릭터의 경험치 13 증가
				if(mon.getHp() <= 0) {
					System.out.println("몬스터 사냥을 성공하셨습니다.");
					ch.addExp(13);
					return;					
				}
//			    ------- 몬스터 공격
//			    - "몬스터가 공격했습니다!" 출력    
//			    - "케릭터가 OO의 피해를 입었습니다!" 출력
//			    - 몬스터 데미지 만큼 케릭터의 체력이 감소합니다.
				System.out.println("몬스터가 공격했습니다!");
				int mondamage = mon.getDamage();
				ch.addHp(-mondamage);
				System.out.println("캐릭터가 " + mondamage + "의 피해를 입었습니다.");
//			    ------- 몬스터 공격(케릭터 사망 시)
//			    > 케릭터의 체력과 마력이 70으로 회복됩니다.
//			    > 경험치가 30 감소합니다.	
				if(ch.getHp() <= 0) { 
					System.out.println("캐릭터가 사망했습니다.");
					ch.setHp(70);
					ch.setMp(70);	
					ch.addExp(-30);  
					return;
				}
			}
//
//	  4. 민첩 스킬 dexSkill 메서드
//	    * 참고 : 케릭터가 먼저 공격하고, 그 다음 몬스터가 공격을 합니다.
//	               즉, 서로 한 번씩 돌아가며 공격합니다.
			@Override
			public void dexSkill(CharaterAbility ch, MonsterAbility mon) {
//			    ------- 케릭터 공격 차례
//			    - 마력이 19 미만이라면 스킬 사용 불가 ("마력이 부족해 스킬을 사용할 수 없습니다." 출력)
				if(ch.getMp() < 19) {
					System.out.println("마력이 부족하여 공격할 수 없습니다.");
					return;
				} 
//			    - "몬스터가 민첩 스킬로 인해 OO의 피해를 입었습니다!" 출력
//			    - 몬스터가 민첩*0.7 만큼의 체력이 깍입니다. 
//			    - "몬스터가 민첩 스킬로 인해 OO의 피해를 입었습니다!" 출력
//			    - 몬스터가 민첩*0.7 만큼의 체력이 깍입니다.
//			    - "몬스터가 민첩 스킬로 인해 OO의 피해를 입었습니다!" 출력
//			    - 몬스터가 민첩*0.7 만큼의 체력이 깍입니다. (총 3회 공격)
				int damage = (int)(ch.getDex() * 0.7);
				for (int i = 0; i <3; i++) {
					System.out.println("몬스터가 민첩 스킬로 인해 " + damage + "피해를 입었습니다!");
					mon.takeDamage(damage);
//				   ------- 케릭터 공격 차례(몬스터 처치 시)
//				    - 몬스터의 체력이 0 이하라면 "몬스터 사냥을 성공하셨습니다" 출력
//				    - 케릭터의 경험치 13 증가
					if(mon.getHp() <= 0) {
						System.out.println("몬스터 사냥을 성공하셨습니다.");
						ch.addExp(13);
					}
				} 
//			    - 케릭터의 마력 19 감소
				ch.addMp(-19);
//			    ------- 몬스터 공격
//			    - "몬스터가 공격했습니다!" 출력    
//			    - "케릭터가 OO의 피해를 입었습니다!" 출력
//			    - 몬스터 데미지 만큼 케릭터의 체력이 감소합니다.
				System.out.println("몬스터가 공격했습니다!");
				int mondamage = mon.getDamage();
				ch.addHp(-mondamage);
				System.out.println("캐릭터가 " + mondamage + "의 피해를 입었습니다.");
//			    ------- 몬스터 공격(케릭터 사망 시)
//			    > 케릭터의 체력과 마력이 70으로 회복됩니다.
//			    > 경험치가 30 감소합니다.
				if(ch.getHp() <= 0) { 
					System.out.println("캐릭터가 사망했습니다.");
					ch.setHp(70);
					ch.setMp(70);	
					ch.addExp(-30); 
					return;
				}
			}
//	  5. 지력 스킬 knowledgeSkill 메서드
//	    * 참고 : 케릭터가 먼저 공격하고, 그 다음 몬스터가 공격을 합니다.
//	               즉, 서로 한 번씩 돌아가며 공격합니다.
			@Override
			public void knowledgeSkill(CharaterAbility ch, MonsterAbility mon) {
//				------- 케릭터 공격 차례
//			    - 마력이 28 미만이라면 스킬 사용 불가 ("마력이 부족해 스킬을 사용할 수 없습니다.") 출력
//			    - "몬스터가 지력 스킬로 인해 OO의 피해를 입었습니다!" 출력
//			    - 몬스터가 지력*3.6 만큼의 체력이 깍입니다.
//			    - 케릭터의 마력 28 감소
				if(ch.getMp() < 28) {
					System.out.println("마력이 부족하여 공격할 수 없습니다.");
					return;
				} 
				int damage = (int)(ch.getKnowledge()*3.6);
				System.out.println("몬스터가 지력 스킬로 인해 " + damage + "피해를 입었습니다!");
				mon.takeDamage(damage);
				ch.addMp(-28);
//			   ------- 케릭터 공격 차례(몬스터 처치 시)
//			    - 몬스터의 체력이 0 이하라면 "몬스터 사냥을 성공하셨습니다" 출력
//			    - 케릭터의 경험치 13 증가
				if(mon.getHp() <= 0) {
					System.out.println("몬스터 사냥을 성공하셨습니다.");
					ch.addExp(13);
					return;					
				}
//			    ------- 몬스터 공격
//			    - "몬스터가 공격했습니다!" 출력    
//			    - "케릭터가 OO의 피해를 입었습니다!" 출력
//			    - 몬스터 데미지 만큼 케릭터의 체력이 감소합니다.
				System.out.println("몬스터가 공격했습니다!");
				int mondamage = mon.getDamage();
				ch.addHp(-mondamage);
				System.out.println("캐릭터가 " + mondamage + "의 피해를 입었습니다.");
//			    ------- 몬스터 공격(케릭터 사망 시)
//			    > 케릭터의 체력과 마력이 70으로 회복됩니다.
//			    > 경험치가 30 감소합니다.
				if(mon.getHp() <= 0) {
					System.out.println("몬스터 사냥을 성공하셨습니다.");
					ch.setHp(70);
					ch.setMp(70);	
					ch.addExp(-30);  
					return;
				}
				
			}

}
