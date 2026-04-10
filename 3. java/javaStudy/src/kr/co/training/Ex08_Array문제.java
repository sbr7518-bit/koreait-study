package kr.co.training;

import java.util.Scanner;

public class Ex08_Array문제 {

	public static void main(String[] args) {
		

//		1. 5만큼의 길이를 가진 배열 arrString을 생성하세요.
//		2. 위에서 생성한 배열을 아래의 값으로 초기화 하세요.
//			-> "A", "B", "CD", "E", "FG"
//		3. 배열의 요소를 1개씩 꺼내서 꺼낸 요소가 "CD"일 경우 출력 후 반복문을 종료하세요
		
		String [] arr = new String[5];
		
		arr[0] = "A";
		arr[1] = "B";
		arr[2] = "CD";
		arr[3] = "E";
		arr[4] = "FG";
				
		for (int i=0; i<arr.length; i++) { 	
			if("CD".equals(arr[i])) { // 문자열 비교는 무조건 '.equals'로 하기!!!!
			System.out.println(arr[i]); 	
			break;		
			}
		}
		
//		
//		-------------------------------------------------------------
//		1. 사용자에게 입력받은 점수를 보관할 scores 배열을 생성하세요 (크기 : 4)
//		2. 인덱스별 점수는 아래와 같습니다.
//			-> 0번 인덱스 : 국어 점수
//			-> 1번 인덱스 : 영어 점수
//			-> 2번 인덱스 : 수학 점수
//			-> 3번 인덱스 : 과학 점수
//		3. 사용자로부터 국어, 영어, 수학, 과학 점수를 입력받아 알맞은 배열의 위치에 할당하세요.
//		4. 배열에 있는 값의 합계 점수와 평균 점수를 출력하세요.
		
	
			int[] scores = new int [4];
			Scanner sc = new Scanner(System.in);
			
			System.out.println("국어 점수 :");
			scores[0] = sc.nextInt();
			System.out.println("영어 점수 :");
			scores[1] = sc.nextInt();
			System.out.println("수학 점수 :");
			scores[2] = sc.nextInt();
			System.out.println("과학 점수 :");
			scores[3] = sc.nextInt();
			
		
			int sum = 0;
			for(int i=0; i<scores.length; i++) {
				sum += scores[i];
			}
			
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + sum / scores.length);
		
		
		
		
		
		
		
		
		
		
	}

}
