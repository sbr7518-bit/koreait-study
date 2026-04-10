package kr.co.training;

public class Ex21_1_Order {
	
//	number, amount, status 필드를 가집니다.
//	 - 접근제어자 : private
//	 - number, status 문자열 /  amount 실수형
	
	private String number;
	private double amount;
	private String status;
	
//	필드 3개에 대한 getter / setter
//	 - amount 필드의 setter 에서 주문 금액이 100.0 미만일 경우
//     "유효하지 않은 금액입니다." 출력
//	 - 동일하게 amount 필드의 setter 에서 주문 금액이 100.0 이상일 경우
//	   "주문 번호 : 000, 주문 금액 : 000, 주문 상태 : 000"
	
	public void setNumber(String number) {
		this.number = number;
	}
	public void setAmount(double amount) {
		if(amount<100.0) {
			System.out.println("유효하지 않은 금액입니다.");
			this.amount = 0;
		} else if (amount >= 100.0) {
			System.out.printf("주문 번호 : %s, 주문 금액 : %.1f, 주문 상태 : %s", number, amount,status);
			this.amount = amount;
		}
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getNumber() {
		return number;
	}
	public double getAmount() {
		return amount;
	}
	public String getStatus() {
		return status;
	}

	
//	주문 번호(number), 주문 금액(amount), 주문 상태(status)
//	 ex) "ORDER3" , 120.5, "결제완료"
		
	
	

}
