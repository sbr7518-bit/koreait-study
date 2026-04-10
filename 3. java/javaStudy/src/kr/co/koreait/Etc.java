package kr.co.koreait;

import java.util.Arrays;

public class Etc {

	public static void main(String[] args) {

		Etc e = new Etc();
		int num = 10;

		System.out.println("메서드 호출 전 : " + num); // 첫번째

		e.changInt(num);  // 값만 메서드 매개변수에 던져준다. (int num = 10) 

		System.out.println("메서드 호출 후 : " + num); 

		System.out.println("=====================================");
//		---------------------------------------------------------------

		int[] numArr = {1,2,3};
		System.out.println("메서드 호출 전 : " + Arrays.toString(numArr));

		e.changeArr(numArr);

		System.out.println("메서드 호출 후 : " + numArr);
	}

	//	---------------메서드 생성란--------------------------

	//  매개변수 명은 값으로 넘어오기 때문에 다른명으로 입력해도 상관이 없다.	
	public void changInt(int number) {
		number = 1000;
		System.out.println("메서드 호출 : " + number);
	}

	public void changeArr(int[] numbers) {
		numbers[0] = 990;
		System.out.println("메서드 호출 : " + Arrays.toString(numbers));
	}
  
}
