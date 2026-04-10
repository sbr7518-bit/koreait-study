package kr.co.training_Home;

public class if_문제 {
	
	public static void main(String[] args) {

//		점수를 입력받아 60점 이상이면 "합격", 아니면 "불합격" 출력
		
		int score = 60; 
		
		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		int num = 9;
		if(num %2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		System.out.println(add(50,30));
		add1(50,30); //얘는 출력안됨  (리턴하는 방법으로 변경했기 때문)
		
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static void add1(int x, int y) {
		System.out.println(x + y);
	}
	
	
}
