package kr.co.koreait;

import java.util.Random;
import java.util.Scanner;

public class Ex05_for {

	public static void main(String[] args) {
		

//		##############################################
		System.out.println("------for문------");			
		
//		for문
//		 - 초기식, 조건식, 증감식으로 구성
//		 - 반복할 횟수를 미리 알고 있을 경우에 사용
		
	/*	for (int i = 0; i < 100; i++) {
			System.out.println("i의 값 : " + i);
		}*/
		
//		문자열.length()를 사용하면 해당 문자열의 길이를 반환. ex) python = 6글자 실행 = 0~5 반환
		String subject = "python"; 
		
		for (int i = 0; i < subject.length(); i++) {
			System.out.println("subject for문 i의 값 : " +i);
		}
		
		
		for (int i=10; i>0; i--) {
			System.out.println("i를 1씩 빼는 for문의 i값" + i);
		}
		
//		사용자가 입력한 횟수만큼 반복하는 for문
		
		Scanner sc = new Scanner (System.in);
		System.out.println("반복할 횟수 : ");
		int count = sc.nextInt();
		
		for (int i =0; i<count; i++) {
			System.out.println( i + " 입니다");
		}
				
		sc.nextLine();
		
		System.out.println();
		
//		로또번호 생성하기
		
		Random rd = new Random();  // 자바에서 이미 만들어준 랜덤 생성기
		
		for (int i=0; i<6; i++) {
			int number = rd.nextInt(45)+1;
			System.out.println(number + " ");
		}
		
//		##############################################
		System.out.println("------중첩 for문------");		
		
//		예시		 
		int count1 = 0;		
		for (int i = 0; i <3; i++) {
			for (int j = 0; j <5; j++) {
				count1++;
			} 
		}
		  System.out.println("반복 횟수 : " + count1);
		  
		  System.out.println();
//		
		  for (int i = 0; i <3; i++) {
			   System.out.println("바깥 for문 i : " + i);
				for (int j = 0; j<5; j++) {
					System.out.println("j" + j);
				}
		  }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
