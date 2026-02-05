package kr.co.training;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex26_Main {
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex26_1_Book book = new Ex26_1_Book(); // 도서 관련 기능이 있는 객체
		ArrayList<Ex26_1_BookInfo> list = new ArrayList<>();


		while(true) {
			System.out.println("""
					1. 도서 추가
					2. 도서 삭제
					3. 도서 전체 조회
					4. 도서 검색
					0. 종료
					""");
			System.out.print("메뉴 : ");
			String input = sc.nextLine();
			int menu;
			try {
				menu = Integer.parseInt(input); // 메뉴를 숫자가 아닌 문자를 입력하면 예외처리 하겠다는 코드.
//			* NumberFormatException : 자바에 내장된 예외로 따로 클래스나 import 를 할 필요가 없다. 
			} catch(NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
				continue;
			}

			switch(menu) {
			case 1 -> {
				try {
					book.add(list);
				} catch(Ex26_1_DulicateBookException d) {
					System.out.println(d.getMessage());
				}
			}
			case 2 -> {
				try {
					book.remove(list);
				} catch(Ex26_1_BookNotFoundException b) {
					System.out.println(b.getMessage());
				}
			}
			case 3 -> book.show(list);
			case 4 -> {
				try {
					book.search(list);
				} catch(Ex26_1_BookNotFoundException b) {
					System.out.println(b.getMessage());
				}
			}
			case 0 -> {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			default -> System.out.println("잘못된 메뉴입니다." );
			} 

		}
	}

}
