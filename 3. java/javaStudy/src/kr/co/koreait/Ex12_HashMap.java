package kr.co.koreait;

import java.util.HashMap;

public class Ex12_HashMap {

	public static void main(String[] args) {

		
//		HashMap
//		 - key-value 형태를 가진 자료구조
//		 - 순서 보장하지 않음
//		 - 키는 중복 허용 x, 값은 중복 허용 o
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("키1", 10);		
		map.put("키2", 20);		
		map.put("키3", 30);		
		map.put("키1", 40);
		
		map.remove("키2");
		
		
		System.out.println(map);
		System.out.println(map.get("키1")); // 내가 가져올 값인 "키1"를 직접 입력해야함
		
		System.out.println(map.keySet());  // 키를 배열 형태[]로 반환
		
//      for-etch문을 사용                                   	 
		for(String key : map.keySet()) {
			System.out.println("Key : " + key + ", Value : " +  map.get(key));
		}
			
		System.out.println(map.values());  // 값을 배열 형태[]로 반환
		
		for(Integer value : map.values()) {
			System.out.println(value);
		}
		
		
		
		
	}

}
