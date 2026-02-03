package kr.co.training;

public class Ex21_2_Warlord extends Ex21_2_Character {

//	Character 클래스를 상속받는다.
	
//	 객체 생성 시 힘50, 민첩10, 지력10, 레벨1로 생성
//	  - 부모 생성자를 호출하세요.

	Ex21_2_Warlord() {
		super(50,10,10,1);
	}
	
//	 "워로드가 한걸음 걷습니다."
	  public void walk () {
		  System.out.println("워로드가 한걸음 걷습니다.");
	  }
	
//	attack 메서드 생성
//	 - "둔기를 휘두릅니다." 출력	
      
	  public void attack () {
		  System.out.println("워로드가 둔기를 휘두릅니다.");
	  }
	
	
//	levelUP() 메서드 생성
//	 - "레벨업을 하여 힘이 5 증가합니다." 출력
//	 - "현재 레벨 : 00, 힘 : 00" 출력
//	 - 현재 레벨을 1 증가시키고, 힘을 5 증가시킵니다.
	  public void levelUP () {
		  int curStr = getStr();
		  int curLevel = getLevel();
		  
		  super.setLevel(curLevel + 1);
		  super.setStr(curStr + 5);
		  
		  System.out.println("레벨업을 하여 힘이 5 증가합니다.");
		  System.out.println("현재 레벨 : " + getLevel() + ", 힘 : " + getStr());
	  }

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
