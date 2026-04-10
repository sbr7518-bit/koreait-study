package kr.co.training;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex26_1_Book {
	Scanner sc = new Scanner(System.in);
	
//	add 메서드
	public void add(ArrayList<Ex26_1_BookInfo> list) throws Ex26_1_DulicateBookException {
//	 - 추가할 도서 이름을 입력받습니다.(문자열)
//    > 도서 리스트에 이미 존재하는 도서라면 Ex26_1_DulicateBookException 발생
		System.out.println("도서 이름 : " );
		String title = sc.nextLine();
		
		for(Ex26_1_BookInfo s : list) {
			if(s.getTitle().equals(title)) {
				throw new Ex26_1_DulicateBookException("이미 존재합니다!");
			}
		}
//	 - 추가할 도서의 저자를 입력받습니다.(문자열)		
		System.out.println("저자 이름 : " );
		String author = sc.nextLine();

//   - 리스트에 Ex26_2_BookInfo 객체를 추가하세요.
		list.add(new Ex26_1_BookInfo(title,author));
	}
	
//	remove 메서드
	public void remove(ArrayList<Ex26_1_BookInfo> list) throws Ex26_1_BookNotFoundException {
//		 - 삭제할 도서 이름을 입력 받습니다. (문자열)
//	 	> 도서 리스트에 존재하지 않는 도서라면 Ex26_1_BookNotFoundException 발생
		System.out.println("삭제할 도서 이름 : ");
		String title = sc.nextLine();
		Ex26_1_BookInfo target = null;
		
//		*조회용으로 사용 -> list.remove(target);를 for문 밖에서 사용한다. 방식이 다르게 돌기 때문
		for(Ex26_1_BookInfo s : list) {
			if(s.getTitle().equals(title)) {
				target = s;
				break;
			}
		}
		if(target == null) {
			throw new Ex26_1_BookNotFoundException("존재하지 않는 책입니다!");
		}
//		 - 리스트에 해당하는 도서 객체를 제거하세요.
		list.remove(target);
	}
	
//	show 메서드
//	 - 전체 도서를 출력합니다. (도서이름, 저자)
		public void show(ArrayList<Ex26_1_BookInfo> list) {
		for(Ex26_1_BookInfo s : list) {
			System.out.println("도서 이름 :" + s.getTitle() + ", 저자 이름 : " + s.getAuthor());
		  }
			
		}
//	search 메서드
		public void search(ArrayList<Ex26_1_BookInfo> list) throws Ex26_1_BookNotFoundException {
//	 - 검색할 도서 이름을 입력 받습니다. (문자열)
//		> 도서 리스트에 존재하지 않는 도서라면 Ex26_1_BookNotFoundException 발생
			System.out.println("검색할 도서 이름 : ");
			String title = sc.nextLine();
			Ex26_1_BookInfo target = null;
			
			for(Ex26_1_BookInfo s : list) {
				if(s.getTitle().equals(title)) {
					target = s;
					break;
				}
			}
			if(target == null) {
				throw new Ex26_1_BookNotFoundException("존재하지 않는 책입니다!");
			}
//   - 리스트에 해당하는 도서가 있다면 정보를 출력하세요. (도서 이름, 저자)	
			System.out.println("도서 이름 :" + target.getTitle() + ", 저자 이름 : " + target.getAuthor());  
	}
}
