package kr.co.koreait;

public class Ex03_if {

	public static void main(String[] args) {

//		##############################################
		System.out.println("------ if ------");				

//		1. if문
//		 - 조건을 검사하고 true면 특정 코드를 실행시키는 문법
		int number = 10;
		
		if (number > 5) {
			System.out.println("number의 값을 5보다 큽니다!");
		}

//		##############################################
		System.out.println("------if-else------");		
		
//		2. if-else문
//		 - 여러 개의 조건식을 사용하고 싶을 때 사용하는 문법
		int number2 = 25;
		
		if (number2 > 30) {
			System.out.println("number2는 30보다 큽니다!");
		} else if (number2 > 25) {
			System.out.println("number2는 25보다 큽니다!");
		} else if (number2 > 20) {
			System.out.println("number2는 20보다 큽니다!");
		}
		
		// 중간에 true가 나온다면 다음 sop는 실행하지 않는다
		
		
//		##############################################
		System.out.println("------else------");		
		
//		3. else문		
//		 - 위의 조건(if ~ else if)이 모두 거짓일 때 코드를 실행하는 문법
//		 - 그 외
		 int number3 = 17;
			
			if (number3 > 30) {
				System.out.println("number3이 30보다 큽니다!");
			} else if (number3 > 20) {
				System.out.println("number3는 20보다 큽니다!");
			} else {
				System.out.println("위의 조건식이 모두 거짓입니다!");
			}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
