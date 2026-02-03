package kr.co.training;

public class Ex21_3_CharaterAbility {
	
// 아래의 필드를 가집니다.
// - 힘(str), 민첩(dex), 지력(knowledge)
// - 모든 필드의 접근 제어자는 private
	private int str; 
	private int	dex;
	private int knowledge;
//	레벨(level 초기값 1)
	private int level = 1;
	private int exp;
	private int hp = 100;
	private int mp = 100;
	
	public Ex21_3_CharaterAbility() {
	}

	// - 각 필드에 대한 getter/setter 작성	
	public void setStr(int str) {
		this.str = str;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	public void setKnowledge(int knowledge) {
		this.knowledge = knowledge;
	}
	public void setLevel(int level) {
		this.level = level;
	}
//	경험치(exp, 100이 될 경우 레벨이 1증가하고 경험치는 0리셋)
	public void setExp(int exp) {
		if(exp >= 100) {
			level++;
			this.exp = 0;
		}
	} 
//	체력(hp, 초기값 100, 레벨업을 해도 회복되지 않음)
	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
			this.hp = hp;
		}
	}
//	마력(mp,초기값 100, 레벨업을 해도 회복되지 않음)
	public void setMp(int mp) {
		if (mp < 0) {
			this.mp = 0;
		} else {
			this.mp = mp;
		}
	}
	public int getStr() {
		return str;
	}
	public int getDex() {
		return dex;
	}
	public int getKnowledge() {
		return knowledge;
	}
	public int getLevel() {
		return level;
	}
	public int getExp() {
		return exp;
	}
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	
// - 현재 능력치를 모두 확인할 수 있는 toStirng 오버라이딩 작성
//	 > toStirng은 문자열을 반환 합니다.
//	 > public String toString(){return "문자열"}
	
	@Override 
	public String toString(){
//	   return "힘 : " + str + "민첩 : " + dex;
	   return String.format("힘 : %d 민첩 : %d", str, dex);
	   
	}
	
	

}
