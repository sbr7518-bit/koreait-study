package kr.co.training;

import java.util.Scanner;

public class Ex18_Main {

	public static void main(String[] args) {

		Ex18_1_Buy buy = new Ex18_1_Buy(100000);
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("========상품 품목========");
			System.out.println("1. 모니터");
			System.out.println("2. 마우스");
			System.out.println("3. 데스크탑");
			System.out.println("4. 잔액 조회");
			System.out.println("0. 종료");
			System.out.println("번호를 입력하세요 : ");

			int product = sc.nextInt();

			if(product == 0) {
				System.out.println("구매를 종료합니다.");
				break;
			}

			if(product == 1) {
				buy.buyMonitor();
			} else if (product == 2) {
				buy.buyMouse();
			} else if (product == 3) {
				buy.buyDesktop();
			} else if (product == 4) {
				System.out.println("최종잔액 : " + buy.getBalance() +  "원");
			} else {
				System.out.println("잘못된 번호입니다.");
			}

			System.out.println();

		}



	}

}
