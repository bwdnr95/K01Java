package ex09package.kosmo.buyer;

import ex09package.kosmo.seller.FruitSeller4;
/*
 해당 클래스에서는
 buyApple(FruitSeller4 seller, int money)메소드를 호출할 때
 매개변수로 FruitSeller4 타입을 사용한다. 따라서 해당 클래스를
 반드시 import 처리해야한다.
 */
public class FruitBuyer4 {
	//구매자를 표현한 클래스
	
		
		int myMoney ;
		int numOfApple;
		
		//생성자 메소드
		public FruitBuyer4(int _myMoney, int _numOfApple) {
			myMoney = _myMoney;
			numOfApple = _numOfApple;
		}
		
		public void buyApple(FruitSeller4 seller, int money) {
			numOfApple += seller.saleApple(money);
			myMoney -= money;
		}
		//구매자의 현재 상태 출력
		public void showBuyResult() {
			System.out.println("[구매자]현재잔액:"+ myMoney);
			System.out.println("[구매자]사과갯수:"+ numOfApple);
		}
	}


