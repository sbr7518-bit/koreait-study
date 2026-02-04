package kr.co.training;

public interface Character {
	
//	<Caracter 인터페이스>
//	  1. 기본 공격 attack 추상 메서드를 가집니다.
	public void attack(CharaterAbility ch, MonsterAbility mon);
//	  2. 힘 스킬 strSkill 추상 메서드를 가집니다.
	public void strSkill(CharaterAbility ch, MonsterAbility mon);
//	  3. 민첩 스킬 dexSkill 추상 메서드를 가집니다.
	public void dexSkill(CharaterAbility ch, MonsterAbility mon);
//	  4. 지력 스킬 knowledgeSkill 추상 메서드를 가집니다.
	public void knowledgeSkill(CharaterAbility ch, MonsterAbility mon);

}
