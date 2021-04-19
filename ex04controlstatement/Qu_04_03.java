package ex04controlstatement;

import java.util.Scanner;

public class Qu_04_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어:" );
		int kor = scanner.nextInt();
		System.out.print("영어:" );
		int eng = scanner.nextInt();
		System.out.print("수학:" );
		int math = scanner.nextInt();
		
		int avg=(kor+eng+math)/3;
		System.out.println("평균점수:"+avg);
		
		int Agrade =(avg%90);
		int Bgrade =(avg%80);
		int Cgrade =(avg%70);
		int Dgrade =(avg%60);
		
		if(avg>=90) {
			switch(Agrade) {
			case 1:
				System.out.println("학점:A");
			default:
				System.out.println("학점:A");
		
		
			}
		}
		else if(avg>=80) {
			switch(Bgrade) {
			case 1:
				System.out.println("학점:B");
			default:
				System.out.println("학점:B");
			}
		}
		else if(avg>=70) {
			switch(Cgrade) {
			case 1:
				System.out.println("학점:C");
			default:
				System.out.println("학점:C");
				
			}
		}
		else if(avg>=60) {
			switch(Dgrade) {
			case 1:
				System.out.println("학점:D");
			default :
				System.out.println("학점:D");
			}
		}
		else {
			System.out.println("학점:F");
		}
		
	}

}
