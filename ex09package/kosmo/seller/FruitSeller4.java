package ex09package.kosmo.seller;
/*
 Buyer, Seller 클래스를 외부 패키지에 묶어 정의 하였으므로
 아래와 같이 import처리 후 사용할 수 있다.
 */

public class FruitSeller4 {
	//과일 판매자를 추상화 한 클래스
	
		
		//멤버변수
		int numOfApple; //판매자의 사과 보유 갯수
		int myMoney; // 판매수익
		final int APPLE_PRICE ;//사과의 단가
		/*
		 상수는 값의 변경이 불가능하고, 단 한번만 초기화되기 때문에
		 일반 멤버메소드에서는 초기화 할 수 없다.
		 하지만 생성자 메소드는 객체 생성시 한번만 호출되고, 개발자가
		 마음대로 호출할 수 없으므로 한번 이상 초기화 되지 않음이 보장된다.
		 따라서 멤버상수는 생성자 메소드에서는 초기화 할 수 있다.	
		 */
		
		public FruitSeller4(int money, int appleNum, int price) {
			myMoney = money;
			numOfApple = appleNum;
			APPLE_PRICE = price;
		}
		
		public int saleApple(int money)	{
			int num = money / APPLE_PRICE;
			numOfApple -= num;
			myMoney += money;
			return num;
		}
		//판매자의 현재 상태를 출력한다.
		public void showSaleResult() {
			System.out.println("[판매자]남은사과갯수:"+ numOfApple);
			System.out.println("[판매자]판매수익:"+ myMoney);
		}
	}


