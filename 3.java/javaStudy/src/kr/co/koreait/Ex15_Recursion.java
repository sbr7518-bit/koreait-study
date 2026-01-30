package kr.co.koreait;

public class Ex15_Recursion {

	public static void main(String[] args) {
			
		Ex15_Recursion re = new Ex15_Recursion();
		int result = re.sum(5);
		System.out.println(result);
		
	}
	
	
//     메서드 생성		
	public int sum(int n) {
		if (n==1) {
			return 1;
		}		 
		return n + sum(n-1);		
	} 
	
	public void test(int n) {
		if (n==0) {
			return;
		}
		System.out.println(n+" ");
		test(n-1);
		
	}
	
}
