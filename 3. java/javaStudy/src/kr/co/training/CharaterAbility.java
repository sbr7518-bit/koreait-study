package kr.co.training;

public class CharaterAbility {
	
//	  1. 힘(str), 민첩(dex), 지력(knowledge)
//	     - 기본값 : 0
//	  2. 레벨(level)
//	     - 기본값 : 1
//	  3. 경험치(experience)
//	     - 기본값 : 0
//	     - 특징 : 경험치가 100 이상이 될 경우 레벨이 1 증가하고 경험치는 0으로 초기화됩니다.
//	  4. 체력(hp), 마력(mp)
//	     - 기본값 : 100
//	     - 특징 : 레벨업을 해도 회복되지 않습니다.
//	                  포션을 사용해도 최대 100까지만 회복됩니다.
//	  5. 잔여 스텟(unusedStatus)
//	     - 기본값 : 0
//	     - 특징 : 레벨업을 하면 5가 추가됩니다.
//	  6. 소지중인 체력 포션(hpPortionCount), 마력 포션(mpPortionCount)
//	     - 기본값 : 10
	private int str = 0; 
	private int	dex = 0;
	private int knowledge = 0;
	private int level = 1;
	private int exp = 0;
	public void addExp(int exp) {
		this.exp += exp;  // 기존 경험치 + 새로 얻은 경험치
		if(this.exp >= 100) {
			leverUP(); //100이상 되면 레벨1증가
			this.exp = 0; // 1증가되면 경험치는 0
		}
	}
	private int hp = 100;
	public void addHp(int amount) {
		this.hp += amount;
		if (this.hp > 100) {
			this.hp = 100; // ⭐ 최대치 제한
		}
	}
	private int mp = 100;
	public void addMp(int amount) {
		this.mp += amount;
		if (this.mp > 100) {
			this.mp = 100; // ⭐ 최대치 제한
		}
	}
	private int unusedStatus = 0;
	public void leverUP() {
		level++;
		unusedStatus += 5;
		System.out.println("레벨 업! 현재 레벨 : " + level);
		System.out.println("스텟이 5 추가되었습니다.");
	}
	
	private int hpPortionCount = 10;
	private int mpPortionCount = 10;
	
	
	
	public int getStr() {return str;}
	public void setStr(int str) {this.str = str;}
	
	public int getDex() {return dex;}
	public void setDex(int dex) {this.dex = dex;}
	
	public int getKnowledge() {return knowledge;}
	public void setKnowledge(int knowledge) {this.knowledge = knowledge;}
	
	public int getLevel() {return level;}
	public void setLevel(int level) {this.level = level;}
	
	public int getExp() {return exp;}
	public void setExp(int exp) {
		this.exp += exp;  // 기존 경험치 + 새로 얻은 경험치
		if(this.exp >= 100) {
			this.level++; //100이상 되면 레벨1증가
			this.exp = 0; // 1증가되면 경험치는 0
			System.out.println("레벨 업! 현재 레벨 : " + this.level);
		}
	}
	public int getHp() {return hp;}
	public void setHp(int hp) {this.hp = hp;}
	
	public int getMp() {return mp;}
	public void setMp(int mp) {this.mp = mp;}
	
	public int getunusedStatus() {return unusedStatus;}
	public void setunusedStatus(int unusedStatus) {this.unusedStatus = unusedStatus;}
	
	public int gethpPortionCount() {return hpPortionCount;}
	public void sethpPortionCount(int hpPortionCount) {this.hpPortionCount = hpPortionCount;}
	
	public int getmpPortionCount() {return mpPortionCount;}
	public void setmpPortionCount(int mpPortionCount) {this.mpPortionCount = mpPortionCount;}
}
