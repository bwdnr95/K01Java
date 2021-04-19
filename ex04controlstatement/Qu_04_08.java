package ex04controlstatement;
/*
 문제3) 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
 * * * * *
 * * * *
 * * *
 * *
 *

 */
public class Qu_04_08 {

	public static void main(String[] args) {
		int a=0;
		int b;
			
		String star="* ";
		while(a<=5) {
			a++;
			b=5;
			b=b-a;
			if(a>5) break;
			System.out.print(star);
			for(;b>=1;) {
				b--;
				System.out.print(star);
				
			
			}System.out.println();
			
			
		}
		
	}

}
