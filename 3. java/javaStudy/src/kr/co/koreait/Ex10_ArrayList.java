package kr.co.koreait;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex10_ArrayList {

	public static void main(String[] args) {

		
//	ArrayList
//	 - 같은 자료형을 가진 데이터를 묶어서 관리하는 자료구조 (배열)
//	 - 크기를 동적으로 조절 (넓이를 자동으로 조정)
//	  < > 안에는 무조건 참조형 변수를 넣어줘야 함 (기본형 사용불가)
		
//             < 자료형  > -> 기본형 변수 X, 레퍼클래스(참조형)를 넣어주어야 한다		
	  ArrayList<Integer> intList = new ArrayList<>();
		
	  intList.add(10);
	  intList.add(20);
	  intList.add(30);
	  intList.add(10);
	  
	  intList.add(2, 999);	   
//	  System.out.println(intList);
	  System.out.println(intList.get(2));  // 2번 인덱스에 있는 값을 조회
	  
//	  .size()  ArrayList의 길이를 반환 해주는것이 아닌 요소의 갯수를 알려줌.
	  System.out.println("ArrayList의 길이 : " + intList.size());

	  
		for (Integer n : intList) {
			System.out.println(n);
		}		
		
	   System.out.println("=======삭제=======");
	   
	   intList.remove(2); // 2번 인덱스 요소 삭제
	   intList.clear(); // 전체 요소 삭제
	   
	   System.out.println("삭제 후 intList : " + intList);
	   
//	   .isEmpty()  <리스트가 비워져있는지 확인>
//	    - 비워져있으면 true, 요소가 1개라도 있으면 false
	   System.out.println("isEmpty : " + intList.isEmpty());
		
		
	   System.out.println("==================================================");
	   
//	   -------------------------------------------------
//	   LinkedList
//	    - 각각의 노드가 데이터와 포인터를 가지고 있는 자료구조
//	   	- 포인터 : 다음 노드의 위치
	   
	   LinkedList<String> linked = new LinkedList<>();
	   
	   linked.add("A");
	   linked.add("B");
	   linked.add("C");
	   linked.remove(1);	   
		 
		System.out.println(linked);
		
		
		
		
		
		
		
		
	}

}
