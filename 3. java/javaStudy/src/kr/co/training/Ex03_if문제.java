package kr.co.training;

import java.util.Scanner;

public class Ex03_if문제 {

	public static void main(String[] args) {
	
		
//		Q1. 점수를 입력받아 60점 이상이면 "합격", 아니면 "불합격" 출력
		Scanner sc = new Scanner(System.in);	  	


    	System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if (score >= 60) {
			System.out.println("합격입니다");
		} else if (score < 60){
			System.out.println("불합격입니다");
		}
	

//		Q2. 정수 하나를 입력받아 짝수인지 홀수인지 출력
		
		int num1 = 10;
		
		System.out.print("입력하세요 : ");
		int a = sc.nextInt();
		

		if (a%2 == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
			

//		Q3. 나이를 입력받아 20세 이상이면 "성인", 아니면 "미성년자" 출력
		
		int age = 20;
		System.out.print("나이를 입력하세요 : ");
		int b = sc.nextInt();
		
		if (b >= 20) {
			System.out.println("성인입니다");
		} else if (b < 20) {
			System.out.println("미성년자입니다.");
		}

//		Q4. 비밀번호가 "1234"이면 "로그인 성공", 아니면 "로그인 실패" 출력
		
		System.out.print("비밀번호를 입력하세요 : ");
		sc.nextLine();
		String pwd = sc.nextLine();
		
		if (pwd.equals("1234")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
				

//		Q7. 나이를 입력받아 요금 출력
//		 - 12세 이하 : 3,000원
//		 - 18세 이하 : 5,000원
//		 - 19세 이상 : 10,000원

		System.out.print("입력하세요 : ");
		int age1 = sc.nextInt();
		
		if (age1 >= 0 && age1 <= 12 )  {
			System.out.println("3,000원");
		} else if (age1 > 12 && age1 <= 18 ){
			System.out.println("5,000");
		} else if (age1 >= 19 ) {
			System.out.println("10,000");
		} 
		
		sc.nextLine();

//		Q8. 아이디와 비밀번호를 입력받아 아이디가 "admin"이고 비밀번호가 "1234"면 관리자 로그인 성공
		
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호를 입력하세요 : ");
		String pwd1 = sc.nextLine();
		
		if (id.equals("admin") && pwd1.equals("1234")) {
			System.out.println("관리자 로그인 성공");
		} else {
			System.out.println("관리자 로그인 실패");
		}	
			

//		Q9. 점수와 결석 여부를 입력받아 결과 출력
//		 - 결석 여부는 true, false로 받음
//		 - 결석이면 무조건 F
//		 - 90 이상 A
//		 - 80 이상 B
//		 - 70 이상 C
//		 - 그 외 F
		
		int Score = 89;
		boolean num2 = true;
		if (!num2) {
			System.out.println("F");
		} else if (Score >= 90) {
			System.out.println("A");
		} else if (Score >= 80) {
			System.out.println("B");
		} else if (Score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		
		

//		Q10. 스캐너로 사용자로부터 몇 월인지 입력 받으세요.
//		  - 해당하는 계절과 출력 메시지는 아래와 같습니다.
//		  - 3, 4, 5 : 봄
//		  - 6, 7, 8 : 여름
//		  - 9, 10, 11 : 가을
//		  - 12, 1, 2 : 겨울
//		  - 그 외 : 해당하는 계절이 없습니다.
//		        ex) 1을 입력 받을 경우 “겨울” 출력
//		             위의 예시를 활용하여 OR 연산자 또는 AND 연산자를 활용하여 문제를 풀어보세요.

		int month = 7;
		if (month >= 3 && month <= 5) {
			System.out.println("봄");
		} else if (month == 6 || month == 7 | month == 8) {
			System.out.println("여름");
		} else if (month == 9 || month == 10 | month == 11) {
			System.out.println("가을");
		} else if (month == 12 || month == 1 | month == 2) {
			System.out.println("겨울");
		} else {
			System.out.println("해당하는 계절이 없습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
