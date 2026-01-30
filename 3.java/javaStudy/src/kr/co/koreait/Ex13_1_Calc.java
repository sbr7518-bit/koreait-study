package kr.co.koreait;

public class Ex13_1_Calc {
	
	      /**
	       * 숫자를 더해주는 메서드입니다.     
	       * @param num1
	       * @param num2
	       * @return num1 + num2
	       */
//			덧셈 메서드
//	                   (자료형 매개변수1, 자료형 매개변수2)
		public int add(int num1, int num2) {
//			System.out.println(num1 + num2);
			return num1 + num2;  // void는 무효라는 뜻으로 return을 적용하지 않기 때문에 int로 작성해줘야 한다.
		}
//			빼기 메서드 (sub)
//			 - 매개변수 3개를 받습니다.
//			 - 3개를 뺀 값을 반환합니다.
		
		public int sub(int sub1, int sub2, int sub3) {
			return sub1-sub2-sub3;
		}				
		
		/** 
		 * 덧셈을 구하는 서식
		 * @param numbers
		 * @return resultSum
		 */ 
		public int sum(int[] numbers) {
			int resultSum = 0;
			
			for (int i=0; i < numbers.length; i++) {
				resultSum += numbers[i];
			}
			return resultSum;
		}
		
		
		
		
//			곱셈 메서드 (mul)
//			 - 매개변수 4개를 받습니다.
//			 - 4개를 곱한 값을 반홥합니다.
		
		public int mul(int mul1, int mul2, int mul3, int mul4) {
			return mul1*mul2*mul3*mul4;
		}
		
			 
//			나눗셈 메서드(div)
//			 - 매개변수 2개를 받습니다.
//           - 2개를 나눈 몫을 출력하세요.		
//			 - 2개를 나눈 나머지를 반환하세요.
	
		public int div(int div1, int div2) {
			System.out.println(div1/div2);
			return div1 % div2;
		}
		

		
		
		
		
	
	
}
