package kr.co.koreait;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Ex08_Array {

	public static void main(String[] args) {

//		배열(Array)
//		 - 같은 자료형을 가진 값들을 하나의 변수로 관리함
//		
//		요소(Element)
//		 - 배열에 들어간 각각의 값들을 요소라고 표현
//		
//		인덱스(Index)
//		 - 배열의 요소에 접근하기 위해 사용되는 번호 (요소의 위치를 의미함)
//		 - 인덱스는 0부터 시작

		int[] arr = new int[4]; // 4만큼의 크기를 가진 배열 생성
		
		arr[0] = 10; // 0번 인덱스에 10을 넣겠다.
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		System.out.println("0번 인덱스 조회 : " + arr[0]); //0번 인덱스 요소를 조회
		System.out.println("1번 인덱스 조회 : " + arr[1]);
		System.out.println("2번 인덱스 조회 : " + arr[2]);
		System.out.println("3번 인덱스 조회 : " + arr[3]);

		
//	 	for-etch 문 (향상된 for문)
		
		for(int num : arr) {
			System.out.println(num);
		}	
		
		
		System.out.println("=======================");
		
		
		int[] numbers = new int[10];
		
//		배열의 요소에 랜덤 숫자 넣기
		for(int i=0; i<numbers.length; i++) {
//			numbers.length : 배열의 길이만큼 측정해주기 때문에 인덱스가 수정되어도 문제 없음
			numbers[i] = (int) (Math.random() * 30) + 1; 
			
		}
		 		
		
//		배열의 요소 1개씩 꺼내서 출력하기
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("=======================");	
		
//		배열의 요소 1개씩 꺼내서 짝수인것만 sum에 저장 (합계)
		int sum = 0;
		
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
			if (numbers[i]%2 == 0) {
			sum += numbers[i];
		 } 		
	}
		System.out.println("합계 : " + sum);
		
		
		int [] nums = {3, 1, 6, 2, 3, 7, 9, 1, 2};
		System.out.println("첫번째 요소 : " + nums[0]); 
		System.out.println("마지막 요소 : " + nums[nums.length-1]);
//	nums[nums.length-1]  : 마지막 요소를 바로 구하고 싶을 때  length :10 index : 0~9 이므로 -1을 넣어준다.  
	
//		nums 배열에서 가장 큰 값과 가장 작은 값 구하기
		int min = nums[0]; // integer.MAX_VALUE (같은 의미 이나 주로 이걸 더 선호함)
		int max = nums[0]; // integer.MIN_VALUE 
		
		for (int i=0; i<nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
//				max = Math.max(max, nums[i]);
			}
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		 System.out.println("가장 작은 값 : " + min);
		 System.out.println("가장 큰 값 : " + max);
		
		 System.out.println("======Arrays.--()==========");
//		================================================ 
//		Arrays.toSring()
//		 - 반복문 없이 배열의 값들을 문자열 형태로 출력해주는 메서드
		 
		 int[] numbers2 = {4, 2, 3, 1, 7, 5};
		 System.out.println(Arrays.toString(numbers2));
		 
//		 Arrays.sort()
//		 - 배열에 있는 요소를 정렬해주는 메서드 -> 오름차순 정렬
		 Arrays.sort(numbers2);
		 System.out.println(Arrays.toString(numbers2));
		 
		 Integer[] numbers3 = {4, 2, 3, 1, 7, 5}; // Integer : int(기본형)를 참조형 변환
		 Arrays.sort(numbers3, Comparator.reverseOrder()); 
		 // Comparator.reverseOrder() : 내림차순 정렬
		 
		 System.out.println(Arrays.toString(numbers3));
		 
//		 모든 결과가 양수로 나올 때가지 반복하며 계속 돌린다.
		 
		 System.out.println("==========얕은 복사==============");
		 
//		 ----------------------------------------------------
//		 얕은 복사
//		  - 배열의 주소 값만 가져와 참조하는 방식
//		  - 하나의 배열 객체를 두 변수가 함께 공유함
//		  	 > 복사된 배열에서 수정하면 원본 배열도 영향을 받음
		 
		 int[] arrCopy1 = new int[3];
		 int[] shallowCopy = arrCopy1;
		
		 shallowCopy[1] = 999;
		 System.out.println(Arrays.toString(arrCopy1));
		 System.out.println(Arrays.toString(shallowCopy));
		 
		 System.out.println("==========깊은 복사=============");
		 
//		 ----------------------------------------------------
//		 깊은 복사
//		  - 새로운 배열 객체를 생성하고 기존의 배열 데이트를 복사하는 방식
//
//		 int[] arrCopy2 = {1, 2, 3};
//		 int[] deepCopy = new int[arrCopy2.length];
//		 
//		 deepCopy[0] = arrCopy2[0];
//		 deepCopy[1] = arrCopy2[1];
//		 deepCopy[2] = arrCopy2[2];
//		 
//		 (복사할 원본 배열, 복사를 시작할 위치, 저장할 배열, 저장을 시작할 위치, 복사할 요소의 수);
//		 System.arraycopy(arrCopy2, 0, deepCopy, 0, arrCopy2.length);
//		                   arr, 어떤걸 저장할건지, deep, 어디서부터 저장할건지, 복사를 몇개 할거냐 
		 
		 
		 int[] arrCopy2 = {1, 2, 3};
		 int[] deepCopy =Arrays.copyOf(arrCopy2, arrCopy2.length);
//		                              (   원본  ,    복사할 길이);

		 
		 
		 
		 
	}

}
