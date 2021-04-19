package ex04controlstatement;

/*
 while문
 	: 반복의 횟수가 정해져있지 않을 때 주로 사용하는
 	반복문이다. 반복의 횟수가 명확할 때는 주로 for문을
 	사용한다.
 	형식]
 		반복을 위한 변수의 초기값 선언;
 		while(반복의조건){
 			실행문;
 			변수의 증감식; <= 반복문 탈출을 위한 연산
		}
		반복의 조건이 false일때 while문을 탈출한다.
		※반복문의 처음으로 돌아가면 무조건 반복의 조건을 확인한다.
 */
public class E03While {
	public static void main(String[] args) {
		
		//수열의 합을 구하기 위한 변수선언. 증가하는 i를 누적해서 더함.
		int sum= 0;
		//반복을 위한 변수선언.
		int i=1;
		while(i<=10) { //반복의 조건 설정
			sum += i; //증가하는 i를 sum에 누적해서 더함(1+2+3...)
			i++;//while문을 탈출하기 위한 조건을 위한 증가연산
		}
		System.out.println("1~10까지의합은:"+ sum);
		
		/*
		 시나리오] 구구단을 출력하는 프로그램을 작성하시오.
		 단 while문을 이용하시오.
		 */
		
		int dan = 2; //단
		while(dan<=9) { // 단은 2~9까지 증가한다.
			int su=1;//수(하나의 단을 출력한 후 증가하면 수는 1로 초기화된다.)
			while(su<=9) {//수는 1~9까지 증가한다.
				//서식에맞춰 출력할때는 printf문이 좀 더 유리하다.
				System.out.printf("%-2d*%-2d=%2d",dan,su,(dan*su));
				//System.out.print(dan+"*"+su+"="+(dan*su));
				System.out.print(" ");
				su++;
				
			}
			System.out.println();
			dan++;
		}
		
		
		int m=1;
		while(m<=4) {//행으로 4번 반복
			
			int n=1;
			while(n<=4) {//열을 4번 반복
				
				if(m==n)
					System.out.print("1 ");
				else
				System.out.print("0 ");
				n++;
			}
			System.out.println();//한 행을 출력한 후 줄바꿈처리
			m++;
		}
	}
}
