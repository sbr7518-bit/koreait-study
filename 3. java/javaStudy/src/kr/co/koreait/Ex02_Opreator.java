package kr.co.koreait;

public class Ex02_Opreator {

	public static void main(String[] args) {


//		연산자 (Oprator)
//		 - 수학적 계산이나 데이터 처리를 수행하기 위해 사용하는 기호 또는 기호 조합
		
//		1. 산술 연산자
//		  + : 더하기
//		  - : 빼기
//		  * : 곱하기

//		 나누기 (/ , %)
		System.out.println(10/2); // 나누기 (몫)
		System.out.println(10%2); // 나누기(나머지)
		
//		##############################################
		System.out.println("------증감연산자-------");
		
//		2. 증감 연산자
//		    - 피 연산자를 1 증가 또는 1 감소 시킴
		
		int number = 10;
		System.out.println(number); //  10
		number++; // 변수 number에 1 증가 -> 11
		System.out.println(number); //11

//		##############################################
		System.out.println("------전위 후위-------");		
//		전위 (앞에)
//		 - 피연산자의 값을 먼저 증가 또는 감소 시킨 후 연산을 수행
		int x = 10;
//		 x = x+1;
		System.out.println("전위 연산자 : " + ++x);	
		System.out.println("x의 값 : " + x);				
		
		
//		후위 (뒤에)
//		 - 연산을 먼저 수행한 후 피연산자의 값을 증가 또는 감소
		int y = 10;
		System.out.println("후위 연산자 : " + y++);	
//		y = y+1;
		System.out.println("x의 값 : " + x);				
				
//		##############################################
		System.out.println("------비교 연산자-------");				

//		3. 비교 연산자
//		 a == b : a와 b가 같다
//		 a != b : a와 b가 같지 않다
//		 a < b : a가 b보다 작다 (미만)
//		 a <= b : a가 b보다 작거나 같다 (이하)
//		 a > b : a가 b보다 크다 (초과)
//		 a >= b : a가 b보다 크거나 같다 (이상)
		
		String str1 = "ABC";
		String str2 =  new String("ABC"); // new String : 새로운 주소값을 생성
		System.out.println(str1 == str2); // 주소값 비교이기 때문에 false
		System.out.println(str1.equals(str2)); // 문자열(을 꺼내서) 비교이기 때문에 true
		System.out.println("".equals(str1)); // 비어있으면 true 비어있지 않으면 false / !"" 사용시 논리 부정한다.
		
//		##############################################
		System.out.println("------논리 부정(!) 연산자-------");		
		
//		4. 논리 부정 연산자 (문자열 비교할 때 주로 사용)
//		 - true면 false를 반환하고 false면 true를 반환
//		 - 논리(true/false)를 부정하는 연산자
	
		String str3 = "가나다라";
		System.out.println("".equals(str3)); // str3이 비워져있으면 true 
		System.out.println(!"".equals(str3));  // str3이 비워져있지 않으면 true 
		
//		##############################################
		System.out.println("------논리(&&,||) 연산자-------");		
		
//		5. 논리 연산자 
//		 - 논리식으로 판단하여 참(true) 또는 거짓(false) 반환

//		&& (AND, 그리고): 두 피연산자가 모두 참(true)일 때 true반환 
//		|| (OR, 또는): 두 피연사자 중 하나라도 참(true)일 때 true반환
		System.out.println(10 < 5 && 20 == 20);   // false && true = false
		System.out.println(33 > 28 && 5 != 7);    // true && true = true
		
		System.out.println(10 < 5 || 20 == 20);   // false || true = true
		System.out.println(33 > 28 || 5 != 7);    // true || true = true
		
		
//		##############################################
		System.out.println("------복합 대입 연산자-------");	// 우선순위 가장 낮음
		// 대입연산자 (=) -> 변수에 값을 대입하는 것
		
//		6. 복합 대입 연산자	(사칙연산 짧게 쓰는 방법)
//		 - 대입 연산자(=)와 산술 연산(+, -, *, /, %)를 함께 사용하는 기호 조합
		
		int sum = 100;
		sum += 10;  // sum = sum + 10; 을 보다 더 간단하게 작성하는 방법 (sum에 10을 더하겠다)
		System.out.println(sum);
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
