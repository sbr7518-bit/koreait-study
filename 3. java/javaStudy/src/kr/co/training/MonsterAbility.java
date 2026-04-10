package kr.co.training;

public class MonsterAbility {

//	  1. 데미지(damage)
//	     - 기본값 : 5
//	  2. 체력(hp)
//	     - 기본값: 100
//	  3. getter/setter 작성
	
//	  private int damage = 5;
//	  private int hp = 100;
//	  
//	  public int getDamage() {return damage;}
//	  public void setDamage(int damage) {this.damage = damage;}
//	  
//	  public int getHp() {return hp;}
//	  public void setHp(int hp) {this.hp = hp;}

	private int damage = 5;
	private int hp = 100;

	public int getDamage() {
		return damage;
	}

	public int getHp() {
		return hp;
	}

	// 몬스터가 피해를 받을 때
	public void takeDamage(int damage) {
		hp -= damage;
		if (hp < 0) {
			hp = 0;
		}
	}

	// 몬스터 공격력 반환
	public int attack() {
		return damage;
	}


}
