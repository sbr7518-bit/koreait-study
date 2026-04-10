package kr.co.koreait;

import java.util.ArrayList;

public class Ex27_1_ExtendsGeneric {

	public static void main(String[] args) {
		
		Ex27_1_Calc<Integer> calc = new Ex27_1_Calc<>();
		calc.add(10, 20);
//		Ex27_1_Calc<String> calc2 = new Ex27_1_Calc<>();
//		calc2.add("A","B");
		
		Ex27_1_Calc2 c = new Ex27_1_Calc2();
		ArrayList<Integer> list = new ArrayList<>();
		c.add(list);
	}

}

// extends (상한제한) : 이 클래스를 상속받는 하위 클래스들만 허용  ex) Number'를 사용하면 숫자와 관련된 레퍼클래스(Byte,Short,Integer 등)만 사용하겠다 지정. 
// super (하한제한) : 상속 받는 즉, 부모 클래스만 허용 (자신의 부모들만 사용 가능)  ex) 'Integer'가 들어간다 부모인 'Number'만 사용. 
class Ex27_1_Calc<T extends Number> {
	public void add(T num1, T num2) {
//		 형변환 해주기
		 Integer a = (Integer) num1;
		 Integer b = (Integer) num2;
		System.out.println(a + b);
	}
}

//  ? = 와일드 카드 : 어떤 타입이든 접목, 사용 가능.
class Ex27_1_Calc2 {
	public void add(ArrayList<? super Integer> list) {
		list.add(10);
		list.add(20);
		System.out.println(list.toArray()); // toArray() 참조값을 넣어서 참조 주소값만 나옴
	}
}