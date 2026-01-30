package kr.co.koreait;

public class Ex13_Method {

	public static void main(String[] args) {

		
//	 Method (메서드)
//		- 정의된 동작이나 기능을 수행	

//	 객체 생성 (= 인스턴스화 -> 메모리에 적재된 순간을 말함)
//		- 코드를 메모리에 올리는 과정
//		- 클래스명 변수명 = new 클래스명();
	  Ex13_Method m = new Ex13_Method();
	  String result2 = m.printHello("안녕하세요 저는 홍길동입니다.");	
	  System.out.println(result2);
	  
	  System.out.println("============================================");
	  
	  int [] numbers = {100, 200, 300, 400};
	  Ex13_1_Calc calc = new Ex13_1_Calc();
	  
	  int sum = calc.sum(numbers);
	  System.out.println(sum);
	  
	  int result1 = calc.add(5, 3); // 5+3
	  System.out.println(result1);
	  
	  
	  calc.add(10,10); // 10+10
	  calc.add(20,10); // 20+10
//           - 인 자 -  = 던지는 건 인자, 불러오는 건 매개변수  	
		  
	   int sub = calc.sub(10,5,2); 
	   
	   System.out.println(sub);
	  
	   int mul = calc.mul(10,5,2,1);
	   System.out.println(mul);
	   
	   int div = calc.div(10,5);
	   System.out.println(div);
	   
	   System.out.println("==============================");
	   
	   Ex13_3_BankAccount bank = new Ex13_3_BankAccount(); 
	   
	   bank.deposit(10000);
	   bank.withdraw(3500);
	   String check = bank.checkBalance();
	   System.out.println(check);
	  
	   
	   	   
	}	
	
//	안녕하세요 출력하는 메서드
//	public 반환타입  메서드명 (자료형 매개변수형) {  }
//	 - 반환 타입의 종류 : void, int, String, int[], ArrayList<>, ...
//	 - void = 반환 타입 없음 (return 없음)
	public String printHello(String str) {
		System.out.println(str);
		return "잘 출력되었습니다.";
	}
}
