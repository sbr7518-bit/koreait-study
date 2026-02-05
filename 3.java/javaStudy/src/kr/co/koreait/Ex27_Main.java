package kr.co.koreait;

public class Ex27_Main {

	public static void main(String[] args) {

		Util u = new Util();
		u.printItem("한국");
		u.printItem(23);
		u.printItem(3.14);
		u.printItem(true);
		
		
//		 꺽세 <> 넣어주면 좋다.
 		Box<String> box = new Box<>();
		box.setItem("회복물약");
		System.out.println(box.getItem());

	}

}

// T : Type (타입)
// E : Element (요소)
//	- ArrayList<E> : 요소를 제네릭으로 받겠다.
// K : Key (키)
// V : Value (값)
//	- HashMap<K,V> : 키는 'Key'라는 이름으로, 값은 'Value'라는 이름

// 클래스에 제네릭을 사용하면 클래스에 들어오는 모든 타입을 하나로 통일 시키게 만듬. -> 만약 'Integer'로 사용하면 모든 메서드 타입은 'Integer'가 됨.
class Box<T> {
	private T item;
	
	public void setItem(T item) {
		this.item = item;
	}	
	public T getItem() {
		return item;
	}
}




// 제네릭 사용하는 방법 <> : 메서드에 불러오는 매개변수 타입이 뭐가 오는지 알 수 없을 때 사용 
//  <T>로 지정했으면 자료형에 같은 T로 입력해야함.
//  배열 사용시 : 기본형 안됨. 참조형으로 작성해야함. int X, Integer O
//  클래스 안에서 특정 메서드만 제네릭을 사용할 때 하는 방법.
class Util	{
	public <T> void printItem(T item) {
//		   <T> : 이 메서드에서 사용할 제네릭 이름은 T를 사용하겠다.
		System.out.println("아이템 : " + item);
	}
	
//	 (리턴으로 반환하고 싶을때)
//	class Util	{
//    public <T> T printItem(T item) {
//		     <T> : 이 메서드에서 사용할 제네릭 이름은 T를 사용하겠다.
//		 System.out.println("아이템 : " + item);
//		 return item;
//	  }


}