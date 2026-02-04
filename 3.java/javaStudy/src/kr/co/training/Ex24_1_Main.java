package kr.co.training;

public class Ex24_1_Main {

	public static void main(String[] args) {
//	- main 메서드에서 SportsCar와 RegularCar의 객체를 생성하고 메서드를 모두 실행하세요.
		Ex24_1_SportsCar sc = new Ex24_1_SportsCar();
		sc.start();
		sc.accelerate();
		sc.brake();
		

		Ex24_1_RegularCar rc = new Ex24_1_RegularCar();
		rc.start();
		rc.accelerate();
		rc.brake();
	}



}


