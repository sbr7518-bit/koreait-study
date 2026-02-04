package kr.co.training;

public class Ex24_1_SportsCar implements Ex24_1_Car{

	//-> 물려받은 추상 메서드를 모두 구현하세요.
	//-> start() : "스포츠카를 시동합니다." 출력
	//-> accelerate() : "스포츠카를 가속합니다." 출력
	//-> brake() : "스포츠카를 제동합니다." 출력
	
	@Override 
	public void start() {
		System.out.println("스포츠카를 시동합니다.");
	}
	@Override 
	public void accelerate() {
		System.out.println("스포츠카를 가속합니다.");
	}
	@Override 
	public void brake() {
		System.out.println("스포츠카를 제동합니다.");
	}
	
	
	
	
	
	
	

}
