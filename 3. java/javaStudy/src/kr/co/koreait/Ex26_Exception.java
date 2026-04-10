package kr.co.koreait;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex26_Exception {

	public static void main(String[] args) {

		try {
			int[] numbers = {1,2,3};
			System.out.println("예외 발생 전");
			numbers[1] = 10; //OutOfBoundsException 발생지
			System.out.println("예외 발생 후");
			
//		  오류명 ()안에 직접 집어넣으면 무조건 작성한 예외처리만 오류를 잡는다.
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생!! : " + e);
// e: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3 실행코드에 올라옴.
		} finally {
			// 예외 발생 유무와 상관없이 실행할 코드
			System.out.println("finally!");
		}
		
		System.out.println("끝");
		
//		=================================================
		
//		Scanner sc = null;  // 스캐너 선언
//		* 스캐너 쉽게 작성하는 방법 <스캐너용 트라이 인셉션> * //  try   구문 안에서만 리소스 생성되어 try 안에서만 사용.
//		try (Scanner sc = new Scanner(System.in)){
////			sc = new Scanner(System.in); // {} 괄호 안에서만 사용자 입력
//			System.out.println("첫번째 숫자 : ");
//			int num1 = sc.nextInt();
//			
//			System.out.println("두번째 숫자 : ");
//			int num2  = sc.nextInt();
//			
//			int result = num1/num2;
//			System.out.println("나눗셈 결과 : " + result);
//		} catch(ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
////			System.out.println("발생한 예외 : " + e);
////			e.printStackTrace(); -> 보안상 이유로 권장하지 않음
////			System.out.println(e.getStackTrace()[0]);
//			System.out.println(e.getMessage());
//		} finally {
////			sc.close();   ->  스캐너는 입력했다면 닫아줘야 함!!!!
//			System.out.println("프로그램 종료!");
//		}
		
//		==============================================
		
		try { 
//			throw 는 의도적으로 예외발생 
			throw new ArrayIndexOutOfBoundsException();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생");
		}
		
//		===============================================
		
		try {
			readFile();
		} catch(IOException e) {
			System.out.println("파일을 찾을 수 없음");
		}
			
		System.out.println("==============");
//		--------------------------------------------------
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("나이 : ");
			int age = sc.nextInt();
			
			checkAge(age);
		} catch(Ex26_2_CustomException e) {
			System.out.println("예외 발생 : " + e);
		}
		
	}
	
	
//	 <특정 접근을 제한하고 싶을 때 조건부를 넣어서 작성할 수 있음>
//	RuntimeException 상속받았으면 throws 선택 가능해짐. 'Exception'으로 상속받았기에 throws 필수 작성한 것.
	public static void checkAge(int age) {
		if(age < 0) {
			throw new Ex26_2_CustomException("나이는 음수가 될 수 없습니다.!");
		} else if(age <18) {
			throw new Ex26_2_CustomException("미성년자는 접근할 수 없습니다.!");
		} else {
			System.out.println("정상적으로 접근되었습니다.");
		}
	}
	
	
	
//                                throws 호출한 곳으로 떠넘기는 놈.
	public static void readFile() throws IOException {
//		 Checked Exception (예외 처리 필수)
		FileReader Fr = new FileReader("test.txt");
	}
	
	
	
}
