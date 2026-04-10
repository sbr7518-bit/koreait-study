package kr.co.koreait;

public class Ex26_1_Unchecked {

	public static void main(String[] args) {
		try {
			ExceptionTest.uncheckdMethod();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생!");
		}
	}
}
class ExceptionTest {
	public static void uncheckdMethod() { // 만약 throws ~~ 가 적혀있다면 개발자가 알아보기 위해 일부러 작성한 것
//		 UncheckedException (선택 예외)
//		 throws 를 작성하지 않아도 'uncheckd ~~~~'은 예외가 자동으로 전파 됨.
		throw new ArrayIndexOutOfBoundsException();
	}
}