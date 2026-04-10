package kr.co.training;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex10_ArrayList문제 {

	public static void main(String[] args) {

//		Q1. 6의 배수만 리스트에 추가하세요
//			 - 리스트 이름 : q1 (변수이름)
//			 - 들어가는 값들의 타입은 숫자
//			 - 1~200사이의 6의 배수만 리스트 q1에 추가

		ArrayList<Integer> q1 = new ArrayList<>(); // 1번째와 2번째 라인

		for (int i = 1; i < 201; i++) {
			if (i % 6 == 0) {
				q1.add(i);
			}
		
		}
		
		System.out.println(q1);
		
		
		System.out.println("=======================");

//		Q2. 학생 정보를 저장하기 위한 ArrayList를 생성하세요.
//			- 프로그램을 아래와 같은 메뉴를 사용자로부터 입력받습니다.
//			> "1. 학생 추가"
//			> "2. 학생 목록 조회"
//			> "3. 프로그램 종료"
//			> "메뉴 입력 : "
//			- 1번 입력 시 사용자로부터 학생의 이름을 입력 받고 ArrayList에 추가
//			- 2번 입력 시 ArrayList에 저장된 모든 학생의 이름 출력
//			- 3번 입력 시 "프로그램을 종료합니다." 출력 후 종료
//			- 위의 프로그램은 사용자가 종료를 선택할 때 까지 반복됩니다.
//			- 리스트 이름 student

		ArrayList<String> student = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		while (choice != 3) {
			System.out.println("1. 학생추가");
			System.out.println("2. 학생 목록 조회");
			System.out.println("3. 프로그램 종료");
			System.out.print("메뉴 입력 : ");			

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("학생 이름 : ");
				String name = sc.nextLine();
				student.add(name);
				System.out.println(name + " 학생이 추가되었습니다.");
			case 2:
				for (int i=0; i<student.size(); i++) {
					System.out.println(i + 1 + ". " + student.get(i) + " 학생");
				}
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.print("잘못 입력했습니다.");	
			}			 

		}
		

		
		
		  

	}

}
