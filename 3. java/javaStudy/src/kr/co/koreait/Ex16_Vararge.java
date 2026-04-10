package kr.co.koreait;

import java.util.Arrays;

public class Ex16_Vararge {

	public static void main(String[] args) {
		
//		가변길이 매개변수
//		  - 매개변수의 개수를 유동적으로 받는 방식
//		  - 특징 : 배열로 받음
//		  - 사용방법 : 자료형 ...
//		  - 주의 사항 1 : 가변길이 매개변수는 마지막에 작성되어야 한다.
//		  - 주의 사항 2 : 가변길이 매개변수가 작성된 오버로딩은 우선 순위가 낮음
//		  		> 오버로딩은 시그니처가 가장 정확히 일치하는 메서드를 우선 호출
		
		Ex16_Vararge v = new Ex16_Vararge();
//		v.printNumbers();
		v.printNumbers(1);
		v.printNumbers(1,2,3);
		
		
	}	

//                                    <가변길이 매개변수는 무조건 뒤에 작성해야함> -> 순위가 가장 낮음. 값이 일치한 것이 먼저 들어감.
	public void printNumbers(int num ,int... numbers) { // <- 여기 한 줄을 '시그니처'라고 부른다.
		System.out.println("매개변수 num : " + num); // 무조건 값이 들어가야함
		System.out.println("가변길이 매개변수 : " + Arrays.toString(numbers)); // 값이 들어가지 않아도 상관없음
	}
	
	
}
