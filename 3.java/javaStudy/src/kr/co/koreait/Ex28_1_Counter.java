package kr.co.koreait;


//  상태 값 클래스
public class Ex28_1_Counter {
	private int count = 0;
	
//	synchronized (모니터 락) : 다른 스레드가 실행되고 있는 스레드의 접근을 막고 실행이 끝난 뒤 다른 스레드가 실행 될 수 있도록 함)
	public synchronized void increment() {
		count++;
	}
	public int getCount() {
		return count;
	}
	
	
	
	

}
