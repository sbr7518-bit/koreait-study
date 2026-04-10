package kr.co.koreait;

public class Ex25_Class2 {

	public static void main(String[] args) {
		
//		 OuterClass 객체 생성을 한 것이 아닌 .이후로 나오는 InnerClass를 생성한 것.		
//		<정적 중첩클래스 방법>
//		OuterClass.InnerClass inner = new OuterClass.InnerClass();
//		inner.print();
		
//		<비정적 중첩클래스 방법>
//		1. 바같 클래스 객체 생성 먼저
		OuterClass out = new OuterClass();
		
//		2.안쪽(inner) 클래스 객체 생성
		OuterClass.InnerClass inner = out.new InnerClass();
		inner.print();
		
		Ex25_1_Calculator cal = new Ex25_1_Calculator(2, 3);
		Ex25_1_Calculator.Calc calc = cal. new Calc();
		System.out.println(calc.add());
		
//		<익명 내부 클래스> 일회성으로 사용할 때: 외부사용이 어려운 인터페이스를 내부 클래스에 객체생성 같지만 익명 클래스(추상메서드)로 생성된 것. 
		Animal ani = new Animal() {
			
			@Override
			public void sound() {
				System.out.println("소리를 냅니다.");
			}
		};
		
//		<람다식>
		Animal animal2 = () -> System.out.println("멍멍!");
		
		
	}
}

interface Animal{
	void sound();
}



	class OuterClass {
		private static int staticNum = 10;  // 클래스 변수
		private  int instanceNum = 20;  // 인스턴스 변수
		
//		static을 사용하면 객체생성하지 않아도 바로 사용할 수 있다. static class InnerClass { 정적 중첩 클래스
//		static class InnerClass { //static이 빠지면 아웃터 클래스 한번. 이너클래스를 한번 더 객체 생성 해줘야 한다.
		class InnerClass {	// 비정적 중첩클래스
		public void print() {
				System.out.println(staticNum);
				System.out.println(instanceNum);
			}
		}
		
		
	}