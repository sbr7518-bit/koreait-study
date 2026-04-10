package kr.co.training;

import java.util.Scanner;

public class Ex20_Main {

	public static void main(String[] args) {

//		 getter/setter 를 사용하는 경우
//		 - 객체 생성 후에도 자유롭게 데이터 변경 가능
//		 - 필요한 필드만 setter 로 값을 넣을 수 있음.
//		  	> 초기값 이후 값을 변경할 필요가 없다면 setter 안 만들면 됨.
		 Ex20_1_Animal cat = new Ex20_1_Animal();	 
		 cat.setName("나비");
		 cat.setAge(2);
		 cat.eat();

//		 생성자로만 필드로 초기화 하는 경우
//		  - 데이터가 불변 (객체 생성 후 값이 변하지 않음)
		 Ex20_1_Animal dog = new Ex20_1_Animal("똘이", 1);
		 dog.eat();
	
		 System.out.println("========================");
		 
//		 --------------------------------------------------------------------------
		 Ex20_2_BookInfo bookInfo = new Ex20_2_BookInfo();  // 도서관 정보 객체
		 bookInfo.setBookCount(100); // 초기에 100권이 있다.
		 
		 Ex20_2_Book book = new Ex20_2_Book(); // 도서관 객체
//		                  도서관 정보, 빌린 책의 수
		 book.borrowBook(bookInfo, 3);
		 book.returnBook(bookInfo, 1);
		 book.showBookCount(bookInfo);
		 
		 System.out.println("========================");

//		 --------------------------------------------------------------------------		 
		 
		 Ex20_3_MemberInfo memberinfo = new Ex20_3_MemberInfo();
		 memberinfo.setName("짱구");
		 memberinfo.setAge(5);
		 memberinfo.setAddr("인천");
		 memberinfo.setIsStudent(false);
		 
		 Ex20_3_Member member = new Ex20_3_Member();
		 member.introduce(memberinfo);
		 member.run(memberinfo);
		 
		 
	}

}
