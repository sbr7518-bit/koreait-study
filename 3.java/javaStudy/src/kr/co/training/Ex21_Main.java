package kr.co.training;

public class Ex21_Main {

	public static void main(String[] args) {

		
		Ex21_1_Order od = new Ex21_1_Order();
		
		od.setNumber("ORDER3");
		od.setStatus("결제완료");
		od.setAmount(120.5);
		
		System.out.println();
		
		Ex21_2_Character ch = new Ex21_2_Character();
		ch.walk();
		ch.stop();
		ch.getStr();
		ch.getLevel();
		
	
		
		
		
		
	}

}
