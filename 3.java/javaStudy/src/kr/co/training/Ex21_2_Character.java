package kr.co.training;


public class Ex21_2_Character{
	
//	 힘(str), 민첩(dex), 지력(knowledge), 레벨(level) 필드를 가집니다.
//	  - 모두 정수형
//	  - 접근 제어자 : private
	
	private int str;
	private int dex;
	private int knowledge;
	private int level;
	
//	 walk 메서드를 가집니다.
//	  - "캐릭터가 한걸음 움직입니다." 출력
		public void walk() {
			System.out.println("캐릭터가 한걸음 움직입니다.");
		}	
//	 stop 메서드를 가집니다.
//	  - "캐릭터가 멈춥니다." 출력
		public void stop() {
			System.out.println("캐릭터가 멈춥니다.");
		}
	
//	 힘과 레벨 필드에 대한 getter /setter
		
		public void setStr(int str) {
			this.str = str;
		}
		public void setLevel(int level) {
			this.level = level;
		}
			
		public int getStr() {
			return str;
		}
		public int getLevel() {
			return level;
		}
		

}

