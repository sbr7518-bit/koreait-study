package kr.co.training;

import java.util.HashMap;
import java.util.Scanner;

public class Ex12_HashMap {

	public static void main(String[] args) {
		
//		 "이름" : "전화번호" 형태의 phoneBook이라는 HashMap을 생성
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		
		HashMap<String, String> phoneBook = new HashMap<>();
		
		while(isTrue)	{
			System.out.println("1.전화번호 추가");
			System.out.println("2.전화번호 검색");
			System.out.println("3.전화번호 전체 검색");
			System.out.println("4.전화번호 삭제");
			System.out.println("0.프로그램 종료");
			System.out.println("메뉴 입력 : ");
			int menu = sc.nextInt();
			sc.nextLine();			
				
			
		switch(menu) {
//		1번입력시 
//		 - 사용자로부터 이름과 전화번호를 입력받습니다.
//		 - 입력받은 이름을 키로, 전화번호를 값으로 phoneBook에 저장
		case 1: 	
			System.out.println("이름과 전화번호를 입력하세요 : ");
//			String name = sc.nextLine();
//			String number = sc.nextLine();		
			String input = sc.nextLine();
			String[] parts = input.split(" ");
			
			String name = parts[0];
			String number = parts[1];
			phoneBook.put(name,number);			
			System.out.println(name + "의 전화번호가 추가되었습니다.");
			break;
			
//		2번입력시 
//		 - 사용자로부터 검색할 이름을 입력받습니다.
//	     - phoneBook에 일치하는 이름이 있다면
//			 > "000의 전화번호는 000-0000-0000 입니다." 출력
//	     - phoneBook에 일치하는 이름이 없다면
//			 > "000의 전화번호를 찾을 수 없습니다." 출력
		case 2: 	
			System.out.println("검색할 이름을 입력하세요 : ");
			name = sc.nextLine();			
			if(phoneBook.containsKey(name)) {
				System.out.println(name + "의 전화번호는 " + phoneBook.get(name) + " 입니다.");
			} else {
				System.out.println(name + "의 전화번호를 찾을 수 없습니다.");
			}
			break;
						
//		 3번입력시 
//	 	  - phoneBook에 존재한 모든 목록을 출력
//			 > "이름 : 000, 전화번호: 000-0000-0000"
			
		case 3:			
			for(String key : phoneBook.keySet()) {
				System.out.println("이름 : " + key + ", 전화번호 : " + phoneBook.get(key));
			}
			break;
			
//		 4번입력시 
//	 	  - 사용자로부터 삭제할 이름을 입력받습니다.
//		  - phoneBook에 일치하는 이름이 있다면
//	     	 > phoneBook에서 해당 이름을 가진 전화번호 제거 후
//			   "000의 전화번호를 삭제했습니다." 출력
//		  - phoneBook에 일치하는 이름이 없다면
//	     	 > phoneBook에서 해당 이름을 가진 전화번호 제거 후
//			   "000의 전화번호를 찾을 수 없습니다." 출력
		case 4:	
			System.out.print("삭제할 이름을 입력해주세요 : ");
			name = sc.nextLine();
					
			 if(phoneBook.containsKey(name)) {
			    phoneBook.remove(name);
				System.out.println(name + "의 전화번호를 삭제했습니다.");
			 } else {
			 	System.out.println(name + "의 전화번호를 찾을 수 없습니다.");
			 }
			break;
						
//		0번 입력시
//		  - "프로그램을 종료합니다." 출력 후 프로그램 종료
		case 0:
			System.out.println("프로그램을 종료합니다.");
			isTrue = false;
			break;			
//		그 외
//		  - "올바른 메뉴를 입력해주세요." 출력
		default:
			System.out.println("올바른 메뉴를 입력해주세요.");	
		  }
	  }		

	
	
	}
}
