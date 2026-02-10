package kr.co.training;

import java.util.Scanner;

public class Game {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		startGame(); // 게임 시작
	}
	
	public static void startGame() {
		// Scanner 객체 생성
		int menu;
		// CharacterAbility 객체 생성
		CharaterAbility ch = new CharaterAbility();
		Warlord hero = new Warlord(ch);
		
		
		do { // 게임 시작
			System.out.println("게임 메뉴를 선택해주세요.");
			System.out.println("1. 사냥 시작");
			System.out.println("2. 인벤토리-포션");
			System.out.println("3. 스텟");
			System.out.println("4. 케릭터 정보 확인");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 : ");
			// 스캐너로 입력 받기
			menu = sc.nextInt();	
			System.out.println("================");
			if(menu == 1) {
				huntMenu(hero, ch); // 사냥 시작
			} else if(menu == 2) {
				setPorsion(ch); // 인벤토리-포션
			} else if(menu == 3) {
				setStatus(ch); // 스텟
			} else if(menu == 4) {
				getCharInfo(ch, hero); // 케릭터 정보 확인
			} else if(menu == 0) {
				System.out.println("게임을 종료합니다."); // 종료
				break;
			} else {
				System.out.println("올바른 메뉴를 선택해주세요.");
				System.out.println("================");
			}
		} while(true);
	}
	
	public static boolean huntMenu(Warlord hero, CharaterAbility ch) {
		// MonsterAbility 객체 생성
		MonsterAbility mons = new MonsterAbility();
		
		do {
			System.out.println("공격을 선택해주세요.");
			System.out.println("1. 기본 공격");
			System.out.println("2. 힘 스킬 사용");
			System.out.println("3. 민첩 스킬 사용");
			System.out.println("4. 지력 스킬 사용");
			System.out.println("0. 처음으로 돌아가기");
			System.out.print("메뉴 선택 : ");
			// 스캐너로 입력 받기
			int selectAttack = sc.nextInt();
			System.out.println("================");
			
			if(selectAttack == 1) {
//				기본 공격 선택 시 : attack 메서드 호출
				hero.attack(ch, mons);
			} else if(selectAttack == 2) {
//				힘 스킬 선택 시 : strSkill 메서드 호출
				hero.strSkill(ch, mons);
			} else if(selectAttack == 3) {
//				민첩 스킬 선택 시 : dexSkill 메서드 호출
				hero.dexSkill(ch, mons);
			} else if(selectAttack == 4) {
//				지력 스킬 선택 시 : knowledgeSkill 메서드 호출
				hero.knowledgeSkill(ch, mons);
			} else if(selectAttack == 0) {
				// 처음으로 돌아가기
				System.out.println("처음 메뉴로 돌아갑니다.");
				System.out.println("================");
				return true;
			} else {
				System.out.println("================");
				System.out.println("올바른 메뉴를 선택해주세요.");
			}
			if(mons.getHp() <= 0) {
				System.out.println("사냥이 종료되었습니다.");
				return true;
			}
			System.out.println("================");
		} while(true); 
	 }
	

	public static boolean setPorsion(CharaterAbility ch) {
		do {
			System.out.println("인벤토리-포션");
			System.out.println("1. 체력 포션");
			System.out.println("2. 마나 포션"); 
			System.out.println("3. 포션 목록");
			System.out.println("0. 처음으로 돌아가기");
			System.out.print("사용할 포션을 선택하세요: ");
			// 스캐너로 입력 받기
			int selectPorsion = sc.nextInt();
			System.out.println("================");
			
			if(selectPorsion == 1) {
//		         > 소지중 체력 포션이 1개 이상일 경우
//	             => "체력 포션을 사용했습니다." 출력
//	             => 소지중 체력 포션 1개 감소			    
//	             => 체력 60 회복
//	             => "포션 사용 후 현재 체력 : OO"
//	         > 소지중 체력 포션이 0개 일 경우
//	             => "인벤토리 체력 포션이 없습니다." 출력 
				if(ch.gethpPortionCount() >= 1) {
					System.out.println("체력 포션을 사용했습니다.");
					ch.sethpPortionCount(ch.gethpPortionCount()-1);
					ch.addHp(60);
					System.out.println("포션 사용 후 현재 체력 : " + ch.getHp());
				} else if(ch.gethpPortionCount() == 0){
					System.out.println("인벤토리에 체력 포션이 없습니다.");
				}
				
			} else if(selectPorsion == 2) {
//		         > 소지중 마력 포션이 1개 이상일 경우
//	             => "마력 포션을 사용했습니다." 출력
//	             => 소지중 체력 포션 1개 감소			    
//	             => 마력 60 회복
//	             => "포션 사용 후 현재 마력 : OO"
//	         > 소지중 마력 포션이 0개 일 경우
//	             => "인벤토리 마력 포션이 없습니다." 출력 
				if(ch.getmpPortionCount() >= 1) {
					System.out.println("마력 포션을 사용했습니다.");
					ch.setmpPortionCount(ch.getmpPortionCount()-1);
					ch.addMp(60);
					System.out.println("포션 사용 후 현재 마력 : " + ch.getMp());
				} else if(ch.getmpPortionCount() == 0){
					System.out.println("인벤토리에 마력 포션이 없습니다.");
				}
			} else if(selectPorsion == 3) {
//		         > "소지중인 체력 포션은 OO개 입니다." 출력
				System.out.println("소지중인 체력 포션은 " + ch.gethpPortionCount() + "개 입니다.");
//		         > "소지중인 마력 포션은 OO개 입니다." 출력 
				System.out.println("소지중인 마력 포션은 " + ch.getmpPortionCount() + "개 입니다.");
			} else if(selectPorsion == 0) {
				// 처음으로 돌아가기
				System.out.println("처음 메뉴로 돌아갑니다.");
				System.out.println("================");
				return true;
			} else {
				System.out.println("올바른 메뉴를 선택해주세요.");
			}
			System.out.println("================");
		} while(true);
	}
	
	public static boolean setStatus(CharaterAbility ch) {
		// 레벨업 할때마다 스텟(unusedStatus) 5가 생김
		// 현재 레벨 확인 후 여유분의 스텟을 추가하는 코드 작성
		// * ability의 setter/getter를 이용
		do {
			System.out.println("사용할 스텟을 입력해주세요.");
			System.out.println("1. 힘+5");
			System.out.println("2. 민첩+5");
			System.out.println("3. 지력+5");
			System.out.println("0. 처음으로 돌아가기");
			System.out.print("사용할 스텟 : ");
			int selectStatus = sc.nextInt();
			System.out.println("================");

			if(selectStatus == 1) {
//	          > 사용 가능한 잔여 스텟(unusedStatus)이 있을 경우
//                => "힘이 5 증가되었습니다." 출력
//                => 힘 5 증가
//                => 잔여 스텟 5 감소
//                => "증가된 후 힘 : OO" 출력 
//            > 사용 가능한 잔여 스텟(unsedStatus)이 없을 경우
//                => "사용 가능한 스텟이 없습니다." 출력
				 if (ch.getunusedStatus() >= 5) {
		                ch.setStr(ch.getStr() + 5);
		                ch.setunusedStatus(ch.getunusedStatus() - 5);
		                System.out.println("힘이 5 증가되었습니다.");
		                System.out.println("증가된 후 힘 : " + ch.getStr());
		            } else {
		                System.out.println("사용 가능한 스텟이 없습니다.");
		            }
			} else if(selectStatus == 2) {
//	          > 사용 가능한 잔여 스텟(unusedStatus)이 있을 경우
//                => "민첩이 5 증가되었습니다." 출력
//                => 민첩 5 증가
//                => 잔여 스텟 5 감소
//                => "증가된 후 민첩 : OO" 출력 
//            > 사용 가능한 잔여 스텟(unsedStatus)이 없을 경우
//                => "사용 가능한 스텟이 없습니다." 출력
				if (ch.getunusedStatus() >= 5) {
	                ch.setDex(ch.getDex() + 5);
	                ch.setunusedStatus(ch.getunusedStatus() - 5);
	                System.out.println("민첩이 5 증가되었습니다.");
	                System.out.println("증가된 후 민첩 : " + ch.getDex());
	            } else {
	                System.out.println("사용 가능한 스텟이 없습니다.");
	            }
			} else if(selectStatus == 3) {
//	          > 사용 가능한 잔여 스텟(unusedStatus)이 있을 경우
//                => "지력이 5 증가되었습니다." 출력
//                => 지력 5 증가
//                => 잔여 스텟 5 감소
//                => "증가된 후 지력 : OO" 출력
//            > 사용 가능한 잔여 스텟(unsedStatus)이 없을 경우
//                => "사용 가능한 스텟이 없습니다." 출력
				if (ch.getunusedStatus() >= 5) {
	                ch.setKnowledge(ch.getKnowledge() + 5);
	                ch.setunusedStatus(ch.getunusedStatus() - 5);
	                System.out.println("지력이 5 증가되었습니다.");
	                System.out.println("증가된 후 지력 : " + ch.getKnowledge());
	            } else {
	                System.out.println("사용 가능한 스텟이 없습니다.");
	            }
			} else if(selectStatus == 0) {
				// 처음으로 돌아가기
				System.out.println("처음 메뉴로 돌아갑니다.");
				System.out.println("================");
				return true;
			} else {
				System.out.println("올바른 메뉴를 선택해주세요.");
			}
			System.out.println("================");

		} while(true);
	}
	
	public static boolean getCharInfo(CharaterAbility ch, Warlord hero) {
//        - 현재 가진 정보들을 전체 출력
//			> "========케릭터 정보========"
//        	> "체력 : OO"
//        	> "마나 : OO"
//        	> "힘 : OO "
//        	> "민첩 : OO"
//        	> "지력 : OO"
//        	> "현재 레벨 : OO"
//        	> "현재 경험치 : OO"
//        	> "사용 가능 스텟 : OO" 
		   System.out.println("======== 캐릭터 정보 ========");
		    System.out.println("체력 : " + ch.getHp());
		    System.out.println("마나 : " + ch.getMp());
		    System.out.println("힘 : " + hero.getStr());
		    System.out.println("민첩 : " + hero.getDex());
		    System.out.println("지력 : " + hero.getKnowledge());
		    System.out.println("현재 레벨 : " + ch.getLevel());
		    System.out.println("현재 경험치 : " + ch.getExp());
		    System.out.println("사용 가능 스텟 : " + ch.getunusedStatus());
		    System.out.println("============================");
		return true;
	}

}