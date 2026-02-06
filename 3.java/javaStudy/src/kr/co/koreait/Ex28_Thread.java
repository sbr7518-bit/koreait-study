package kr.co.koreait;
//  쓰레드는 여러 작업을 동시에 실행하게 만들어주는 것. (체감은 없지만 더 빠르다)
public class Ex28_Thread {
	
	public static void main(String[] args) throws InterruptedException {
		
//		Ex28_Test t1 = new Ex28_Test("스레드1");
//		t1.start();  // 현재 스레드 : Thread-0  -> 새로운 스레드를 생성하며 실행
//		t1.run();  //현재 스레드 : main  -> 현재 스레드에서 실행
//		t1.join(); // 순서를 정리하기 위해 사용하지만 예외처리 필수.
////		'join'을 사용하면 여러 스레드가 번갈아가며 실행하던 것을 한 스레드가 끝날때까지 다른 스레드를 계속 대기상태(일시정지)로 만든다. 
//		System.out.println("스레드1 종료");
//		
//		Ex28_Test t2 = new Ex28_Test("스레드2");
//		t2.start();
//		t2.join();  
//		System.out.println("스레드2 종료");

		
//		<Thread 클래스 상속받아서 사용할 때>
//		Ex28_Test t1 = new Ex28_Test("스레드1");
//		Ex28_Test t2 = new Ex28_Test("스레드2");
//		
//		
//		t1.setOther(t2);
//		t2.setOther(t1);
//		
//		t1.start();
//		t2.start();
		
//		<Runnable 인터페이스를 구현해서 사용할 때>
		
////		1. Runnable 을 물려받은 객체 생성
//		Ex28_Test et1 = new Ex28_Test();
//		Ex28_Test et2 = new Ex28_Test();
//		
////		2. Thread 객체 생성
//		Thread t1 = new Thread(et1, "스레드1");
//		Thread t2 = new Thread(et2, "스레드2");
//		
//		
//		et1.setOther(t2);
//		et2.setOther(t1);
//		t1.start();
//		t2.start();

		
//		경쟁 조건 (여러 개의 스레드가 동시에 고유 자원에 접근하고 조작할 때 발생. 조건값이 중복되거나 실행 순서가 매번 바뀜)
		Ex28_1_Counter counter = new Ex28_1_Counter();
		Ex28_1_NumberPrinter np1 = new Ex28_1_NumberPrinter(counter, 1, 100);
		Ex28_1_NumberPrinter np2 = new Ex28_1_NumberPrinter(counter, 1, 100);
		
		Thread t1 = new Thread(np1, "스레드-1");
		Thread t2 = new Thread(np2, "스레드-2");
		t1.start();
		t2.start();
	
//	void start : 멀티 스레드 동작 (독립적 작업을 보장) -> run() 메서드를 호출하여 작업 실행
//	void run : 싱글 스레드 동작 -> 호출스택을 생성하지 않고 작업 실행 
	
	}

}

// Thread 클래스를 상속받으면 자바에서는 당일 상속만 지원하기 때문에 다른 필요한 클래스를 상속받을 수 없는 단점이 있음
//class Ex28_Test extends Thread {
 
class Ex28_Test implements Runnable{
	private Thread other;  // 필드

//	//	 <생성자호출>
//	Ex28_Test(String name) {  // 생성자
//		super(name);
//	}
	@Override
	public void run() {  //메서드
		System.out.println("쓰레드 시작");
		System.out.println("현재 쓰레드 : " + Thread.currentThread().getName());
	 if(other != null) {
		 System.out.println(other.getName() + " 쓰레드의 종료 기다리는 중");
		 try {
			other.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(other.getName() + " 쓰레드가 종료됨!");
	 }
	}
	
	public void setOther(Thread other) {  // getter/setter
		this.other = other;
	}
	// 암묵적인 작성 룰 : 필드 -> 생성자 -> 메서드 -> getter/setter 순으로 작성.
	
	
	
	
	
	
}