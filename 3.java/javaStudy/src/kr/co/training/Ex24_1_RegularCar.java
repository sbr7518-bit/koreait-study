package kr.co.training;

public class Ex24_1_RegularCar implements Ex24_1_Car{
	
	//-> 물려받은 추상 메서드를 모두 구현하세요.
	//-> start() : "일반 자동차를 시동합니다." 출력
	//-> accelerate() : "일반 자동차를 가속합니다." 출력
	//-> brake() : "일반 자동차를 제동합니다." 출력
	
	@Override 
	public void start() {
		System.out.println("일반 자동차를 시동합니다.");
	}
	@Override 
	public void accelerate() {
		System.out.println("일반 자동차를 가속합니다.");
	}
	@Override 
	public void brake() {
		System.out.println("일반 자동차를 제동합니다.");
	}
	
	
	
	

}
