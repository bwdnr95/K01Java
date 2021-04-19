package ex04controlstatement;
//문제1) 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
public class Qu_04_06 {

	public static void main(String[] args) {
		
		int a= 1,b=1;
		String star="* ";
		
		while(a<=5) {
			a++;
			if(a==6) break;
			b=a-b;
			System.out.println(star);
			for(;b<=5;) {
				b++;
				System.out.print(star);
				if(a==b) break;
				
			}
			
		}	System.out.print(star);
			
		
		
				
	}

}
